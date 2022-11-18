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
    private String escuelaCode;

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

        //ESCUELA DE DISEÑO
        Licenciatura grafico = new Licenciatura();
        grafico.setName("Diseño Grafico");
        grafico.setEscuelaCode("es_dis");
        grafico.setImageHome(R.drawable.lic_disenio);
        grafico.setImageList(R.drawable.lic_grafico);

        Licenciatura industrial = new Licenciatura();
        industrial.setName("Diseño Industrial");
        industrial.setEscuelaCode("es_dis");
        industrial.setImageHome(R.drawable.lic_disenio);
        industrial.setImageList(R.drawable.lic_industrial);

        Licenciatura multimedia = new Licenciatura();
        multimedia.setName("Diseño Multimedia");
        multimedia.setEscuelaCode("es_dis");
        multimedia.setImageHome(R.drawable.lic_disenio);
        multimedia.setImageList(R.drawable.lic_multimedia);

        Licenciatura modas = new Licenciatura();
        modas.setName("Diseño de Moda e Innovación");
        modas.setEscuelaCode("es_dis");
        modas.setImageHome(R.drawable.lic_disenio);
        modas.setImageList(R.drawable.lic_modas);


        //ESCUELA DE ARQUITECTURA
        Licenciatura arqui = new Licenciatura();
        arqui.setImageHome(R.drawable.lic_arquitectura);
        arqui.setName("Arquitectura");
        arqui.setEscuelaCode("es_arqui");


        //ESCUELA DE BIOTECNOLOGIA
        Licenciatura biotech = new Licenciatura();
        biotech.setImageHome(R.drawable.lic_biotecnologia);
        biotech.setName("Biotecnología");
        biotech.setEscuelaCode("es_bio");


        //ESCUELA DE DERECHO
        Licenciatura derecho = new Licenciatura();
        biotech.setImageHome(R.drawable.lic_biotecnologia);
        biotech.setName("Derecho");
        biotech.setEscuelaCode("es_der");

        Licenciatura relinter = new Licenciatura();
        relinter.setImageHome(R.drawable.lic_biotecnologia);
        relinter.setName("Relaciones Internacionales");
        relinter.setEscuelaCode("es_der");


        //ESCUELA DE FISIOTERAPIA
        Licenciatura fisio = new Licenciatura();
        fisio.setImageHome(R.drawable.lic_biotecnologia);
        fisio.setName("Fisioterapia");
        fisio.setEscuelaCode("es_fis");



        //ESCUELA DE INGENIERIA
        Licenciatura engman = new Licenciatura();
        engman.setImageHome(R.drawable.lic_biotecnologia);
        engman.setName("Engineering Management");
        engman.setEscuelaCode("es_ing");

        Licenciatura ingamb = new Licenciatura();
        ingamb.setImageHome(R.drawable.lic_biotecnologia);
        ingamb.setName("Ingeniería");
        ingamb.setEscuelaCode("es_ing");

        Licenciatura ingciv = new Licenciatura();
        ingciv.setImageHome(R.drawable.lic_biotecnologia);
        ingciv.setName("Ingeniería Civil");
        ingciv.setEscuelaCode("es_ing");

        Licenciatura ingind = new Licenciatura();
        ingind.setImageHome(R.drawable.lic_biotecnologia);
        ingind.setName("Ingeniería Industrial para la Dirección");
        ingind.setEscuelaCode("es_ing");


        //ESCUELA DE ARTES
        Licenciatura musica = new Licenciatura();
        musica.setImageHome(R.drawable.lic_biotecnologia);
        musica.setName("Música Contemporánea");
        musica.setEscuelaCode("es_artes");


        //ESCUELA DE COMUNICACION
        Licenciatura comunicacion = new Licenciatura();
        comunicacion.setImageHome(R.drawable.lic_biotecnologia);
        comunicacion.setName("Comunicación");
        comunicacion.setEscuelaCode("es_comu");

        Licenciatura communication = new Licenciatura();
        communication.setImageHome(R.drawable.lic_biotecnologia);
        communication.setName("Communicatión");
        communication.setEscuelaCode("es_comu");

        Licenciatura entretenimiento = new Licenciatura();
        entretenimiento.setImageHome(R.drawable.lic_biotecnologia);
        entretenimiento.setName("Dirección de Empresas de Entretenimiento");
        entretenimiento.setEscuelaCode("es_comu");

        Licenciatura entertainment = new Licenciatura();
        entertainment.setImageHome(R.drawable.lic_biotecnologia);
        entertainment.setName("Entertainment Business Management");
        entertainment.setEscuelaCode("es_comu");

        Licenciatura ingaudio = new Licenciatura();
        ingaudio.setImageHome(R.drawable.lic_biotecnologia);
        ingaudio.setName("Ingeniería en Audio");
        ingaudio.setEscuelaCode("es_comu");


        //ESCUELA DEL DEPORTE
        Licenciatura direcdep = new Licenciatura();
        direcdep.setImageHome(R.drawable.lic_biotecnologia);
        direcdep.setName("Dirección del Deporte");
        direcdep.setEscuelaCode("es_dep");

        Licenciatura entdep = new Licenciatura();
        entdep.setImageHome(R.drawable.lic_biotecnologia);
        entdep.setName("Entrenamiento e Innovación Deportiva");
        entdep.setEscuelaCode("es_dep");


        //ESCUELA DE GASTRONOMIA
        Licenciatura direcrest = new Licenciatura();
        direcrest.setImageHome(R.drawable.lic_biotecnologia);
        direcrest.setName("Dirección de Restaurantes");
        direcrest.setEscuelaCode("es_gast");

        Licenciatura gastronomia = new Licenciatura();
        gastronomia.setImageHome(R.drawable.lic_biotecnologia);
        gastronomia.setName("Gastronomia");
        gastronomia.setEscuelaCode("es_gast");

        Licenciatura gastronomy = new Licenciatura();
        gastronomy.setImageHome(R.drawable.lic_biotecnologia);
        gastronomy.setName("Gastronomy");
        gastronomy.setEscuelaCode("es_gast");


        //ESCUELA DE GOBIERNO
        Licenciatura admgob = new Licenciatura();
        admgob.setImageHome(R.drawable.lic_biotecnologia);
        admgob.setName("Administración Pública y Gobierno");
        admgob.setEscuelaCode("es_gob");


        //ESCUELA DE HOTELERIA
        Licenciatura direchot = new Licenciatura();
        direchot.setImageHome(R.drawable.lic_biotecnologia);
        direchot.setName("Dirección Internacional de Hoteles");
        direchot.setEscuelaCode("es_hotel");

        Licenciatura gesthot = new Licenciatura();
        gesthot.setImageHome(R.drawable.lic_biotecnologia);
        gesthot.setName("Gestión Hotelera Internacional");
        gesthot.setEscuelaCode("es_hotel");

        Licenciatura inthot = new Licenciatura();
        inthot.setImageHome(R.drawable.lic_biotecnologia);
        inthot.setName("International Hotel Management");
        inthot.setEscuelaCode("es_hotel");


        //ESCUELA DE LENGUAS
        Licenciatura lenguas = new Licenciatura();
        lenguas.setImageHome(R.drawable.lic_biotecnologia);
        lenguas.setName("Lenguas y Gestión Cultural");
        lenguas.setEscuelaCode("es_leng");


        //ESCUELA DE MEDICINA
        Licenciatura medcirujano = new Licenciatura();
        medcirujano.setImageHome(R.drawable.lic_biotecnologia);
        medcirujano.setName("Médico Cirujano");
        medcirujano.setEscuelaCode("es_med");

        Licenciatura medsurg = new Licenciatura();
        medsurg.setImageHome(R.drawable.lic_biotecnologia);
        medsurg.setName("Medicine & Surgery");
        medsurg.setEscuelaCode("es_med");


        //ESCUELA DE NEGOCIOS
        Licenciatura admemp = new Licenciatura();
        admemp.setImageHome(R.drawable.lic_biotecnologia);
        admemp.setName("Administración y Dirección de Empresas");
        admemp.setEscuelaCode("es_neg");

        Licenciatura direcfin = new Licenciatura();
        direcfin.setImageHome(R.drawable.lic_biotecnologia);
        direcfin.setName("Dirección Financiera");
        direcfin.setEscuelaCode("es_neg");

        Licenciatura conta = new Licenciatura();
        conta.setImageHome(R.drawable.lic_biotecnologia);
        conta.setName("Finanzas y Contaduría Pública");
        conta.setEscuelaCode("es_neg");

        Licenciatura merca = new Licenciatura();
        merca.setImageHome(R.drawable.lic_biotecnologia);
        merca.setName("Mercadotecnia Estratégica");
        merca.setEscuelaCode("es_neg");

        Licenciatura negint = new Licenciatura();
        negint.setImageHome(R.drawable.lic_biotecnologia);
        negint.setName("Negocios Internacionales");
        negint.setEscuelaCode("es_neg");

        Licenciatura interbus = new Licenciatura();
        interbus.setImageHome(R.drawable.lic_biotecnologia);
        interbus.setName("International Business");
        interbus.setEscuelaCode("es_neg");

        Licenciatura strabus = new Licenciatura();
        strabus.setImageHome(R.drawable.lic_biotecnologia);
        strabus.setName("Strategic Business Management");
        strabus.setEscuelaCode("es_neg");

        Licenciatura stramark = new Licenciatura();
        stramark.setImageHome(R.drawable.lic_biotecnologia);
        stramark.setName("Strategic Marketing");
        stramark.setEscuelaCode("es_neg");


        //ESCUELA DE NUTRICION
        Licenciatura nutri = new Licenciatura();
        nutri.setImageHome(R.drawable.lic_biotecnologia);
        nutri.setName("Nutrición");
        nutri.setEscuelaCode("es_nutri");



        //ESCUELA DE ODONTOLOGIA
        Licenciatura dentista = new Licenciatura();
        dentista.setImageHome(R.drawable.lic_biotecnologia);
        dentista.setName("Médico Cirujano Dentista");
        dentista.setEscuelaCode("es_odon");



        //ESCUELA DE RESPONSABILIDAD SOCIAL Y SUSTENTABILIDAD
        Licenciatura responsabilidad = new Licenciatura();
        responsabilidad.setImageHome(R.drawable.lic_biotecnologia);
        responsabilidad.setName("Responsabilidad Social y Sustentabilidad");
        responsabilidad.setEscuelaCode("es_resp");



        //ESCUELA DE PSICOLOGIA
        Licenciatura psicologia = new Licenciatura();
        psicologia.setImageHome(R.drawable.lic_biotecnologia);
        psicologia.setName("Psicología");
        psicologia.setEscuelaCode("es_psi");


        //ESCUELA DE TURISMO
        Licenciatura turint = new Licenciatura();
        turint.setImageHome(R.drawable.lic_biotecnologia);
        turint.setName("Turismo Internacional");
        turint.setEscuelaCode("es_tur");

        Licenciatura inttour = new Licenciatura();
        inttour.setImageHome(R.drawable.lic_biotecnologia);
        inttour.setName("International Tourism");
        inttour.setEscuelaCode("es_tur");




        list.add(multimedia);
        list.add(grafico);
        list.add(modas);
        list.add(industrial);

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
