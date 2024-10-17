package com.example.avessodaleiturateste.fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.avessodaleiturateste.R;

public class MenuActivity extends Fragment {

    //TextView txtTpc1, txtTpc2, txtTpc3, txtTpc4, txtTpc5, txtTpc6, txtTpc7;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Infla o layout para este fragmento
        View view = inflater.inflate(R.layout.activity_menu, container, false);
        /*
        // Configura os TextViews e seus respectivos OnClickListeners
        txtTpc1 = view.findViewById(R.id.txtTpc1);
        txtTpc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sinopse = new Intent(getActivity(), SinopseActivity.class);
                startActivity(sinopse);
            }
        });

        txtTpc2 = view.findViewById(R.id.txtTpc2);
        txtTpc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sobreAutor = new Intent(getActivity(), AutorActivity.class);
                startActivity(sobreAutor);
            }
        });

        txtTpc3 = view.findViewById(R.id.txtTpc3);
        txtTpc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent opiniao = new Intent(getActivity(), OpiniaoActivity.class);
                startActivity(opiniao);
            }
        });

        txtTpc4 = view.findViewById(R.id.txtTpc4);
        txtTpc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent personagens = new Intent(getActivity(), PersonagensActivity.class);
                startActivity(personagens);
            }
        });

        txtTpc5 = view.findViewById(R.id.txtTpc5);
        txtTpc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent timeline1 = new Intent(getActivity(), LinhaDoTempoActivity.class);
                startActivity(timeline1);
            }
        });

        txtTpc6 = view.findViewById(R.id.txtTpc6);
        txtTpc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trechos = new Intent(getActivity(), TrechosActivity.class);
                startActivity(trechos);
            }
        });

        txtTpc7 = view.findViewById(R.id.txtTpc7);
        txtTpc7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fofoca = new Intent(getActivity(), RepercussaoActivity.class);
                startActivity(fofoca);
            }
        }); */

        return view; // Retorna a view inflada
    }
}
