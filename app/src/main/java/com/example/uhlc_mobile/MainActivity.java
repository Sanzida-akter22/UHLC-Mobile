package com.example.uhlc_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  String usernameTest = "test";
    private String passwordTest= "test123";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
