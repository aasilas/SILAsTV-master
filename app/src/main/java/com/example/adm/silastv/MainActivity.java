package com.example.adm.silastv;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String> canaisList = new ArrayList<String>();
        canaisList.add("SBT");
        canaisList.add("UCSAL");
        canaisList.add("GLOBO");

        TextView textView = (TextView) this.findViewById(R.id.textView1);
        textView.setText(R.string.nome_canal);
        textView.setText(R.string.descricao);


        final CanalDao canal = new CanalDao(new Banco(this));

        if (canal.listar().isEmpty()) {
            Canal e = new Canal("11", "GLOBO", "Hoje é um novo dia, de um novo tempo que começou ! ",
                    "http://www.globo.com/");
            canal.insert(e);

        }




        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, canaisList);

        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, SBTActivity.class);
                intent.putExtra("nome", canaisList.get(position));
                startActivity(intent);
            }
        });

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_2, canaisList);

        ListView lv2 = (ListView) findViewById(R.id.listView);
        lv2.setAdapter(adapter);
        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent2 = new Intent(MainActivity.this, UCSALActivity.class);
                intent2.putExtra("nome", canaisList.get(position));
                startActivity(intent2);
            }
        });


        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_2, canaisList);

        ListView lv3 = (ListView) findViewById(R.id.listView);
        lv3.setAdapter(adapter);
        lv3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent3 = new Intent(MainActivity.this, GLOBOActivity.class);
                intent3.putExtra("nome", canaisList.get(position));
                startActivity(intent3);
            }
        });

    }
}
