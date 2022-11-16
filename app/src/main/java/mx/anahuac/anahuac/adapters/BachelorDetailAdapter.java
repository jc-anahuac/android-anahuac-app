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

    public BachelorDetailAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position==1) return new BachelorProfileFragment();
        else if (position==2) return new BachelorActivitiesFragment();
        else return new BachelorStudyFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
