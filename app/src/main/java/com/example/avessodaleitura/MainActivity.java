package com.example.avessodaleitura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView capaLivro = findViewById(R.id.capaLivro);

        capaLivro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMenu = new Intent(MainActivity.this, PersonagensActivity.class);
                startActivity(telaMenu);
                overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
            }
        });

    }
}