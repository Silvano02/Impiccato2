package com.example.silvano.impiccato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Vinto extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    Button nuovaPartita;
    Button chiudi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinto);
        textView = findViewById(R.id.text);
        textView.setText(getIntent().getStringExtra("vinto"));
        nuovaPartita = findViewById(R.id.nuova_partita);
        chiudi = findViewById(R.id.chiudi);
        nuovaPartita.setOnClickListener(this);
        chiudi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.nuova_partita:
                Intent i =new Intent(Vinto.this,InserimentoParola.class);
                startActivity(i);
                finish();
            case R.id.chiudi:
                finish();
        }
    }
}
