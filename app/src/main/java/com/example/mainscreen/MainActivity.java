package com.example.mainscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    androidx.appcompat.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar= (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        nav=(NavigationView)findViewById(R.id.navmenu);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer);
        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                int id=item.getItemId();



                if (id==R.id.menu_profile)
                {

                    Intent intent = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(intent);

                    return true;
                }
                else if (id==R.id.menu_class)

                {
                    Intent intent = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(intent);



                    return true;
                }

                else if (id==R.id.menu_Enroll)

                {
                    Intent intent = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(intent);

                    return true;
                }

                else if(id==R.id.menu_Help)

                {
                    Intent intent = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(intent);

                    return true;
                }
                else if (id==R.id.Settings)

                {
                    Intent intent = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(intent);

                    return true;


                }



                    return true;
                }

        });


}
}
