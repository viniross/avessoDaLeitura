package com.example.avessodaleiturateste.fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.avessodaleiturateste.R;

public class SinopseActivity extends Fragment {

    ImageView BtnHome;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Infla o layout para este fragmento
        View view = inflater.inflate(R.layout.activity_sinopse, container, false);
        /*
        // Inicializa o BtnHome a partir da view inflada
        BtnHome = view.findViewById(R.id.BtnHome);
        BtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retorna ao menu principal
                Intent menuIntent = new Intent(getActivity(), MenuActivity.class);
                startActivity(menuIntent);
            }
        });*/

        return view; // Retorna a view inflada
    }
}