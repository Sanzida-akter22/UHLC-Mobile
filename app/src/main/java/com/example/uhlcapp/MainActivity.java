package com.example.uhlcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ennext(View view) {

        Intent enrollmescreen = new Intent(MainActivity.this ,Enrolment.class );
        startActivity(enrollmescreen);
    }

    public void helpapp(View view) {

        Intent helpscreen=new Intent(MainActivity.this,helpActivity.class);
        startActivity(helpscreen);
        

    }
}