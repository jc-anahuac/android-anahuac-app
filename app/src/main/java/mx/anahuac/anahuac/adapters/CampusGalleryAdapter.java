package mx.anahuac.anahuac.adapters;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

import mx.anahuac.anahuac.fragments.CampusGalleryFragment;
import mx.anahuac.anahuac.models.Campus;

public class CampusGalleryAdapter extends FragmentPagerAdapter {

    private List<Campus> campusList = Campus.getCampus();

    public CampusGalleryAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        CampusGalleryFragment fragment = new CampusGalleryFragment();
        Bundle args = new Bundle();
        args.putString("code", campusList.get(position).getCode());
        args.putInt("drawable", campusList.get(position).getImage());
        args.putString("name", campusList.get(position).getNombre());
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        return campusList.size();
    }
}
