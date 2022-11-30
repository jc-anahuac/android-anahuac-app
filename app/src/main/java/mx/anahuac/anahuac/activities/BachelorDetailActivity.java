package mx.anahuac.anahuac.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;
import mx.anahuac.anahuac.R;
import mx.anahuac.anahuac.adapters.BachelorDetailAdapter;
import mx.anahuac.anahuac.models.Licenciatura;

public class BachelorDetailActivity extends AppCompatActivity {

    ViewPager viewPagerBachelorDetail;
    TabLayout tabLayout;
    ActionBar actionBar;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bachelor_detail);
        String code = getIntent().getStringExtra("code");
        Licenciatura lic = Licenciatura.getLicenciaturaByCode(code);

        imageView = findViewById(R.id.bachelorHeader);

        if (lic != null) {
            setTitle(lic.getName());
            imageView.setImageResource(lic.getImageDetail());
        }


        viewPagerBachelorDetail = findViewById(R.id.vp_details);
        tabLayout = findViewById(R.id.tl_TableDetail);
        viewPagerBachelorDetail.setAdapter(new BachelorDetailAdapter(getSupportFragmentManager(),code));

        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override

            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerBachelorDetail.setCurrentItem(tabLayout.getSelectedTabPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        viewPagerBachelorDetail.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }


}

