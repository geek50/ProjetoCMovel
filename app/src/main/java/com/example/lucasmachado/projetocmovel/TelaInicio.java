package com.example.lucasmachado.projetocmovel;

<<<<<<< HEAD
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
=======
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
>>>>>>> origin/master
import android.widget.ListView;

public class TelaInicio extends AppCompatActivity {

<<<<<<< HEAD
    private ImageView botaoCatalogo;
    private ImageView botaoPayment;

=======
>>>>>>> origin/master
    String[] teste = {"teste1","teste2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicio);

        /*ArrayAdapter<String> adapter = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, teste);

        ListView listView = (ListView)findViewById(R.id.text_list_view);
        listView.setAdapter(adapter);﻿*/

<<<<<<< HEAD
        botaoCatalogo = (ImageView) findViewById(R.id.catalogoId);
        botaoPayment = (ImageView) findViewById(R.id.PaymentId);


        botaoCatalogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TelaInicio.this, Tela_Catalogo.class));
            }
        });

        botaoPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TelaInicio.this, FormaPagamento.class));
            }
        });

=======
>>>>>>> origin/master
    }
}
