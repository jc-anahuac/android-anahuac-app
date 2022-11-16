package mx.anahuac.anahuac.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import mx.anahuac.anahuac.R;

public class UsGalleryFragment extends Fragment {

    ImageView ivUsGallery;

    public UsGalleryFragment(){super(R.layout.fragment_us_gallery);}

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceSate){

        ivUsGallery = view.findViewById(R.id.iv_us_gallery);
        ivUsGallery.setImageResource(getArguments().getInt("drawable"));
    }
}
