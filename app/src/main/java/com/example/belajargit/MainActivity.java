package com.example.belajargit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tambah(View v){
        Intent intent = new Intent(MainActivity.this, Tambah.class);
        startActivity(intent);
    }

    public void kurang(View v){
        Intent intent = new Intent(MainActivity.this, kurang.class);
        startActivity(intent);
    }

    public void bagi(View v){
        Intent intent = new Intent(MainActivity.this, Division.class);
        startActivity(intent);
    }
}