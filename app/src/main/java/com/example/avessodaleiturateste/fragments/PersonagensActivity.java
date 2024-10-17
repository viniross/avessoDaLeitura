package com.example.avessodaleiturateste.fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.avessodaleiturateste.R;

public class PersonagensActivity extends Fragment {

    ImageButton BtnHome;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Infla o layout para este fragmento e armazena na variável "view"
        View view = inflater.inflate(R.layout.activity_personagens, container, false);
        /*
        // Inicializa o botão BtnHome a partir da view inflada
        BtnHome = view.findViewById(R.id.BtnHome);

        // Define o comportamento do botão BtnHome
        BtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inicia a MenuActivity
                Intent menu = new Intent(getActivity(), MenuActivity.class);
                startActivity(menu);
            }
        }); */

        // Retorna a view inflada
        return view;
    }
}
