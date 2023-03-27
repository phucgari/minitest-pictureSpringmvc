package services;

import model.Picture;

import java.util.List;

public interface GenericServices {
    List<Picture> showAll();
    Picture show1(int index);
    void save(Picture picture);
    void delete(int index);
}
