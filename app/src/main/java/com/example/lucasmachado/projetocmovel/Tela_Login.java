package com.example.lucasmachado.projetocmovel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Tela_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela__login);


    }

    public void telaInicio (View view){

        Intent telaInicio = new Intent(this, TelaInicio.class);
        startActivity(telaInicio);
    }
}
