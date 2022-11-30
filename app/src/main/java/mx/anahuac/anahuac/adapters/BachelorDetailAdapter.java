package mx.anahuac.anahuac.adapters;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

import mx.anahuac.anahuac.fragments.BachelorActivitiesFragment;
import mx.anahuac.anahuac.fragments.BachelorProfileFragment;
import mx.anahuac.anahuac.fragments.BachelorStudyFragment;
import mx.anahuac.anahuac.fragments.HomeHeaderFragment;
import mx.anahuac.anahuac.models.HomeHeader;

public class BachelorDetailAdapter extends FragmentPagerAdapter {

    String code;

    public BachelorDetailAdapter(@NonNull FragmentManager fm, String code) {
        super(fm);
        this.code = code;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        if (position==0) fragment = new BachelorProfileFragment();
        else if (position==1) fragment = new BachelorActivitiesFragment();
        else fragment = new BachelorStudyFragment();
        Bundle bundle = new Bundle();
        bundle.putString("code", code);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
