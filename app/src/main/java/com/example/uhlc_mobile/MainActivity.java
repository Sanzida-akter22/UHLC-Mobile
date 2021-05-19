package com.example.uhlc_mobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  String usernameTest = "test";
    private String passwordTest= "test123";
    public static final String tag = "MainActivity" ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag, "onCreate called");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "onCreate called");
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.d(tag, "onSaveInstanceState called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "onStop called");
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDestroy called");
    }





    public void singIn(View view) {
        TextView usernamefild = findViewById(R.id.username);
        TextView passwordfild = findViewById(R.id.password);

        String usernameText = usernamefild.getText().toString();
        String passwordText = passwordfild.getText().toString();

        if (this.usernameTest.equals(usernameText) && this.passwordTest.equals(passwordText))

        {

            TextView errorLabel = findViewById(R.id.textView);
            errorLabel.setTextColor(Color.GREEN);
            errorLabel.setText("done");
        }
        else
        {

            TextView errorLabel = findViewById(R.id.textView);
            errorLabel.setTextColor(Color.RED);
            errorLabel.setText("Wrong user id or password");
        }
    }

    public void singup(View view) {
        Intent newscreen = new Intent(MainActivity.this , Registration.class);
        startActivity(newscreen);
    }
    }
