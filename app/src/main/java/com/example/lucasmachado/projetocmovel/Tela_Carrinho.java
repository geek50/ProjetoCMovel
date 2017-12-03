package com.example.lucasmachado.projetocmovel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class Tela_Carrinho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela__carrinho);


        Intent intent = getIntent();
        float value = intent.getFloatExtra("total_value", 0.0f);

        TextView textView = (TextView) findViewById(R.id.textView7);
        textView.setText(Float.toString(value));
    }
}
