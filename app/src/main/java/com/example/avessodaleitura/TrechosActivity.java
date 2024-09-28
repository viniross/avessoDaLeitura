package com.example.avessodaleitura;

import static android.provider.Settings.System.getString;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TrechosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trechos);

String texto = getString(R.string.texto1);

    }
}