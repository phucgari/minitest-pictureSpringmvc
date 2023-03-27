package controller;


import model.Picture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import services.GenericServices;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/picture")
public class PictureController {
    @Autowired
    GenericServices services;
    @Value("${file-upload}")
    private String fileUpload;

    @GetMapping("")
    public String getIndex(Model model){
        model.addAttribute("pictures",services.showAll());
        return "/index";
    }
    @GetMapping("/create")
    public String showCreateForm(Model model){
        Picture p = new Picture();
        p.setId((int) (Math.random()*99999));
        model.addAttribute("picture", p);
        return "/create";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Picture picture,@RequestParam(name="img") MultipartFile multipartFile){
        String fileName = multipartFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(multipartFile.getBytes(), new File(fileUpload + fileName));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        picture.setPicture(fileName);
        services.save(picture);
        return "redirect:/picture";
    }
    @GetMapping("/edit/{id}")
    public String showEditForm(Model model, @PathVariable int id){
        Picture p=services.show1(id);
        model.addAttribute("picture",p);
        return "/update";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        services.delete(id);
        return "redirect:/picture";
    }
    @GetMapping("/view/{id}")
    public String view(@PathVariable int id,Model model){
        model.addAttribute("picture",services.show1(id));
        return "/show1";
    }
}
