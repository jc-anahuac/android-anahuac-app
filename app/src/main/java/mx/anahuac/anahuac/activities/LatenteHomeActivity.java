package mx.anahuac.anahuac.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import mx.anahuac.anahuac.R;
import mx.anahuac.anahuac.adapters.BachelorListAdapter;
import mx.anahuac.anahuac.adapters.LatenteListAdapter;
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

        rvConferencias.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));
        LatenteListAdapter adapter = new LatenteListAdapter(listConferencia);
        rvConferencias.setAdapter(adapter);

        rvTalleres.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));
        LatenteListAdapter adapter = new LatenteListAdapter(listTalleres);
        rvTalleres.setAdapter(adapter);
    }
}