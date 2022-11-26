package mx.anahuac.anahuac.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import mx.anahuac.anahuac.R;
import mx.anahuac.anahuac.models.Licenciatura;

public class BachelorStudyFragment extends Fragment {

    Button contact;
    TextView textViewStudyPlan;
    TextView textViewStudyTitle;

    public BachelorStudyFragment(){
        super(R.layout.fragment_bachelor_studyplan);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        contact = view.findViewById(R.id.btn_contact_study);
        textViewStudyPlan = view.findViewById(R.id.p_studyplan);
        textViewStudyTitle = view.findViewById(R.id.h1_studyplan);
        Licenciatura lic = Licenciatura.getLicenciaturaByCode(getArguments().getString("code"));

        if (lic != null) {
            textViewStudyTitle.setText("PLAN DE ESTUDIOS DE " + lic.getName());
            textViewStudyPlan.setText(lic.getPlanEstudio());
        }

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.anahuac.mx/cancun/contacto");
            }
        });
    }

    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
