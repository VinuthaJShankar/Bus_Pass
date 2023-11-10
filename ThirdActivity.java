package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = getIntent();

        TextView textName = findViewById(R.id.textView);

        TextView textUsn = findViewById(R.id.textUsn);

        String name = intent.getStringExtra("Name");
        String usn = intent.getStringExtra("USN");

        textName.setText(name);
        textUsn.setText(usn);

    }


}