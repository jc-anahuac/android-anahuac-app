package mx.anahuac.anahuac.models;

import java.util.List;

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
}
