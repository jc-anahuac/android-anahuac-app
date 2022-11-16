package mx.anahuac.anahuac.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import mx.anahuac.anahuac.R;
import mx.anahuac.anahuac.adapters.BachelorListAdapter;
import mx.anahuac.anahuac.adapters.LicenciaturasAdapter;
import mx.anahuac.anahuac.models.Campus;
import mx.anahuac.anahuac.models.Escuela;

public class BachelorListActivity extends AppCompatActivity {

    private RecyclerView rvEscuelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bachelor_list);

        rvEscuelas = findViewById(R.id.rv_escuela);
        ArrayList<Escuela> listEscuela = new ArrayList<>();


        Escuela c1 = new Escuela(
                "Escuela de Biotecnologia",
                R.drawable.ic_escuela_biotecnologia,
                "es_bio"

        );
        Escuela c2 = new Escuela(
                "Facultad de Derecho y Relaciones Internacionales",
                R.drawable.ic_escuela_derecho,
                "es_der"
        );

        Escuela c3 = new Escuela(
                "Escuela de Diseño",
                R.drawable.ic_escuela_diseno,
                "es_dis"
        );

        Escuela c4 = new Escuela(
                "Escuela de Fisioterapia",
                R.drawable.ic_escuela_fisio,
                "es_fis"
        );

        Escuela c5 = new Escuela(
                "Escuela de Ingeniería",
                R.drawable.ic_escuela_inge,
                "es_ing"
        );

        Escuela c6 = new Escuela(
                "Escuela Internacional de Arquitectura",
                R.drawable.ic_escuela_arqui,
                "es_arqui"
        );

        Escuela c7 = new Escuela(
                "Escuela Internacional de Artes",
                R.drawable.ic_escuela_artes,
                "es_artes"
        );

        Escuela c8 = new Escuela(
                "Escuela Internacional de Comunicación y Entretenimiento",
                R.drawable.ic_escuela_comu,
                "es_comu"
        );

        Escuela c9 = new Escuela(
                "Escuela Internacional del Deporte",
                R.drawable.ic_escuela_deportes,
                "es_dep"
        );

        Escuela c10 = new Escuela(
                "Escuela Internacional de Gastronomía",
                R.drawable.ic_escuela_gastro,
                "es_gast"
        );

        Escuela c11 = new Escuela(
                "Escuela Internacional de Gobierno",
                R.drawable.ic_escuela_gobierno,
                "es_gob"
        );

        Escuela c12 = new Escuela(
                "Escuela Internacional de Hotelería",
                R.drawable.ic_escuela_hotel,
                "es_hotel"
        );

        Escuela c13 = new Escuela(
                "Escuela Internacional de Lenguas",
                R.drawable.ic_escuela_leng,
                "es_leng"
        );

        Escuela c14 = new Escuela(
                "Escuela Internacional de Medicina",
                R.drawable.ic_escuela_med,
                "es_med"
        );

        Escuela c15 = new Escuela(
                "Escuela Internacional de Negocios",
                R.drawable.ic_escuela_neg,
                "es_neg"
        );

        Escuela c16 = new Escuela(
                "Escuela de Nutrición",
                R.drawable.ic_escuela_nutri,
                "es_nutri"
        );

        Escuela c17 = new Escuela(
                "Escuela Internacional de Odontología",
                R.drawable.ic_escuela_odon,
                "es_odon"
        );

        Escuela c18 = new Escuela(
                "Escuela Internacional Internacional de Responsabilidad Social y Sustentabilidad",
                R.drawable.ic_escuela_respon,
                "es_resp"
        );

        Escuela c19 = new Escuela(
                "Escuela Internacional Internacional de Psicología",
                R.drawable.ic_escuela_psico,
                "es_psi"
        );

        Escuela c20 = new Escuela(
                "Facultad Internacional del Turismo",
                R.drawable.ic_escuela_turismo,
                "es_tur"
        );



        listEscuela.add(c1);
        listEscuela.add(c2);
        listEscuela.add(c3);
        listEscuela.add(c4);
        listEscuela.add(c5);
        listEscuela.add(c6);
        listEscuela.add(c7);
        listEscuela.add(c8);
        listEscuela.add(c9);
        listEscuela.add(c10);
        listEscuela.add(c11);
        listEscuela.add(c12);
        listEscuela.add(c13);
        listEscuela.add(c14);
        listEscuela.add(c15);
        listEscuela.add(c16);
        listEscuela.add(c17);
        listEscuela.add(c18);
        listEscuela.add(c19);
        listEscuela.add(c20);


        rvEscuelas.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));
        BachelorListAdapter adapter = new BachelorListAdapter(listEscuela);
        rvEscuelas.setAdapter(adapter);



    }
}