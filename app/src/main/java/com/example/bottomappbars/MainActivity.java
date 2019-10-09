package com.example.bottomappbars;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    //https://www.androidhive.info/2017/12/android-working-with-bottom-navigation/

    //https://www.androhub.com/bottom-navigation-view-android/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.home:
                                Toast.makeText(getApplicationContext(),"Home",Toast.LENGTH_LONG).show();
                                break;
                            case R.id.trending:
                                Toast.makeText(getApplicationContext(),"Trending",Toast.LENGTH_LONG).show();

                                break;
                            case R.id.bookmarks:
                                Toast.makeText(getApplicationContext(),"Bookmarks",Toast.LENGTH_LONG).show();

                                break;
                            case R.id.activity:
                                Toast.makeText(getApplicationContext(),"Activity",Toast.LENGTH_LONG).show();

                                break;
                        }
                        return false;
                    }
                });


    }

}
