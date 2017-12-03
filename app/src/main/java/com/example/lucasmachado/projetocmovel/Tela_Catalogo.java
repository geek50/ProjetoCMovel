package com.example.lucasmachado.projetocmovel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class Tela_Catalogo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela__catalogo);

        float value = 0.0f;

        Intent tela_Carrinho = new Intent(this, Tela_Carrinho.class);
        tela_Carrinho.putExtra("total_value", value);
    }
}
