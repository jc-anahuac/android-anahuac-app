package mx.anahuac.anahuac.models;

import java.util.List;

public class Conferencistas {

    private int image;
    private String name;

    private List<Conferencistas> conferencistasList;

    public Conferencistas(int image, String name){
        this.image = image;
        this.name = name;
    }
    public int getImage(){return image;}
    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Conferencistas> getConferencistasList() {
        return conferencistasList;
    }

    public void setConferencistasList(List<Conferencistas> conferencistasList) {
        this.conferencistasList = conferencistasList;
    }
}
