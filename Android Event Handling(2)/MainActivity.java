package com.example.ma1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button button;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Show Layout xml
        /////////////////////////////////////////////////////
        button = findViewById(R.id.btnOK);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = findViewById(R.id.textHello);
                text.setText("Yooooo Niga Weda onClick");

            }
        });

        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                TextView myText = (TextView)findViewById(R.id.textHello);
                myText.setText("Yooooo Niga Loong shot");
                return false;



            }
        });


    }


}