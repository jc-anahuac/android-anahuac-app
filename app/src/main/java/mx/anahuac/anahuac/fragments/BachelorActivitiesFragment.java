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

public class BachelorActivitiesFragment extends Fragment {

    Button contact;
    TextView textViewTitle;
    TextView textViewDescription;
    ImageView imageViewActivity;

    public BachelorActivitiesFragment(){
        super(R.layout.fragment_bachelor_activities);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        contact = view.findViewById(R.id.btn_contact_activities);
        textViewTitle = view.findViewById(R.id.h1_activities);
        textViewDescription = view.findViewById(R.id.p_activities);
        imageViewActivity = view.findViewById(R.id.iv_activities);

        Licenciatura lic = Licenciatura.getLicenciaturaByCode(getArguments().getString("code"));
        if (lic != null) {
            textViewTitle.setText("ACTIVIDADES DE " + lic.getName());
            textViewDescription.setText(lic.getActivity());
            imageViewActivity.setImageResource(lic.getImageActivity());
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
