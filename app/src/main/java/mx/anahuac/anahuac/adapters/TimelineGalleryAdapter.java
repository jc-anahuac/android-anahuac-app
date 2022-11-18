package mx.anahuac.anahuac.adapters;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

import mx.anahuac.anahuac.fragments.TimelineGalleryFragment;
import mx.anahuac.anahuac.models.TimelineGallery;


public class TimelineGalleryAdapter extends FragmentPagerAdapter{

    private List<TimelineGallery> items = TimelineGallery.getTimelineGallery();

    public TimelineGalleryAdapter(@NonNull FragmentManager fm) { super(fm); }

    @NonNull
    @Override
    public Fragment getItem (int position){

        TimelineGalleryFragment fragment = new TimelineGalleryFragment();
        Bundle args = new Bundle();
        args.putInt("drawable", items.get(position).getImage());
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        return items.size();
    }

}
