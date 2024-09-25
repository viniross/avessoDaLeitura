package com.example.avessodaleitura;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.example.avessodaleitura.fragments.MenuActivity;
import com.example.avessodaleitura.fragments.SinopseActivity;
import com.example.avessodaleitura.fragments.AutorActivity;
import com.example.avessodaleitura.fragments.OpiniaoActivity;
import com.example.avessodaleitura.*;
import com.example.avessodaleitura.fragments.PersonagensActivity;
import com.example.avessodaleitura.fragments.TrechosActivity;
import com.example.avessodaleitura.fragments.TimeLineActivity1;
import com.example.avessodaleitura.fragments.TimeLineActivity2;
import com.example.avessodaleitura.fragments.FofocaActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView capaLivro = findViewById(R.id.capaLivro);
        viewPager = findViewById(R.id.viewPager);

        adapter = new ViewPagerAdapter(this);
        adapter.addFragment(new MenuActivity());
        adapter.addFragment(new SinopseActivity());
        adapter.addFragment(new AutorActivity());
        adapter.addFragment(new OpiniaoActivity());
        adapter.addFragment(new PersonagensActivity());
        adapter.addFragment(new TrechosActivity());
        adapter.addFragment(new TimeLineActivity1());
        adapter.addFragment(new TimeLineActivity2());
        adapter.addFragment(new FofocaActivity());

        capaLivro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMenu = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(telaMenu);
                overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
            }
        });

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