package com.example.avessodaleitura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    TextView txtTpc1, txtTpc2, txtTpc3, txtTpc4, txtTpc5, txtTpc6, txtTpc7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        txtTpc1 = findViewById(R.id.txtTpc1);
        txtTpc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sinopse = new Intent(getApplicationContext(), SinopseActivity.class);
                startActivity(sinopse);
            }
        });
        txtTpc2 = findViewById(R.id.txtTpc2);
        txtTpc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sobreAutor = new Intent(getApplicationContext(), AutorActivity.class);
                startActivity(sobreAutor);
            }
        });
        txtTpc3 = findViewById(R.id.txtTpc3);
        txtTpc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent opiniao = new Intent(getApplicationContext(), OpiniaoActivity.class);
                startActivity(opiniao);
            }
        });
        txtTpc4 = findViewById(R.id.txtTpc4);
        txtTpc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent personagens = new Intent(getApplicationContext(), PersonagensActivity.class);
                startActivity(personagens);
            }
        });
        txtTpc6 = findViewById(R.id.txtTpc6);
        txtTpc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent trechos = new Intent(getApplicationContext(), TrechosActivity.class);
                startActivity(trechos);
            }
        });
        txtTpc5 = findViewById(R.id.txtTpc5);
        txtTpc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent timeline1 = new Intent(getApplicationContext(), TimeLineActivity1.class);
                startActivity(timeline1);
            }
        });
        txtTpc7 = findViewById(R.id.txtTpc7);
        txtTpc7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fofoca = new Intent(getApplicationContext(), FofocaActivity.class);
                startActivity(fofoca);
            }
        });
    }
}