package com.example.it_language_test;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.it_language_test.fragment.CssFragment;
import com.example.it_language_test.fragment.HomeFragment;
import com.example.it_language_test.fragment.JavaFragment;
import com.example.it_language_test.fragment.PythonFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    public static final int FRAGMENT_HOME = 0;
    public static final int FRAGMENT_CSS = 1;
    public static final int FRAGMENT_JAVA = 2;
    public static final int FRAGMENT_PYTHON = 3;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    private int currentFragment = FRAGMENT_HOME;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_drawer_open, R.string.nav_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        replaceFragment(new HomeFragment());
        navigationView.getMenu().findItem(R.id.nav_home).setChecked(true);
    }

    private void replaceFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frnContent,fragment);
        transaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.nav_home){
            if(currentFragment != FRAGMENT_HOME){
                replaceFragment(new HomeFragment());
                toolbar.setTitle("Home");
                currentFragment = FRAGMENT_HOME;
            }
        } else if (id == R.id.nav_css) {
            if(currentFragment != FRAGMENT_CSS){
                replaceFragment(new CssFragment());
                toolbar.setTitle("Css");
                currentFragment = FRAGMENT_CSS;
            }
        } else if (id == R.id.nav_java) {
            if(currentFragment != FRAGMENT_JAVA){
                replaceFragment(new JavaFragment());
                toolbar.setTitle("Java");
                currentFragment = FRAGMENT_JAVA;
            }
        } else if (id == R.id.nav_python) {
            if(currentFragment != FRAGMENT_PYTHON){
                replaceFragment(new PythonFragment());
                toolbar.setTitle("Python");
                currentFragment = FRAGMENT_PYTHON;
            }
        }
        return true;
    }

    //Nhấn nút lùi về
    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }
}