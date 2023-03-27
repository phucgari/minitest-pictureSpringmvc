package services;

import model.Picture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PictureServices implements GenericServices{
    private static final Map<Integer,Picture> list=new HashMap<>();
    static {
        list.put(1,new Picture(1,"sdafsdaf",200,100,"material","description",100));
        list.put(2,new Picture(2,"sdffdss",111,444,"tewtterw","iyuiyui",200));
        list.put(3,new Picture(3,"gfdghjgf",222,333,"gfdfdg","tyuytu",300));
        list.put(4,new Picture(4,"iyuiyui",333,222,"ddddssd","ghjghjgh",400));
        list.put(5,new Picture(5,"hjkhll",444,111,"sdfgdsg","hjjjjhgj",500));
    }
    @Override
    public List<Picture> showAll() {
        return new ArrayList<>(list.values());
    }

    @Override
    public Picture show1(int index) {
        return list.get(index);
    }

    @Override
    public void save(Picture picture) {
        list.put(picture.getId(), picture);
    }

    @Override
    public void delete(int index) {
        list.remove(index);
    }
}
