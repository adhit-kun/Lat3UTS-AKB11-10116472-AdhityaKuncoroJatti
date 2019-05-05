package com.ayaya.myselfapp;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import com.ayaya.myselfapp.Fragment.aboutFragment;
import com.ayaya.myselfapp.Fragment.dailyFragment;
import com.ayaya.myselfapp.Fragment.galleryFragment;
import com.ayaya.myselfapp.Fragment.homeFragment;
import com.ayaya.myselfapp.Fragment.music_videoFragment;
import com.ayaya.myselfapp.Fragment.profileFragment;

public class MainMenuActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new homeFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_Home);
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.nav_Home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new homeFragment()).commit();
                break;

            case R.id.nav_Daily:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new dailyFragment()).commit();
                break;

            case R.id.nav_Gallery:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new galleryFragment()).commit();
                break;

            case R.id.nav_Music_Videos:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new music_videoFragment()).commit();
                break;

            case R.id.nav_Profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new profileFragment()).commit();
                break;

            case R.id.nav_about:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new aboutFragment()).commit();
                break;

        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
