package mx.anahuac.anahuac.models;

import java.util.ArrayList;
import java.util.List;

import mx.anahuac.anahuac.R;

public class Caracteristica {

    private int image;
    private int description;

    public Caracteristica(int image, int description){
        this.image = image;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public static List<Caracteristica> all(){
        final List<Caracteristica> list = new ArrayList<>();

        list.add(new Caracteristica(R.drawable.ic_porque_1, R.string.porque_1));
        list.add(new Caracteristica(R.drawable.ic_porque_2, R.string.porque_2));
        list.add(new Caracteristica(R.drawable.ic_porque_3, R.string.porque_3));
        list.add(new Caracteristica(R.drawable.ic_porque_4, R.string.porque_4));
        list.add(new Caracteristica(R.drawable.ic_porque_5, R.string.porque_5));
        list.add(new Caracteristica(R.drawable.ic_porque_6, R.string.porque_6));

        return list;
    }
}
