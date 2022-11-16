package mx.anahuac.anahuac.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import mx.anahuac.anahuac.R;
import mx.anahuac.anahuac.adapters.BachelorDetailAdapter;

public class BachelorDetailActivity extends AppCompatActivity {

    ViewPager viewPagerBachelorDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bachelor_detail);

        viewPagerBachelorDetail = findViewById(R.id.vp_details);

        viewPagerBachelorDetail.setAdapter(new BachelorDetailAdapter(getSupportFragmentManager()));

    }


}