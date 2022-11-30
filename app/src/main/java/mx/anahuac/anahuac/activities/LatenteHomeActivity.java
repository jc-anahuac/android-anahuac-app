package mx.anahuac.anahuac.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

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
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_new_24);

        rvConferencias = findViewById(R.id.rv_conferenicas);
        rvTalleres = findViewById(R.id.rv_talleres);
        ArrayList<Conferencistas> listConferencia = new ArrayList<>();
        ArrayList<Talleres> listTalleres = new ArrayList<>();

        Conferencistas c1 = new Conferencistas(
                R.drawable.lat_alex_salmar,
                "Alex Salmar"
        );
        Conferencistas c2 = new Conferencistas(
                R.drawable.lat_tony_rivera,
                "Tony Rivera"
        );
        Conferencistas c3 = new Conferencistas(
                R.drawable.lat_felix_hdz,
                "Felix Hernandez"
        );
        Conferencistas c4 = new Conferencistas(
                R.drawable.lat_irene_prz,
                "Irene Peréz"
        );
        Conferencistas c5 = new Conferencistas(
                R.drawable.lat_dracma_studio,
                "Studio Dracma"
        );
        Conferencistas c6 = new Conferencistas(
                R.drawable.lat_puerta_left,
                "Puerta Left"
        );
        Conferencistas c7 = new Conferencistas(
                R.drawable.lat_esmeralda_mqz,
                "Esmeralda Marquez"
        );
        Conferencistas c8 = new Conferencistas(
                R.drawable.lat_general_studio,
                "General Studio"
        );

        Talleres c9 = new Talleres(
                R.drawable.lat_rigging_3d,
                "Rigging 3D"
        );
        Talleres c10 = new Talleres(
                R.drawable.lat_dis_mueble,
                "Diseño de Mueblería"
        );
        Talleres c11 = new Talleres(
                R.drawable.lat_foto_concept,
                "Fotografía Conceptual"
        );
        Talleres c12 = new Talleres(
                R.drawable.lat_pintura_concept,
                "Pintura Conceptual"
        );
        Talleres c13 = new Talleres(
                R.drawable.lat_dis_personaje,
                "Diseño de Personaje"
        );
        Talleres c14 = new Talleres(
                R.drawable.lat_taller6,
                "Taller 6"
        );
        Talleres c15 = new Talleres(
                R.drawable.lat_moda_susten,
                "Moda Sustentable"
        );
        Talleres c16 = new Talleres(
                R.drawable.lat_taller8,
                "Taller 8"
        );

        listConferencia.add(c1);
        listConferencia.add(c2);
        listConferencia.add(c3);
        listConferencia.add(c4);
        listConferencia.add(c5);
        listConferencia.add(c6);
        listConferencia.add(c7);
        listConferencia.add(c8);
        listTalleres.add(c9);
        listTalleres.add(c10);
        listTalleres.add(c11);
        listTalleres.add(c12);
        listTalleres.add(c13);
        listTalleres.add(c14);
        listTalleres.add(c15);
        listTalleres.add(c16);

        ConferencistasAdapter adapter = new ConferencistasAdapter(listConferencia);
        rvConferencias.setAdapter(adapter);

        TalleresAdapter talleresAdapter = new TalleresAdapter(listTalleres);
        rvTalleres.setAdapter(talleresAdapter);

    }

    public void buttonInsta (View view) {
        Intent buttonInsta = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/latente_cid/"));
        startActivity(buttonInsta);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}