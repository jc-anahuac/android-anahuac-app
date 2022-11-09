package mx.anahuac.anahuac.models;

import java.util.ArrayList;
import java.util.List;

import mx.anahuac.anahuac.R;

public class Licenciatura {
    private String code;
    private int imageHome;
    private String name;
    private int imageDetail;
    private String about;
    private String urlVideo;
    private String profile;
    private int imageProfile;
    private String activity;
    private int imageActivity;
    private String planEstudio;
    private int imageList;

    public int getImageHome() {
        return imageHome;
    }

    public void setImageHome(int imageHome) {
        this.imageHome = imageHome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageDetail() {
        return imageDetail;
    }

    public void setImageDetail(int imageDetail) {
        this.imageDetail = imageDetail;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int getImageProfile() {
        return imageProfile;
    }

    public void setImageProfile(int imageProfile) {
        this.imageProfile = imageProfile;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getImageActivity() {
        return imageActivity;
    }

    public void setImageActivity(int imageActivity) {
        this.imageActivity = imageActivity;
    }

    public String getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(String planEstudio) {
        this.planEstudio = planEstudio;
    }

    public void setImageList(int imageList) {
        this.imageList = imageList;
    }

    public int getImageList() {
        return imageList;
    }

    public static List<Licenciatura> getLicenciaturas(){
        ArrayList list = new ArrayList();

        Licenciatura multimedia = new Licenciatura();
        multimedia.setName("Diseño Multimedia");
        multimedia.setImageHome(R.drawable.lic_disenio);

        Licenciatura arqui = new Licenciatura();
        arqui.setImageHome(R.drawable.lic_arquitectura);
        arqui.setName("Arquitectura");

        Licenciatura biotech = new Licenciatura();
        biotech.setImageHome(R.drawable.lic_biotecnologia);
        biotech.setName("Biotecnología");

        list.add(multimedia);
        list.add(arqui);
        list.add(biotech);

        return list;
    }
}
