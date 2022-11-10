package mx.anahuac.anahuac.models;

import java.util.List;

public class Escuela {

    private String name;
    private int image;

    private List<Licenciatura> licenciaturaList;

    public Escuela(String name, int image){
        this.name = name;
        this.image = image;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage(){return image; }

    public void setImage(int image) {
        this.image = image;
    }

    public List<Licenciatura> getLicenciaturaList() {
        return licenciaturaList;
    }

    public void setLicenciaturaList(List<Licenciatura> licenciaturaList) {
        this.licenciaturaList = licenciaturaList;
    }

}
