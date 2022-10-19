package com.example.t1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.Btn1);
        //////////////////////////////////////////////////////////////////////
        final Intent Intent = new Intent(getApplicationContext(),Act2.class);
        String name = "Sajith Lakshan";
        Intent.putExtra("USER_NAME",name);
        int AGE = 14;
        Intent.putExtra("USER_AGE",AGE);


        //////////////////////////////////////////////////////////////////////
        Bundle extres = new Bundle();
        extres.putString("B_NAME",name+ " Bundle");
        extres.putInt("B_AGE",18435);
        Intent.putExtras(extres);
        //*****************************************
        String[] myStrings=new String[2];
        myStrings[0]="MONDAY";
        myStrings[1]="TUESDAY";
        Intent.putExtra("strings", myStrings);
        Intent.putExtras(extres);
        //------------------------------------------------------
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(Intent);


            }
        });
    }
}