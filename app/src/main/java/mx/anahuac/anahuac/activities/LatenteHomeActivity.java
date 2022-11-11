package mx.anahuac.anahuac.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mx.anahuac.anahuac.R;

public class LatenteHomeActivity extends AppCompatActivity {

    private Button btnConocenos;
    private Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latente_home);

        btnConocenos = findViewById(R.id.btn_conocenos);
        btnClick = findViewById(R.id.btn_click);

        btnConocenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}