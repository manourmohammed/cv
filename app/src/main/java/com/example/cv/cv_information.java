package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class cv_information extends AppCompatActivity {
    EditText et1,telephone,email,adress;
    Button btn;
    RadioButton check;


    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv_information);
        et1=findViewById(R.id.et_1);
        btn=findViewById(R.id.btn);
        telephone=findViewById(R.id.telephone);
        email=findViewById(R.id.email);
        adress=findViewById(R.id.editTextText);
        check=findViewById(R.id.check1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t= String.valueOf(telephone.getText());
                Intent intent=new Intent(cv_information.this,MainActivity.class);


                if (t.length()!=10 | (!check.isChecked()) ){
                    Toast.makeText(cv_information.this, "ne peut pas passe 10 caracter", Toast.LENGTH_SHORT).show();
                }else{intent.putExtra("tele",String.format("Telephone:%s",t));
                intent.putExtra("aze",et1.getText().toString());
                intent.putExtra("Email",String.format("email:%s",email.getText().toString()));
                intent.putExtra("Adress",String.format("Adress:%s",adress.getText().toString()));
                intent.putExtra("check","Francais");
                startActivity(intent);
            }
                }

        });

    }
}