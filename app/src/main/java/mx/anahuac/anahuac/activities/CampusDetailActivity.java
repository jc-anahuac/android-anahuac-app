package mx.anahuac.anahuac.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import mx.anahuac.anahuac.R;
import mx.anahuac.anahuac.models.Campus;

public class CampusDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus_detail);

        Campus campus = Campus.findByCode(getIntent().getStringExtra("code"));
        Toast.makeText(this, campus.getNombre(), Toast.LENGTH_LONG).show();
    }
}