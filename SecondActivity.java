package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void btnLoginClicked(View v){

        EditText etName = findViewById(R.id.etName);
        EditText etUsn = findViewById(R.id.etUsn);
        String Name = etName.getText().toString();
        String Usn = etUsn.getText().toString();
        if(!Name.isEmpty())
        {
            Toast.makeText(SecondActivity.this,"Hello "+Name,Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this,ThirdActivity.class);
            i.putExtra("Name", Name);
            i.putExtra("USN",Usn);
            startActivity(i);


        }
        else {
            Toast.makeText(SecondActivity.this,"Enter Name ",Toast.LENGTH_SHORT).show();

        }
    }







}