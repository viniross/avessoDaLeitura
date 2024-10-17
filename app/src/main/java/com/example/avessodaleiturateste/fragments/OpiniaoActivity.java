package com.example.avessodaleiturateste.fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.avessodaleiturateste.R;

public class OpiniaoActivity extends Fragment {

    ImageButton BtnHome;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Infla o layout para este fragmento e armazena a view inflada
        View view = inflater.inflate(R.layout.activity_opiniao, container, false);
        /*
        // Inicializa o botão BtnHome a partir da view inflada
        BtnHome = view.findViewById(R.id.BtnHome);

        // Define o comportamento do botão BtnHome
        BtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inicia a MenuActivity
                Fragment menuFragment = new MenuActivity();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, menuFragment);
                transaction.addToBackStack(null); // Para permitir voltar
                transaction.commit();

                //Intent menu = new Intent(getActivity(), MenuActivity.class);
                //startActivity(menu);
            }
        }); */

        // Retorna a view inflada
        return view;
    }
}
