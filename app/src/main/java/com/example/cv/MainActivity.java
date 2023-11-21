package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView,telephone,email,adress,check;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.id1);
        textView.setText(getIntent().getStringExtra("aze"));
        telephone=findViewById(R.id.Tele);
        telephone.setText(getIntent().getStringExtra("tele"));
        email=findViewById(R.id.Email);
        email.setText(getIntent().getStringExtra("Email"));
        adress=findViewById(R.id.adress);
        adress.setText(getIntent().getStringExtra("Adress"));
        check=findViewById(R.id.et_check);
        check.setText(getIntent().getStringExtra("check"));
    }
}