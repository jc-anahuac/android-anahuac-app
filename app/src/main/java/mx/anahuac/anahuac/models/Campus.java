package mx.anahuac.anahuac.models;

import java.util.ArrayList;
import java.util.List;

import mx.anahuac.anahuac.R;

public class Campus {
    private String code;
    private int image;
    private String nombre;
    private String slogan;
    private String description;
    private String urlVideo;
    private int map;
    private List<Licenciatura> licenciaturaList;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public int getMap() {
        return map;
    }

    public void setMap(int map) {
        this.map = map;
    }

    public void setLicenciaturaList(List<Licenciatura> licenciaturaList) {
        this.licenciaturaList = licenciaturaList;
    }

    public List<Licenciatura> getLicenciaturaList() {
        return licenciaturaList;
    }

    public static List<Campus> getCampus() {
        List<Campus> campus = new ArrayList<>();

        Campus item1 = new Campus();
        item1.setCode("cun");
        item1.setNombre("Cancún");
        item1.setImage(R.drawable.ic_campus_cancun);

        Campus item2 = new Campus();
        item2.setCode("cdmx_norte");
        item2.setNombre("Ciudad de México Norte");
        item2.setImage(R.drawable.ic_campus_mx_norte);

        campus.add(item1);
        campus.add(item2);

        return campus;
    }

    public static Campus findByCode(String code){
        Campus campus = null;
        for(Campus c : getCampus()){
            if(c.code.equals(code)){
                campus = c;
                break;
            }
        }
        return campus;
    }
}
