package com.example.myfirstapp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;

import com.example.myfirstapp.databinding.ActivityMainBinding;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;
    private AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.topbarInclude.toolbar);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
         appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        // Custom drawer toggle
        Drawable customIcon = getResources().getDrawable(R.drawable.burger_menu);
        toggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                binding.topbarInclude.toolbar, // link to the toolbar
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close) {

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                // Additional behavior when the drawer is opened.
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                // Additional behavior when the drawer is closed.
            }
        };

        toggle.setDrawerIndicatorEnabled(true);
        toggle.setHomeAsUpIndicator(customIcon);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        binding.topbarInclude.toolbar.setNavigationIcon(customIcon);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.nav_curriculum) {
                    // Navigate or execute logic
                    Navigation.findNavController(MainActivity.this, R.id.nav_host_fragment_content_main).navigate(R.id.action_global_to_Curriculum);
                } else if (itemId == R.id.nav_quizzes) {
                    // Navigate or execute logic
                } else if (itemId == R.id.nav_accountabilities) {
                    // Navigate or execute logic
                } else if (itemId == R.id.nav_case_worker) {
                    Navigation.findNavController(MainActivity.this, R.id.nav_host_fragment_content_main).navigate(R.id.action_global_to_caseworker);
                } else if (itemId == R.id.nav_account) {
                    // Navigate or execute logic
                } else if (itemId == R.id.ToDoComponent) {
                    Navigation.findNavController(MainActivity.this, R.id.nav_host_fragment_content_main).navigate(R.id.action_global_to_home);
                }

                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle the custom toggle behavior
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
