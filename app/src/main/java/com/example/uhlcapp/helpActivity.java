package com.example.uhlcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class helpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }

    public void aboutapp(View view) {
        Intent aboutscreen=new Intent(helpActivity.this,aboutActivity.class);
        startActivity(aboutscreen);


    }

    public void faqmore(View view) {
        Intent faqscreen=new Intent(helpActivity.this,faqActivity.class);
        startActivity(faqscreen);
    }
}