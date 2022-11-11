package mx.anahuac.anahuac.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

import mx.anahuac.anahuac.R;
import mx.anahuac.anahuac.adapters.CampusGalleryAdapter;
import mx.anahuac.anahuac.adapters.HomeHeaderAdapter;
import mx.anahuac.anahuac.adapters.LicenciaturasAdapter;
import mx.anahuac.anahuac.models.Licenciatura;

public class HomeActivity extends AppCompatActivity implements LicenciaturasAdapter.LicenciaturaListener {

    private ViewPager viewPager, viewPagerCampus;
    private WormDotsIndicator wormDotsIndicator, campusIndicator;
    private ImageView ivMenu, ivClose;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private RecyclerView rvLicenciaturas;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        viewPager = findViewById(R.id.view_pager);
        wormDotsIndicator = findViewById(R.id.worm_dots_indicator);
        ivMenu = findViewById(R.id.iv_menu);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
        ivClose = navigationView.getHeaderView(0).findViewById(R.id.iv_close);
        rvLicenciaturas = findViewById(R.id.rv_licenciaturas);
        viewPagerCampus = findViewById(R.id.vp_campus);
        campusIndicator = findViewById(R.id.campus_indicator);

        viewPager.setAdapter(new HomeHeaderAdapter(getSupportFragmentManager()));
        wormDotsIndicator.attachTo(viewPager);

        viewPagerCampus.setAdapter(new CampusGalleryAdapter(getSupportFragmentManager()));
        campusIndicator.attachTo(viewPagerCampus);

        rvLicenciaturas.setAdapter(new LicenciaturasAdapter(Licenciatura.getLicenciaturas(), this));

        ivMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.open();
            }
        });

        ivClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.closeDrawers();
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nosotros:
                        goNosotros();
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.licenciaturas:
                        goLicenciatuasList();
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.latente:
                        goLatente();
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.acercade:
                        goAcercade();
                        drawerLayout.closeDrawers();
                        break;
                }
                return false;
            }
        });

        Button btnCampus = findViewById(R.id.btn_campus);
        btnCampus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goCampus();
            }
        });
    }

    private void goNosotros(){
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    private void goLicenciatuasList(){
        Intent intent = new Intent(this, BachelorListActivity.class);
        startActivity(intent);
    }

    private void goLicencituraDetail(){
        Intent intent = new Intent(this, BachelorDetailActivity.class);
        startActivity(intent);
    }

    private void goCampus(){
        Intent intent = new Intent(this, CampusDetailActivity.class);
        startActivity(intent);
    }

    private void goAcercade(){
        Intent intent = new Intent(this, AboutAppActivity.class);
        startActivity(intent);
    }

    private void goLatente(){
        Intent intent = new Intent(this, LatenteHomeActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClickLicenciatura(Licenciatura licenciatura) {
        goLicencituraDetail();
    }
}