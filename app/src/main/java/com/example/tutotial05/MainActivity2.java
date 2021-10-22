package com.example.tutotial05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Tfname = findViewById(R.id.firstname);
        TextView Tlname = findViewById(R.id.lastname);
        TextView Temail = findViewById(R.id.email);
        TextView Tpassword = findViewById(R.id.pass);
        TextView Tgen = findViewById(R.id.gender);
        TextView Tbranch = findViewById(R.id.branch);
        TextView Tcity = findViewById(R.id.city);

        String s1 = getIntent().getStringExtra("fname");
        String s2 = getIntent().getStringExtra("lname");
        String s3 = getIntent().getStringExtra("email");
        String s4 = getIntent().getStringExtra("pass");
        String s5 = getIntent().getStringExtra("gen");
        String s6 = getIntent().getStringExtra("branch");
        String s7 = getIntent().getStringExtra("city");

        Tfname.setText(s1);
        Tlname.setText(s2);
        Temail.setText(s3);
        Tpassword.setText(s4);
        Tgen.setText(s5);
        Tbranch.setText(s6);
        Tcity.setText(s7);
    }
}