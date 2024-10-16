package com.example.avessodaleiturateste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.avessodaleiturateste.fragments.CapaActivity;
import com.example.avessodaleiturateste.fragments.MenuActivity;
import com.example.avessodaleiturateste.fragments.OpiniaoActivity2;
import com.example.avessodaleiturateste.fragments.SinopseActivity;
import com.example.avessodaleiturateste.fragments.AutorActivity;
import com.example.avessodaleiturateste.fragments.OpiniaoActivity;
import com.example.avessodaleiturateste.fragments.PersonagensActivity;
import com.example.avessodaleiturateste.fragments.TrechosActivity;
import com.example.avessodaleiturateste.fragments.LinhaDoTempoActivity;
import com.example.avessodaleiturateste.fragments.LinhaDoTempo2Activity;
import com.example.avessodaleiturateste.fragments.RepercussaoActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configurando o ViewPager2
        viewPager = findViewById(R.id.viewPager);

        // Criando o adaptador e adicionando os fragmentos
        adapter = new ViewPagerAdapter(this);
        adapter.addFragment(new CapaActivity());
        adapter.addFragment(new MenuActivity());
        adapter.addFragment(new SinopseActivity());
        adapter.addFragment(new AutorActivity());
        adapter.addFragment(new OpiniaoActivity());
        adapter.addFragment(new OpiniaoActivity2());
        adapter.addFragment(new PersonagensActivity());
        adapter.addFragment(new TrechosActivity());
        adapter.addFragment(new LinhaDoTempoActivity());
        adapter.addFragment(new LinhaDoTempo2Activity());
        adapter.addFragment(new RepercussaoActivity());

        // Definindo o adaptador no ViewPager
        viewPager.setAdapter(adapter);

        // Definindo a animação de transição personalizada
        viewPager.setPageTransformer(new Carrossel());

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    }

    private static class ViewPagerAdapter extends FragmentStateAdapter {

        private final List<Fragment> fragmentList = new ArrayList<>();

        public ViewPagerAdapter(FragmentActivity fa) {
            super(fa);
        }

        public void addFragment(Fragment fragment) {
            fragmentList.add(fragment);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getItemCount() {
            return fragmentList.size();
        }
    }
}