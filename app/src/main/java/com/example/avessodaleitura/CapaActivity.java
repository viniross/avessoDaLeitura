package com.example.avessodaleitura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.avessodaleitura.fragments.MenuActivity;

public class CapaActivity extends AppCompatActivity {

    ImageView capaLivro = findViewById(R.id.capaLivro);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capa);

        capaLivro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMenu = new Intent(CapaActivity.this, MenuActivity.class);
                startActivity(telaMenu);
                overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
            }
        });
    }
}