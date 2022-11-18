package mx.anahuac.anahuac.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import mx.anahuac.anahuac.R;

public class TimelineGalleryFragment extends Fragment {

    ImageView ivTimelineGallery;

    public TimelineGalleryFragment(){super(R.layout.fragment_timeline_gallery);}

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){

        ivTimelineGallery = view.findViewById(R.id.iv_timeline_gallery);
        ivTimelineGallery.setImageResource(getArguments().getInt("drawable"));
    }

}
