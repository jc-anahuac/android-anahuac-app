package mx.anahuac.anahuac.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import mx.anahuac.anahuac.R;
import mx.anahuac.anahuac.models.Licenciatura;

public class BachelorProfileFragment extends Fragment {

    Button contact;
    TextView textView;
    TextView textViewProfileDetail;
    ImageView imageViewProfileDetail;

    public BachelorProfileFragment(){
        super(R.layout.fragment_bachelor_profile);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        contact = view.findViewById(R.id.btn_contact_profile);
        textView = view.findViewById(R.id.h1_Perfil);
        textViewProfileDetail = view.findViewById(R.id.p_profile);
        imageViewProfileDetail = view.findViewById(R.id.iv_Profile);
        Licenciatura lic = Licenciatura.getLicenciaturaByCode(getArguments().getString("code"));
        if (lic != null) {
            textView.setText("PERFIL DE " + lic.getName());
            textViewProfileDetail.setText(lic.getProfile());
            imageViewProfileDetail.setImageResource(lic.getImageProfile());
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
