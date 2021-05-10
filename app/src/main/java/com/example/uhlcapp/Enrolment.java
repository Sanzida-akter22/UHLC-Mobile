package com.example.uhlcapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Enrolment extends AppCompatActivity {
    private String testcoursename="cse438";
    private String testenrollkey="123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enrolment);
    }

    public void enoption(View view) {
        TextView coursename= findViewById(R.id.coursenamefield);
        TextView enrollkey= findViewById(R.id.keyfield);
        String coursenameText=coursename.getText().toString();
        String enrollkeyText=enrollkey.getText().toString();
        TextView wronglabel = findViewById(R.id.wrong);
        if (this.testcoursename.equals(coursenameText)&& this.testenrollkey.equals(enrollkeyText)){

            wronglabel.setText("succesfull");
        }
        else {
            wronglabel.setText("wrong informeton");

        }
    }
}