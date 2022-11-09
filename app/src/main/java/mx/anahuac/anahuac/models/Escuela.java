package mx.anahuac.anahuac.models;

import java.util.List;

public class Escuela {
    private String code;
    private String name;
    private List<Licenciatura> licenciaturaList;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Licenciatura> getLicenciaturaList() {
        return licenciaturaList;
    }

    public void setLicenciaturaList(List<Licenciatura> licenciaturaList) {
        this.licenciaturaList = licenciaturaList;
    }
}
