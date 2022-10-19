package com.example.t1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.Btn1);
        ////////////////////////////////////////////////////////
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"sajithlakshan199@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT,"This is Your Subject");
        intent.putExtra(Intent.EXTRA_TEXT,"THis is your test email Zukomi");
        intent.setType("message/rfc822");

        Intent chooser = Intent.createChooser(intent,"Send to The Hell");

        btn.setOnClickListener(view -> {
            startActivity(chooser);

        });
    }
}