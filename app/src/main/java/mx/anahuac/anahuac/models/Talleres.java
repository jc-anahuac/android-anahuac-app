package mx.anahuac.anahuac.models;

import java.util.List;

public class Talleres {

    private int image;
    private String name;

    private List<Talleres> talleresList;

    public Talleres (int image, String name){
        this.image = image;
        this.name = name;
    }
    public int getImage() {return image;}
    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Talleres> getTalleresList() {return talleresList;}

    public void setTalleresList(List<Talleres> talleresList){
        this.talleresList = talleresList;
    }
}
