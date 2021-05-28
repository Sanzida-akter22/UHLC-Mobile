package com.example.mainscreen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;

public class Class412 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class412);



    }


    public void link(View view) {


        Uri uri = Uri.parse("https://meet.google.com/vze-cjjf-jce?fbclid=IwAR3uACfgUqJZg9kDR_HEA4u1z5MElEPympnRkPdbeA6tzbpxOYsgPZw7Zu0");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}