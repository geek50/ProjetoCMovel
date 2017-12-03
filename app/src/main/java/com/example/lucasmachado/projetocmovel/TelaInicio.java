package com.example.lucasmachado.projetocmovel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TelaInicio extends AppCompatActivity {

    String[] teste = {"teste1","teste2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicio);

        /*ArrayAdapter<String> adapter = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, teste);

        ListView listView = (ListView)findViewById(R.id.text_list_view);
        listView.setAdapter(adapter);﻿*/

    }
}
