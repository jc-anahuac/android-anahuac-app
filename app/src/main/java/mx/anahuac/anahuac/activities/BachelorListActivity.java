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
                R.drawable.ic_escuela_biotecnologia
        );
        Escuela c2 = new Escuela(
                "Facultad de Derecho y Relaciones Internacionales",
                R.drawable.ic_escuela_derecho
        );

        Escuela c3 = new Escuela(
                "Escuela de Diseño",
                R.drawable.ic_escuela_diseno
        );

        Escuela c4 = new Escuela(
                "Escuela de Fisioterapia",
                R.drawable.ic_escuela_fisio
        );





        listEscuela.add(c1);
        listEscuela.add(c2);
        listEscuela.add(c3);
        listEscuela.add(c4);

        rvEscuelas.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));
        BachelorListAdapter adapter = new BachelorListAdapter(listEscuela);
        rvEscuelas.setAdapter(adapter);



    }
}