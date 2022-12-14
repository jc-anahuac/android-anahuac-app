package mx.anahuac.anahuac.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

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
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_new_24);

         List<Licenciatura> data = Licenciatura.getLicenciaturasBySchool(code);
         rvLicenciaturas.setAdapter(new BachelorSublistAdapter(data));
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}