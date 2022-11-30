package mx.anahuac.anahuac.activities;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

import mx.anahuac.anahuac.R;
import mx.anahuac.anahuac.adapters.TimelineGalleryAdapter;
import mx.anahuac.anahuac.adapters.UsGalleryAdapter;

public class UsActivity extends AppCompatActivity {

    private ViewPager viewPagerUs, viewPagerTimeline;
    private WormDotsIndicator wormDotsIndicatorUs, wormDotsIndicatorTimeline;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_us);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_new_24);

        viewPagerUs = findViewById(R.id.view_pager_us);
        wormDotsIndicatorUs = findViewById(R.id.worm_dots_indicator_us);

        viewPagerUs.setAdapter(new UsGalleryAdapter(getSupportFragmentManager()));
        wormDotsIndicatorUs.attachTo(viewPagerUs);



        viewPagerTimeline = findViewById(R.id.view_pager_timeline);
        wormDotsIndicatorTimeline = findViewById(R.id.worm_dots_indicator_timeline);

        viewPagerTimeline.setAdapter(new TimelineGalleryAdapter(getSupportFragmentManager()));
        wormDotsIndicatorTimeline.attachTo(viewPagerTimeline);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }


}

