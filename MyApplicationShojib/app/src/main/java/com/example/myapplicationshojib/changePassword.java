package com.example.myapplicationshojib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class changePassword extends AppCompatActivity {
    private EditText old;
    private EditText neew;
    private Button submit, back ;
    private String o,n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        old= (EditText) findViewById(R.id.oldPassword);
        neew= (EditText) findViewById(R.id.newPassword);
        submit= (Button) findViewById(R.id.button);
        back= (Button) findViewById(R.id.button2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previous();
            }


        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change();
            }


        });
    }
    private void change() {
        o= old.getText().toString();
        n= neew.getText().toString();
        Toast.makeText(this, "Password Change Successfully ", Toast.LENGTH_SHORT).show();

    }

    private void previous() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}