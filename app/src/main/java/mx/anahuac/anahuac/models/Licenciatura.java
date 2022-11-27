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
    private int profile;
    private int imageProfile;
    private int activity;
    private int imageActivity;
    private int planEstudio;
    private int imageList;
    private String escuelaCode;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setEscuelaCode(String escuelaCode) {
        this.escuelaCode = escuelaCode;
    }

    public String getEscuelaCode() {
        return escuelaCode;
    }

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

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public int getImageProfile() {
        return imageProfile;
    }

    public void setImageProfile(int imageProfile) {
        this.imageProfile = imageProfile;
    }

    public int getActivity() {
        return activity;
    }

    public void setActivity(int activity) {
        this.activity = activity;
    }

    public int getImageActivity() {
        return imageActivity;
    }

    public void setImageActivity(int imageActivity) {
        this.imageActivity = imageActivity;
    }

    public int getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(int planEstudio) {
        this.planEstudio = planEstudio;
    }

    public void setImageList(int imageList) {
        this.imageList = imageList;
    }

    public int getImageList() {
        return imageList;
    }

    public static Licenciatura getLicenciaturaByCode(String code){
        Licenciatura item = null;
        for (Licenciatura lic: getLicenciaturas()){
            if (lic.getCode().equals(code)){
                item = lic;
                break;
            }
        }
        return item;
    }

    public static List<Licenciatura> getLicenciaturasBySchool(String code){
        ArrayList list = new ArrayList();
        for (Licenciatura item: getLicenciaturas()){
            if (item.getEscuelaCode() != null && item.getEscuelaCode().equals(code)){
                list.add(item);
            }
        }

        return list;
    }


    public static List<Licenciatura> getLicenciaturas(){
        ArrayList list = new ArrayList();

        //ESCUELA DE DISEÑO
        Licenciatura grafico = new Licenciatura();
        grafico.setCode("lic_grafico");
        grafico.setName("Diseño Grafico");
        grafico.setEscuelaCode("es_dis");
        grafico.setImageHome(R.drawable.lic_disenio);
        grafico.setImageList(R.drawable.lic_grafico);
        grafico.setProfile(R.string.profile_grafico);
        grafico.setImageProfile(R.drawable.diseno_multimedia_perfil);
        grafico.setImageDetail(R.drawable.diseno_grafico);
        grafico.setPlanEstudio(R.string.list_studyplan_grafico);
        grafico.setActivity(R.string.descripcion_activities_grafico);
        grafico.setImageActivity(R.drawable.diseno_grafico_activity);

        Licenciatura industrial = new Licenciatura();
        industrial.setCode("lic_industrial");
        industrial.setName("Diseño Industrial");
        industrial.setEscuelaCode("es_dis");
        industrial.setImageHome(R.drawable.lic_disenio);
        industrial.setImageList(R.drawable.lic_industrial);
        industrial.setImageDetail(R.drawable.diseno_industrial);
        industrial.setPlanEstudio(R.string.list_studyplan_industrial);
        industrial.setActivity(R.string.descripcion_activities_industrial);
        industrial.setProfile(R.string.profile_industrial);
        industrial.setImageProfile(R.drawable.diseno_industrial_profile);
        industrial.setImageActivity(R.drawable.diseno_industrial_activity);

        Licenciatura multimedia = new Licenciatura();
        multimedia.setCode("lic_multimedia");
        multimedia.setName("Diseño Multimedia");
        multimedia.setEscuelaCode("es_dis");
        multimedia.setImageHome(R.drawable.lic_disenio);
        multimedia.setImageList(R.drawable.lic_multimedia);
        multimedia.setProfile(R.string.descripcion_perfil);
        multimedia.setActivity(R.string.descripcion_activities);
        multimedia.setPlanEstudio(R.string.list_studyplan);
        multimedia.setImageProfile(R.drawable.diseno_multimedia_perfil);
        multimedia.setImageActivity(R.drawable.diseno_activity);
        multimedia.setImageDetail(R.drawable.diseno_multimedia);

        Licenciatura modas = new Licenciatura();
        modas.setCode("lic_modas");
        modas.setName("Diseño de Moda e Innovación");
        modas.setEscuelaCode("es_dis");
        modas.setImageHome(R.drawable.lic_disenio);
        modas.setImageList(R.drawable.lic_modas);
        modas.setProfile(R.string.profile_modas);
        modas.setActivity(R.string.descripcion_activities_modas);
        modas.setImageDetail(R.drawable.diseno_modas);
        modas.setPlanEstudio(R.string.list_studyplan_modas);
        modas.setImageProfile(R.drawable.diseno_modas_profile);
        modas.setImageActivity(R.drawable.diseno_modas_activity);



        //ESCUELA DE ARQUITECTURA
        Licenciatura arqui = new Licenciatura();
        arqui.setImageHome(R.drawable.lic_arquitectura);
        arqui.setImageList(R.drawable.lic_multimedia);
        arqui.setName("Arquitectura");
        arqui.setEscuelaCode("es_arqui");
        arqui.setCode("lic_arqui");
        arqui.setImageDetail(R.drawable.arquitectura);
        arqui.setImageProfile(R.drawable.arquitectura_profile);
        arqui.setImageActivity(R.drawable.arquitectura_activities);
        arqui.setProfile(R.string.profile_arquitectura);
        arqui.setActivity(R.string.descripcion_activities_arquitectura);
        arqui.setPlanEstudio(R.string.list_studyplan_arquitectura);


        //ESCUELA DE BIOTECNOLOGIA
        Licenciatura biotech = new Licenciatura();
        biotech.setImageHome(R.drawable.lic_biotecnologia);
        biotech.setImageList(R.drawable.lic_biotecnologia);
        biotech.setName("Biotecnología");
        biotech.setEscuelaCode("es_bio");
        biotech.setCode("lic_bio");
        biotech.setImageDetail(R.drawable.biotecnologia);
        biotech.setImageProfile(R.drawable.biotecnologia_profile);
        biotech.setImageActivity(R.drawable.biotecnologia_activities);
        biotech.setProfile(R.string.profile_biotecnologia);
        biotech.setActivity(R.string.descripcion_activities_biotecnologia);
        biotech.setPlanEstudio(R.string.list_studyplan_biotecnologia);


        //ESCUELA DE DERECHO
        Licenciatura derecho = new Licenciatura();
        derecho.setImageHome(R.drawable.lic_biotecnologia);
        derecho.setImageList(R.drawable.lic_derecho);
        derecho.setName("Derecho");
        derecho.setEscuelaCode("es_der");
        derecho.setCode("lic_der");
        derecho.setImageDetail(R.drawable.derecho);
        derecho.setImageProfile(R.drawable.derecho_profile);
        derecho.setImageProfile(R.drawable.derecho_activities);
        derecho.setProfile(R.string.profile_derecho);
        derecho.setActivity(R.string.descripcion_activities_derecho);
        derecho.setPlanEstudio(R.string.list_studyplan_derecho);


        Licenciatura relinter = new Licenciatura();
        relinter.setImageHome(R.drawable.lic_biotecnologia);
        relinter.setImageList(R.drawable.lic_relacionesinter);
        relinter.setName("Relaciones Internacionales");
        relinter.setEscuelaCode("es_der");
        relinter.setCode("lic_relint");
        relinter.setImageDetail(R.drawable.relinter);
        relinter.setImageProfile(R.drawable.relinter_profile);
        relinter.setImageActivity(R.drawable.relinter_activities);
        relinter.setProfile(R.string.profile_relinter);
        relinter.setActivity(R.string.descripcion_activities_relinter);
        relinter.setPlanEstudio(R.string.list_studyplan_relinter);

        //ESCUELA DE FISIOTERAPIA
        Licenciatura fisio = new Licenciatura();
        fisio.setImageHome(R.drawable.lic_fisio);
        fisio.setImageList(R.drawable.lic_fisio);
        fisio.setName("Fisioterapia");
        fisio.setEscuelaCode("es_fis");
        fisio.setCode("lic_fisio");
        fisio.setImageDetail(R.drawable.fisio);
        fisio.setImageProfile(R.drawable.fisio_profile);
        fisio.setImageActivity(R.drawable.fisio_activities);
        fisio.setProfile(R.string.profile_fisio);
        fisio.setActivity(R.string.profile_fisio);
        fisio.setPlanEstudio(R.string.list_studyplan_fisio);

        //ESCUELA DE INGENIERIA
        Licenciatura engman = new Licenciatura();
        engman.setImageHome(R.drawable.lic_biotecnologia);
        engman.setImageList(R.drawable.lic_engineering);
        engman.setName("Engineering Management");
        engman.setEscuelaCode("es_ing");
        engman.setCode("lic_engman");
        engman.setImageDetail(R.drawable.eng_engman);
        engman.setImageProfile(R.drawable.engman_profile);
        engman.setImageActivity(R.drawable.engman_activities);
        engman.setProfile(R.string.profile_engman);
        engman.setActivity(R.string.descripcion_activities_engman);
        engman.setPlanEstudio(R.string.list_studyplan_engman);

        Licenciatura ingamb = new Licenciatura();
        ingamb.setImageHome(R.drawable.lic_biotecnologia);
        ingamb.setImageList(R.drawable.lic_ingamb);
        ingamb.setName("Ingeniería Ambiental");
        ingamb.setEscuelaCode("es_ing");
        ingamb.setCode("lic_ingamb");
        ingamb.setImageDetail(R.drawable.ingamb);
        ingamb.setImageProfile(R.drawable.ingamb_profile);
        ingamb.setProfile(R.string.profile_ingamb);
        ingamb.setActivity(R.string.descripcion_activities_ingamb);
        ingamb.setPlanEstudio(R.string.list_studyplan_ingamb);

        Licenciatura ingciv = new Licenciatura();
        ingciv.setImageHome(R.drawable.lic_biotecnologia);
        ingciv.setImageList(R.drawable.lic_ingcivil);
        ingciv.setName("Ingeniería Civil");
        ingciv.setEscuelaCode("es_ing");
        ingciv.setCode("lic_ingciv");
        ingciv.setImageDetail(R.drawable.ingciv);
        ingciv.setImageProfile(R.drawable.engman_profile);
        ingciv.setImageActivity(R.drawable.inciv_activities);
        ingciv.setProfile(R.string.profile_ingciv);
        ingciv.setActivity(R.string.descripcion_activities_ingciv);
        ingciv.setPlanEstudio(R.string.list_studyplan_ingciv);

        Licenciatura ingind = new Licenciatura();
        ingind.setImageHome(R.drawable.lic_biotecnologia);
        ingind.setImageList(R.drawable.lic_ingind);
        ingind.setName("Ingeniería Industrial para la \n Dirección");
        ingind.setEscuelaCode("es_ing");
        ingind.setCode("lic_ingind");
        ingind.setImageDetail(R.drawable.eng_engman);
        ingind.setImageProfile(R.drawable.engman_profile);
        ingind.setImageActivity(R.drawable.engman_activities);
        ingind.setProfile(R.string.profile_engman);
        ingind.setActivity(R.string.descripcion_activities_engman);
        ingind.setPlanEstudio(R.string.list_studyplan_engman);

        //ESCUELA DE ARTES
        Licenciatura musica = new Licenciatura();
        musica.setImageHome(R.drawable.lic_disenio);
        musica.setImageList(R.drawable.lic_musica);
        musica.setName("Música Contemporánea");
        musica.setEscuelaCode("es_artes");
        musica.setCode("lic_musica");
        musica.setImageDetail(R.drawable.musica);
        musica.setImageProfile(R.drawable.musica_profile);
        musica.setImageActivity(R.drawable.musica_activities);
        musica.setProfile(R.string.profile_musica);
        musica.setActivity(R.string.descripcion_activities_musica);
        musica.setPlanEstudio(R.string.list_studyplan_musica);

        //ESCUELA DE COMUNICACION
        Licenciatura comunicacion = new Licenciatura();
        comunicacion.setImageHome(R.drawable.lic_biotecnologia);
        comunicacion.setImageList(R.drawable.lic_comu);
        comunicacion.setName("Comunicación");
        comunicacion.setEscuelaCode("es_comu");
        comunicacion.setCode("lic_comunicacion");
        comunicacion.setImageDetail(R.drawable.comunicacion);
        comunicacion.setImageProfile(R.drawable.comunicacion_profile);
        comunicacion.setImageActivity(R.drawable.comunicacion_activities);
        comunicacion.setProfile(R.string.profile_comunicacion);
        comunicacion.setActivity(R.string.descripcion_activities_comunicacion);
        comunicacion.setPlanEstudio(R.string.list_studyplan_comunicacion);

        Licenciatura communication = new Licenciatura();
        communication.setImageHome(R.drawable.lic_biotecnologia);
        communication.setImageList(R.drawable.lic_comunication);
        communication.setName("Communication");
        communication.setEscuelaCode("es_commu");
        comunicacion.setCode("lic_communication");
        comunicacion.setImageDetail(R.drawable.comunicacion);
        comunicacion.setImageProfile(R.drawable.comunicacion_profile);
        comunicacion.setImageActivity(R.drawable.comunicacion_activities);
        comunicacion.setProfile(R.string.profile_comunicacion);
        comunicacion.setActivity(R.string.descripcion_activities_comunicacion);
        comunicacion.setPlanEstudio(R.string.list_studyplan_comunicacion);

        Licenciatura entretenimiento = new Licenciatura();
        entretenimiento.setImageHome(R.drawable.lic_biotecnologia);
        entretenimiento.setImageList(R.drawable.lic_entretenimiento);
        entretenimiento.setName("Dirección de Empresas de Entretenimiento");
        entretenimiento.setEscuelaCode("es_comu");
        entretenimiento.setCode("lic_entretenimiento");
        entretenimiento.setImageDetail(R.drawable.empentretenimiento);
        entretenimiento.setImageProfile(R.drawable.entretenimiento_profile);
        entretenimiento.setImageActivity(R.drawable.entretenimiento_activities);
        entretenimiento.setProfile(R.string.profile_entretenimiento);
        entretenimiento.setActivity(R.string.descripcion_activities_entretenimiento);
        entretenimiento.setPlanEstudio(R.string.list_studyplan_entretenimiento);

        Licenciatura entertainment = new Licenciatura();
        entertainment.setImageHome(R.drawable.lic_biotecnologia);
        entertainment.setImageList(R.drawable.lic_entertainment);
        entertainment.setName("Entertainment Business Management");
        entertainment.setEscuelaCode("es_comu");
        entretenimiento.setCode("lic_entertainment");
        entretenimiento.setImageDetail(R.drawable.empentretenimiento);
        entretenimiento.setImageProfile(R.drawable.entretenimiento_profile);
        entretenimiento.setImageActivity(R.drawable.entretenimiento_activities);
        entretenimiento.setProfile(R.string.profile_entretenimiento);
        entretenimiento.setActivity(R.string.descripcion_activities_entretenimiento);
        entretenimiento.setPlanEstudio(R.string.list_studyplan_entretenimiento);

        Licenciatura ingaudio = new Licenciatura();
        ingaudio.setImageHome(R.drawable.lic_biotecnologia);
        ingaudio.setImageList(R.drawable.lic_ingaudio);
        ingaudio.setName("Ingeniería en Audio");
        ingaudio.setEscuelaCode("es_comu");
        ingaudio.setCode("lic_ingaudio");
        ingaudio.setImageDetail(R.drawable.diseno_multimedia);
        ingaudio.setImageProfile(R.drawable.ingaudio_profile);
        ingaudio.setImageActivity(R.drawable.ingaudio_activities);
        ingaudio.setProfile(R.string.profile_musica);
        ingaudio.setActivity(R.string.descripcion_activities_musica);
        ingaudio.setPlanEstudio(R.string.list_studyplan_musica);


        //ESCUELA DEL DEPORTE
        Licenciatura direcdep = new Licenciatura();
        direcdep.setImageHome(R.drawable.lic_biotecnologia);
        direcdep.setImageList(R.drawable.lic_direcdep);
        direcdep.setName("Dirección del Deporte");
        direcdep.setEscuelaCode("es_dep");
        direcdep.setCode("lic_direcdep");
        direcdep.setImageDetail(R.drawable.direcdep_profile);
        direcdep.setImageProfile(R.drawable.direcdep_profile);
        direcdep.setImageActivity(R.drawable.direcdep_activities);
        direcdep.setProfile(R.string.profile_direcdep);
        direcdep.setActivity(R.string.descripcion_activities_direcdep);
        direcdep.setPlanEstudio(R.string.list_studyplan_direcdep);

        Licenciatura entdep = new Licenciatura();
        entdep.setImageHome(R.drawable.lic_biotecnologia);
        entdep.setImageList(R.drawable.lic_entrenamiento);
        entdep.setName("Entrenamiento e Innovación Deportiva");
        entdep.setEscuelaCode("es_dep");
        entdep.setCode("lic_entdep");
        entdep.setImageDetail(R.drawable.direcdep_profile);
        entdep.setImageProfile(R.drawable.direcdep_profile);
        entdep.setImageActivity(R.drawable.direcdep_activities);
        entdep.setProfile(R.string.profile_direcdep);
        entdep.setActivity(R.string.descripcion_activities_direcdep);
        entdep.setPlanEstudio(R.string.list_studyplan_direcdep);

        //ESCUELA DE GASTRONOMIA
        Licenciatura direcrest = new Licenciatura();
        direcrest.setImageHome(R.drawable.lic_biotecnologia);
        direcrest.setImageList(R.drawable.lic_direccionrest);
        direcrest.setName("Dirección de Restaurantes");
        direcrest.setEscuelaCode("es_gast");
        direcrest.setCode("lic_direcrest");
        direcrest.setImageDetail(R.drawable.direccionrest);
        direcrest.setImageProfile(R.drawable.direccionrest_profile);
        direcrest.setImageActivity(R.drawable.direccionrest_activities);
        direcrest.setProfile(R.string.profile_direccionrest);
        direcrest.setActivity(R.string.descripcion_activities_direccionrest);
        direcrest.setPlanEstudio(R.string.list_studyplan_direccionrest);

        Licenciatura gastronomia = new Licenciatura();
        gastronomia.setImageHome(R.drawable.lic_biotecnologia);
        gastronomia.setImageList(R.drawable.lic_gastro);
        gastronomia.setName("Gastronomia");
        gastronomia.setEscuelaCode("es_gast");
        gastronomia.setCode("lic_gastronomia");
        gastronomia.setImageDetail(R.drawable.gastronomia);
        gastronomia.setImageProfile(R.drawable.gastronomia_profile);
        gastronomia.setImageActivity(R.drawable.direccionrest_activities);
        gastronomia.setProfile(R.string.profile_gastronomia);
        gastronomia.setActivity(R.string.descripcion_activities_gastronomia);
        gastronomia.setPlanEstudio(R.string.list_studyplan_gastronomia);

        Licenciatura gastronomy = new Licenciatura();
        gastronomy.setImageHome(R.drawable.lic_biotecnologia);
        gastronomy.setImageList(R.drawable.lic_gastronomy);
        gastronomy.setName("Gastronomy");
        gastronomy.setEscuelaCode("es_gast");
        gastronomy.setCode("lic_gastronomy");
        gastronomy.setImageDetail(R.drawable.gastronomia);
        gastronomy.setImageProfile(R.drawable.gastronomia_profile);
        gastronomy.setImageActivity(R.drawable.direccionrest_activities);
        gastronomy.setProfile(R.string.profile_gastronomia);
        gastronomy.setActivity(R.string.descripcion_activities_gastronomia);
        gastronomy.setPlanEstudio(R.string.list_studyplan_gastronomia);


        //ESCUELA DE GOBIERNO
        Licenciatura admgob = new Licenciatura();
        admgob.setImageHome(R.drawable.lic_biotecnologia);
        admgob.setImageList(R.drawable.lic_gob);
        admgob.setName("Administración Pública y Gobierno");
        admgob.setEscuelaCode("es_gob");
        admgob.setCode("lic_admgob");
        admgob.setImageDetail(R.drawable.admgob);
        admgob.setImageProfile(R.drawable.admgob_profile);
        admgob.setImageActivity(R.drawable.admgob_activities);
        admgob.setProfile(R.string.profile_admgob);
        admgob.setActivity(R.string.descripcion_activities_admgob);
        admgob.setPlanEstudio(R.string.list_studyplan_admgob);


        //ESCUELA DE HOTELERIA
        Licenciatura direchot = new Licenciatura();
        direchot.setImageHome(R.drawable.lic_biotecnologia);
        direchot.setImageList(R.drawable.lic_direchot);
        direchot.setName("Dirección Internacional de Hoteles");
        direchot.setEscuelaCode("es_hotel");
        direchot.setCode("lic_direchot");
        direchot.setImageDetail(R.drawable.direchot);
        direchot.setImageProfile(R.drawable.direchot_profile);
        direchot.setImageActivity(R.drawable.direchot_activities);
        direchot.setProfile(R.string.profile_direchot);
        direchot.setActivity(R.string.descripcion_activities_direchot);
        direchot.setPlanEstudio(R.string.list_studyplan_direchot);

        Licenciatura gesthot = new Licenciatura();
        gesthot.setImageHome(R.drawable.lic_biotecnologia);
        gesthot.setImageList(R.drawable.lic_gesthot);
        gesthot.setName("Gestión Hotelera Internacional");
        gesthot.setEscuelaCode("es_hotel");
        gesthot.setCode("lic_gesthot");
        gesthot.setImageDetail(R.drawable.direchot);
        gesthot.setImageProfile(R.drawable.direchot_profile);
        gesthot.setImageActivity(R.drawable.direchot_activities);
        gesthot.setProfile(R.string.profile_gesthot);
        gesthot.setActivity(R.string.descripcion_activities_direchot);
        gesthot.setPlanEstudio(R.string.list_studyplan_direchot);

        Licenciatura inthot = new Licenciatura();
        inthot.setImageHome(R.drawable.lic_biotecnologia);
        inthot.setImageList(R.drawable.lic_inthot);
        inthot.setName("International Hotel Management");
        inthot.setEscuelaCode("es_hotel");
        inthot.setCode("lic_inthot");
        inthot.setImageDetail(R.drawable.direchot);
        inthot.setImageProfile(R.drawable.direchot_profile);
        inthot.setImageActivity(R.drawable.direchot_activities);
        inthot.setProfile(R.string.profile_gesthot);
        inthot.setActivity(R.string.descripcion_activities_direchot);
        inthot.setPlanEstudio(R.string.list_studyplan_direchot);


        //ESCUELA DE LENGUAS
        Licenciatura lenguas = new Licenciatura();
        lenguas.setImageHome(R.drawable.lic_biotecnologia);
        lenguas.setImageList(R.drawable.lic_lenguas);
        lenguas.setName("Lenguas y Gestión Cultural");
        lenguas.setEscuelaCode("es_leng");
        lenguas.setCode("lic_leng");
        lenguas.setImageDetail(R.drawable.lenguas);
        lenguas.setImageProfile(R.drawable.leng_profile);
        lenguas.setImageActivity(R.drawable.leng_activities);
        lenguas.setProfile(R.string.profile_leng);
        lenguas.setActivity(R.string.descripcion_activities_leng);
        lenguas.setPlanEstudio(R.string.list_studyplan_leng);

        //ESCUELA DE MEDICINA
        Licenciatura medcirujano = new Licenciatura();
        medcirujano.setImageHome(R.drawable.lic_biotecnologia);
        medcirujano.setImageList(R.drawable.lic_medciruja);
        medcirujano.setName("Médico Cirujano");
        medcirujano.setEscuelaCode("es_med");
        medcirujano.setCode("lic_med");
        medcirujano.setImageDetail(R.drawable.med);
        medcirujano.setImageProfile(R.drawable.med_profile);
        medcirujano.setImageActivity(R.drawable.med_activities);
        medcirujano.setProfile(R.string.profile_med);
        medcirujano.setActivity(R.string.descripcion_activities_med);
        medcirujano.setPlanEstudio(R.string.list_studyplan_med);

        Licenciatura medsurg = new Licenciatura();
        medsurg.setImageHome(R.drawable.lic_biotecnologia);
        medsurg.setImageList(R.drawable.lic_medicine);
        medsurg.setName("Medicine & Surgery");
        medsurg.setEscuelaCode("es_med");
        medsurg.setCode("lic_med");
        medsurg.setImageDetail(R.drawable.med);
        medsurg.setImageProfile(R.drawable.med_profile);
        medsurg.setImageActivity(R.drawable.med_activities);
        medsurg.setProfile(R.string.profile_med);
        medsurg.setActivity(R.string.descripcion_activities_med);
        medsurg.setPlanEstudio(R.string.list_studyplan_med);


        //ESCUELA DE NEGOCIOS
        Licenciatura admemp = new Licenciatura();
        admemp.setImageHome(R.drawable.lic_biotecnologia);
        admemp.setImageList(R.drawable.lic_amdmin);
        admemp.setName("Administración y Dirección de Empresas");
        admemp.setEscuelaCode("es_neg");
        admemp.setCode("lic_admemp");
        admemp.setImageDetail(R.drawable.admemp);
        admemp.setImageProfile(R.drawable.admemp_profile);
        admemp.setImageActivity(R.drawable.admemp_activities);
        admemp.setProfile(R.string.profile_admemp);
        admemp.setActivity(R.string.descripcion_activities_admemp);
        admemp.setPlanEstudio(R.string.list_studyplan_admemp);

        Licenciatura direcfin = new Licenciatura();
        direcfin.setImageHome(R.drawable.lic_biotecnologia);
        direcfin.setImageList(R.drawable.lic_direcfin);
        direcfin.setName("Dirección Financiera");
        direcfin.setEscuelaCode("es_neg");
        direcfin.setCode("lic_direcfin");
        direcfin.setImageDetail(R.drawable.direcfin);
        direcfin.setImageProfile(R.drawable.direcfin_profile);
        direcfin.setImageActivity(R.drawable.direcfin_activities);


        Licenciatura conta = new Licenciatura();
        conta.setImageHome(R.drawable.lic_biotecnologia);
        conta.setImageList(R.drawable.lic_conta);
        conta.setName("Finanzas y Contaduría Pública");
        conta.setEscuelaCode("es_neg");

        Licenciatura merca = new Licenciatura();
        merca.setImageHome(R.drawable.lic_biotecnologia);
        merca.setImageList(R.drawable.lic_merca);
        merca.setName("Mercadotecnia Estratégica");
        merca.setEscuelaCode("es_neg");

        Licenciatura negint = new Licenciatura();
        negint.setImageHome(R.drawable.lic_biotecnologia);
        negint.setImageList(R.drawable.lic_neginter);
        negint.setName("Negocios Internacionales");
        negint.setEscuelaCode("es_neg");

        Licenciatura interbus = new Licenciatura();
        interbus.setImageHome(R.drawable.lic_biotecnologia);
        interbus.setImageList(R.drawable.lic_international);
        interbus.setName("International Business");
        interbus.setEscuelaCode("es_neg");

        Licenciatura strabus = new Licenciatura();
        strabus.setImageHome(R.drawable.lic_biotecnologia);
        strabus.setImageList(R.drawable.lic_strabus);
        strabus.setName("Strategic Business Management");
        strabus.setEscuelaCode("es_neg");

        Licenciatura stramark = new Licenciatura();
        stramark.setImageHome(R.drawable.lic_biotecnologia);
        stramark.setImageList(R.drawable.lic_stramark);
        stramark.setName("Strategic Marketing");
        stramark.setEscuelaCode("es_neg");


        //ESCUELA DE NUTRICION
        Licenciatura nutri = new Licenciatura();
        nutri.setImageHome(R.drawable.lic_biotecnologia);
        nutri.setImageList(R.drawable.lic_nutricion);
        nutri.setName("Nutrición");
        nutri.setEscuelaCode("es_nutri");



        //ESCUELA DE ODONTOLOGIA
        Licenciatura dentista = new Licenciatura();
        dentista.setImageHome(R.drawable.lic_biotecnologia);
        dentista.setImageList(R.drawable.lic_dent);
        dentista.setName("Médico Cirujano Dentista");
        dentista.setEscuelaCode("es_odon");



        //ESCUELA DE RESPONSABILIDAD SOCIAL Y SUSTENTABILIDAD
        Licenciatura responsabilidad = new Licenciatura();
        responsabilidad.setImageHome(R.drawable.lic_biotecnologia);
        responsabilidad.setImageList(R.drawable.lic_respon);
        responsabilidad.setName("Responsabilidad Social y Sustentabilidad");
        responsabilidad.setEscuelaCode("es_resp");



        //ESCUELA DE PSICOLOGIA
        Licenciatura psicologia = new Licenciatura();
        psicologia.setImageHome(R.drawable.lic_biotecnologia);
        entdep.setImageList(R.drawable.lic_psico);
        psicologia.setName("Psicología");
        psicologia.setEscuelaCode("es_psi");


        //ESCUELA DE TURISMO
        Licenciatura turint = new Licenciatura();
        turint.setImageHome(R.drawable.lic_biotecnologia);
        turint.setImageList(R.drawable.lic_turinter);
        turint.setName("Turismo Internacional");
        turint.setEscuelaCode("es_tur");

        Licenciatura inttour = new Licenciatura();
        inttour.setImageHome(R.drawable.lic_biotecnologia);
        inttour.setImageList(R.drawable.lic_intertour);
        inttour.setName("International Tourism");
        inttour.setEscuelaCode("es_tur");





        list.add(grafico);
        list.add(multimedia);
        list.add(industrial);
        list.add(modas);

        list.add(arqui);

        list.add(biotech);

        list.add(fisio);

        list.add(derecho);
        list.add(relinter);

        list.add(engman);
        list.add(ingamb);
        list.add(ingciv);
        list.add(ingind);

        list.add(musica);

        list.add(comunicacion);
        list.add(communication);
        list.add(entretenimiento);
        list.add(entertainment);
        list.add(ingaudio);

        list.add(direcdep);
        list.add(entdep);

        list.add(direcrest);
        list.add(gastronomia);
        list.add(gastronomy);

        list.add(admgob);

        list.add(direchot);
        list.add(gesthot);
        list.add(inthot);

        list.add(lenguas);

        list.add(medcirujano);
        list.add(medsurg);


        list.add(admemp);
        list.add(direcfin);
        list.add(conta);
        list.add(merca);
        list.add(negint);
        list.add(interbus);
        list.add(strabus);
        list.add(stramark);

        list.add(nutri);

        list.add(dentista);

        list.add(responsabilidad);

        list.add(psicologia);

        list.add(turint);
        list.add(inttour);



        return list;
    }
}
