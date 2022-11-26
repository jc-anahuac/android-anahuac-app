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

        Licenciatura ingamb = new Licenciatura();
        ingamb.setImageHome(R.drawable.lic_biotecnologia);
        ingamb.setImageList(R.drawable.lic_ingamb);
        ingamb.setName("Ingeniería Ambiental");
        ingamb.setEscuelaCode("es_ing");

        Licenciatura ingciv = new Licenciatura();
        ingciv.setImageHome(R.drawable.lic_biotecnologia);
        ingciv.setImageList(R.drawable.lic_ingcivil);
        ingciv.setName("Ingeniería Civil");
        ingciv.setEscuelaCode("es_ing");

        Licenciatura ingind = new Licenciatura();
        ingind.setImageHome(R.drawable.lic_biotecnologia);
        ingind.setImageList(R.drawable.lic_ingind);
        ingind.setName("Ingeniería Industrial para la Dirección");
        ingind.setEscuelaCode("es_ing");


        //ESCUELA DE ARTES
        Licenciatura musica = new Licenciatura();
        musica.setImageHome(R.drawable.lic_biotecnologia);
        musica.setImageList(R.drawable.lic_musica);
        musica.setName("Música Contemporánea");
        musica.setEscuelaCode("es_artes");


        //ESCUELA DE COMUNICACION
        Licenciatura comunicacion = new Licenciatura();
        comunicacion.setImageHome(R.drawable.lic_biotecnologia);
        comunicacion.setImageList(R.drawable.lic_comu);
        comunicacion.setName("Comunicación");
        comunicacion.setEscuelaCode("es_comu");

        Licenciatura communication = new Licenciatura();
        communication.setImageHome(R.drawable.lic_biotecnologia);
        communication.setImageList(R.drawable.lic_comunication);
        communication.setName("Communication");
        communication.setEscuelaCode("es_comu");

        Licenciatura entretenimiento = new Licenciatura();
        entretenimiento.setImageHome(R.drawable.lic_biotecnologia);
        entretenimiento.setImageList(R.drawable.lic_entretenimiento);
        entretenimiento.setName("Dirección de Empresas de Entretenimiento");
        entretenimiento.setEscuelaCode("es_comu");

        Licenciatura entertainment = new Licenciatura();
        entertainment.setImageHome(R.drawable.lic_biotecnologia);
        entertainment.setImageList(R.drawable.lic_entertainment);
        entertainment.setName("Entertainment Business Management");
        entertainment.setEscuelaCode("es_comu");

        Licenciatura ingaudio = new Licenciatura();
        ingaudio.setImageHome(R.drawable.lic_biotecnologia);
        ingaudio.setImageList(R.drawable.lic_ingaudio);
        ingaudio.setName("Ingeniería en Audio");
        ingaudio.setEscuelaCode("es_comu");


        //ESCUELA DEL DEPORTE
        Licenciatura direcdep = new Licenciatura();
        direcdep.setImageHome(R.drawable.lic_biotecnologia);
        direcdep.setImageList(R.drawable.lic_direcdep);
        direcdep.setName("Dirección del Deporte");
        direcdep.setEscuelaCode("es_dep");

        Licenciatura entdep = new Licenciatura();
        entdep.setImageHome(R.drawable.lic_biotecnologia);
        entdep.setImageList(R.drawable.lic_entrenamiento);
        entdep.setName("Entrenamiento e Innovación Deportiva");
        entdep.setEscuelaCode("es_dep");


        //ESCUELA DE GASTRONOMIA
        Licenciatura direcrest = new Licenciatura();
        direcrest.setImageHome(R.drawable.lic_biotecnologia);
        direcrest.setImageList(R.drawable.lic_direccionrest);
        direcrest.setName("Dirección de Restaurantes");
        direcrest.setEscuelaCode("es_gast");

        Licenciatura gastronomia = new Licenciatura();
        gastronomia.setImageHome(R.drawable.lic_biotecnologia);
        gastronomia.setImageList(R.drawable.lic_gastro);
        gastronomia.setName("Gastronomia");
        gastronomia.setEscuelaCode("es_gast");

        Licenciatura gastronomy = new Licenciatura();
        gastronomy.setImageHome(R.drawable.lic_biotecnologia);
        gastronomy.setImageList(R.drawable.lic_gastronomy);
        gastronomy.setName("Gastronomy");
        gastronomy.setEscuelaCode("es_gast");


        //ESCUELA DE GOBIERNO
        Licenciatura admgob = new Licenciatura();
        admgob.setImageHome(R.drawable.lic_biotecnologia);
        admgob.setImageList(R.drawable.lic_gob);
        admgob.setName("Administración Pública y Gobierno");
        admgob.setEscuelaCode("es_gob");


        //ESCUELA DE HOTELERIA
        Licenciatura direchot = new Licenciatura();
        direchot.setImageHome(R.drawable.lic_biotecnologia);
        direchot.setImageList(R.drawable.lic_direchot);
        direchot.setName("Dirección Internacional de Hoteles");
        direchot.setEscuelaCode("es_hotel");

        Licenciatura gesthot = new Licenciatura();
        gesthot.setImageHome(R.drawable.lic_biotecnologia);
        gesthot.setImageList(R.drawable.lic_gesthot);
        gesthot.setName("Gestión Hotelera Internacional");
        gesthot.setEscuelaCode("es_hotel");

        Licenciatura inthot = new Licenciatura();
        inthot.setImageHome(R.drawable.lic_biotecnologia);
        inthot.setImageList(R.drawable.lic_inthot);
        inthot.setName("International Hotel Management");
        inthot.setEscuelaCode("es_hotel");


        //ESCUELA DE LENGUAS
        Licenciatura lenguas = new Licenciatura();
        lenguas.setImageHome(R.drawable.lic_biotecnologia);
        lenguas.setImageList(R.drawable.lic_lenguas);
        lenguas.setName("Lenguas y Gestión Cultural");
        lenguas.setEscuelaCode("es_leng");


        //ESCUELA DE MEDICINA
        Licenciatura medcirujano = new Licenciatura();
        medcirujano.setImageHome(R.drawable.lic_biotecnologia);
        medcirujano.setImageList(R.drawable.lic_medciruja);
        medcirujano.setName("Médico Cirujano");
        medcirujano.setEscuelaCode("es_med");

        Licenciatura medsurg = new Licenciatura();
        medsurg.setImageHome(R.drawable.lic_biotecnologia);
        medsurg.setImageList(R.drawable.lic_medicine);
        medsurg.setName("Medicine & Surgery");
        medsurg.setEscuelaCode("es_med");


        //ESCUELA DE NEGOCIOS
        Licenciatura admemp = new Licenciatura();
        admemp.setImageHome(R.drawable.lic_biotecnologia);
        admemp.setImageList(R.drawable.lic_amdmin);
        admemp.setName("Administración y Dirección de Empresas");
        admemp.setEscuelaCode("es_neg");

        Licenciatura direcfin = new Licenciatura();
        direcfin.setImageHome(R.drawable.lic_biotecnologia);
        direcfin.setImageList(R.drawable.lic_direcfin);
        direcfin.setName("Dirección Financiera");
        direcfin.setEscuelaCode("es_neg");

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
