package com.example.avessodaleitura;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.example.avessodaleitura.MenuActivity;
import com.example.avessodaleitura.SinopseActivity;
import com.example.avessodaleitura.AutorActivity;
import com.example.avessodaleitura.OpiniaoActivity;
import com.example.avessodaleitura.;
import com.example.avessodaleitura.PersonagensActivity;
import com.example.avessodaleitura.TrechosActivity;
import com.example.avessodaleitura.TimeLineActivity1;
import com.example.avessodaleitura.TimeLineActivity2;
import com.example.avessodaleitura.FofocaActivity;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView capaLivro = findViewById(R.id.capaLivro);

        capaLivro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMenu = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(telaMenu);
                overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
            }
        });

    }
}