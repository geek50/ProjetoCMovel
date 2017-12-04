package com.example.lucasmachado.projetocmovel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void telaLogin(View view){

        Intent telaLogin = new Intent(this, Tela_Login.class);
        startActivity(telaLogin);
    }
}


