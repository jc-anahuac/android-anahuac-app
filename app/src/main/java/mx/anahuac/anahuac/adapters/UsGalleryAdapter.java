package mx.anahuac.anahuac.adapters;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

import mx.anahuac.anahuac.fragments.UsGalleryFragment;
import mx.anahuac.anahuac.models.UsGallery;

public class UsGalleryAdapter extends FragmentPagerAdapter{

    private List<UsGallery> items = UsGallery.getUsGallery();

    public UsGalleryAdapter(@NonNull FragmentManager fm) { super(fm); }

    @NonNull
    @Override
    public Fragment getItem (int position){

        UsGalleryFragment fragment = new UsGalleryFragment();
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
