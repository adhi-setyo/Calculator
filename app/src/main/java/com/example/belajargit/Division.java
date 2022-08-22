package com.example.belajargit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Division extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
    }

    public void bagi(View v){
        EditText et1 = (EditText) findViewById(R.id.editTextNumber);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber3);
        EditText et3 = (EditText) findViewById(R.id.editTextNumber4);

        int a1= Integer.parseInt(et1.getText().toString());
        int a2= Integer.parseInt(et2.getText().toString());

        int result= a1/a2;

        et3.setText("" +result);
    }

    public void kembali(View v){
        startActivity(new Intent(Tambah.this, MainActivity.class));
        finish();
    }
}