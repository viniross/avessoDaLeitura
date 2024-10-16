package com.example.avessodaleiturateste.fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.avessodaleiturateste.MainActivity;
import com.example.avessodaleiturateste.R;

public class AutorActivity extends Fragment {

    ImageView BtnHome;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Infla o layout para este fragmento
        View view = inflater.inflate(R.layout.activity_autor, container, false);

        // Inicializa o ImageView BtnHome a partir da view inflada
        BtnHome = view.findViewById(R.id.BtnHome);

        // Define o comportamento do botão BtnHome
        BtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(),"Ola Juventude",Toast.LENGTH_SHORT).show();

                // Substitui o AutorActivity pelo MenuActivity como fragmento
                /*getParentFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, MenuActivity.class, null) // Certifique-se de que o 'fragment_container' está definido no layout da activity principal
                        .setReorderingAllowed(true)
                        .addToBackStack(null)
                        .commit();*/


            }
        });

        return view; // Retorna a view inflada
    }
}
