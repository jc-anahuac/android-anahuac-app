package mx.anahuac.anahuac.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import mx.anahuac.anahuac.R;
import mx.anahuac.anahuac.activities.CampusDetailActivity;

public class CampusGalleryFragment extends Fragment {

    public CampusGalleryFragment(){
        super(R.layout.fragment_gallery_campus);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView imageView = view.findViewById(R.id.iv_campus);
        TextView textView = view.findViewById(R.id.tv_campus_name);

        imageView.setImageResource(getArguments().getInt("drawable"));
        textView.setText(getArguments().getString("name"));

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), CampusDetailActivity.class);
                intent.putExtra("code", getArguments().getString("code"));
                startActivity(intent);
            }
        });

    }
}
