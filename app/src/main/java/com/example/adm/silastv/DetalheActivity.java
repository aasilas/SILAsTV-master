package com.example.adm.silastv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class DetalheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        Canal canal = (Canal) getIntent().getSerializableExtra("canal");


        TextView nomeCanal = (TextView)
                findViewById(R.id.textView1);
        TextView descricao = (TextView)
                findViewById(R.id.textView2);

        Log.d("nome", "nome = " + canal.getNomeCanal());

        Log.d("url", "url = " + canal.getUrl());

//
    }
}