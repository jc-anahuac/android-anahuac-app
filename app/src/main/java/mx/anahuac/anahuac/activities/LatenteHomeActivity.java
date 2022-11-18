package mx.anahuac.anahuac.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import mx.anahuac.anahuac.R;
import mx.anahuac.anahuac.adapters.ConferencistasAdapter;
import mx.anahuac.anahuac.adapters.TalleresAdapter;
import mx.anahuac.anahuac.models.Conferencistas;
import mx.anahuac.anahuac.models.Talleres;

public class LatenteHomeActivity extends AppCompatActivity {

    private RecyclerView rvConferencias;
    private RecyclerView rvTalleres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latente_home);

        rvConferencias = findViewById(R.id.rv_conferenicas);
        rvTalleres = findViewById(R.id.rv_talleres);
        ArrayList<Conferencistas> listConferencia = new ArrayList<>();
        ArrayList<Talleres> listTalleres = new ArrayList<>();

        Conferencistas c1 = new Conferencistas(
                R.drawable.alex_salmar,
                "Alex Salmar"
        );
        Conferencistas c2 = new Conferencistas(
                R.drawable.tony_rivera,
                "Tony Rivera"
        );
        Conferencistas c3 = new Conferencistas(
                R.drawable.felix_hdz,
                "Felix Hernandez"
        );
        Conferencistas c4 = new Conferencistas(
                R.drawable.irene_prz,
                "Irene Peréz"
        );

        Talleres c5 = new Talleres(
                R.drawable.rigging,
                "Rigging 3D"
        );
        Talleres c6 = new Talleres(
                R.drawable.dis_mueble,
                "Diseño de Mueblería"
        );
        Talleres c7 = new Talleres(
                R.drawable.foto_concept,
                "Fotografía Conceptual"
        );
        Talleres c8 = new Talleres(
                R.drawable.pintura_concept,
                "Pintura Conceptual"
        );

        listConferencia.add(c1);
        listConferencia.add(c2);
        listConferencia.add(c3);
        listConferencia.add(c4);
        listTalleres.add(c5);
        listTalleres.add(c6);
        listTalleres.add(c7);
        listTalleres.add(c8);

        ConferencistasAdapter adapter = new ConferencistasAdapter(listConferencia);
        rvConferencias.setAdapter(adapter);

        TalleresAdapter talleresAdapter = new TalleresAdapter(listTalleres);
        rvTalleres.setAdapter(talleresAdapter);
    }
}