package com.example.tutotial05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    EditText Efirstname,Elastname,Eemail,Epass;
    RadioGroup genderR;
    Spinner spinnerS;
    Switch swt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showdata(View view) {

        Efirstname = findViewById(R.id.first_name);
        Elastname = findViewById(R.id.last_name);
        Eemail = findViewById(R.id.email);
        Epass = findViewById(R.id.password);
        genderR = findViewById(R.id.radioGrp);
        swt = findViewById(R.id.Aswt);

        String Sval = "";
        if(swt.isChecked()){
            Sval = "MCA";
        }
        else{
            Sval = "BCA";
        }

        int selectedID = genderR.getCheckedRadioButtonId();
        RadioButton gn = findViewById(selectedID);

        spinnerS = findViewById(R.id.spinner);

        String fname = Efirstname.getText().toString();
        String lname = Elastname.getText().toString();
        String email = Eemail.getText().toString();
        String pass = Epass.getText().toString();
        String gender = gn.getText().toString();
        String city = spinnerS.getSelectedItem().toString();

        Intent a = new Intent(MainActivity.this,MainActivity2.class);

        a.putExtra("fname",fname);
        a.putExtra("lname",lname);
        a.putExtra("email",email);
        a.putExtra("pass",pass);
        a.putExtra("gen",gender);
        a.putExtra("branch",Sval);
        a.putExtra("city",city);

        startActivity(a);
    }

}