package mx.anahuac.anahuac.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import mx.anahuac.anahuac.R;
import mx.anahuac.anahuac.adapters.BachelorSublistAdapter;
import mx.anahuac.anahuac.models.Escuela;
import mx.anahuac.anahuac.models.Licenciatura;

public class BachelorSubListActivity extends AppCompatActivity {

    RecyclerView rvLicenciaturas;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bachelor_sub_list);
        String code = getIntent().getStringExtra("code");

        rvLicenciaturas = findViewById(R.id.rv_licenciaturas);

         List<Licenciatura> data = Licenciatura.getLicenciaturasBySchool(code);
         rvLicenciaturas.setAdapter(new BachelorSublistAdapter(data));
    }
}