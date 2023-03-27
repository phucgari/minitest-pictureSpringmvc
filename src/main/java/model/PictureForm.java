package model;

import org.springframework.web.multipart.MultipartFile;

public class PictureForm {
    int id;
    String code;
    int height;
    int width;
    String material;
    String description;
    int price;
    MultipartFile picture;
    public PictureForm() {
    }

    public PictureForm(int id, String code, int height, int width, String material, String description, int price, MultipartFile picture) {
        this.id = id;
        this.code = code;
        this.height = height;
        this.width = width;
        this.material = material;
        this.description = description;
        this.price = price;
        this.picture = picture;
    }

    public PictureForm(int id, String code, int height, int width, String material, String description, int price) {
        this.id = id;
        this.code = code;
        this.height = height;
        this.width = width;
        this.material = material;
        this.description = description;
        this.price = price;
    }

    public MultipartFile getPicture() {
        return picture;
    }

    public void setPicture(MultipartFile picture) {
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
