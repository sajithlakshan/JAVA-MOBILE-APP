package com.example.t1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Act2 extends AppCompatActivity {

    TextView textname ,B_NAME,T_Age ,B_age,B_Array_1,B_Array_2;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        Button btn = findViewById(R.id.bu2);
        //////////////////////////////////////////////////////////
        Intent intent = getIntent();
        String Name = intent.getStringExtra("USER_NAME");


        textname = findViewById(R.id.tex2);

        textname.setText(Name);
        //------------------------------------
        int Age = intent.getIntExtra("USER_AGE",0);
        T_Age = findViewById(R.id.id_Age);
        T_Age.setText(String.valueOf(Age));
        //////////////////////////////////////////////////////////
        Bundle extras = intent.getExtras();
        String B_name = extras.getString("B_NAME");
        int B_Age    = extras.getInt("B_AGE");
        B_NAME = findViewById(R.id.B_Name);
        B_age = findViewById(R.id.B_AGE);
        B_NAME.setText(B_name);
        B_age.setText(String.valueOf(B_Age));
        ///////////////////////////////////////////////////

        Bundle extrasI=intent.getExtras();
      //  System.out.println(extrasI);
        B_Array_1 = findViewById(R.id.b_Array1);
        B_Array_2 = findViewById(R.id.b_Array2);

        if(extrasI != null)  //this line is necessary for getting any value
        {

            String[] fajr_Values = intent.getStringArrayExtra("strings");
            B_Array_1.setText(fajr_Values[0]);
            B_Array_2.setText(fajr_Values[1]);
        }







        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent I = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(I);


            }
        });
    }
}