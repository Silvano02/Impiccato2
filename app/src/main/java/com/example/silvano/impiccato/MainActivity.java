package com.example.silvano.impiccato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imageView;
    private TextView textView;
    private TextView tvite;
    private EditText editText;
    private Button button;
    private int vite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.image);
        textView = findViewById(R.id.output);
        tvite = findViewById(R.id.vite);
        editText = findViewById(R.id.input);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
        textView.setText(Main2Activity.impiccato.getVuoto(), 0, Main2Activity.impiccato.getVuoto().length);
        this.vite = Main2Activity.impiccato.getVite();
    }

    @Override
    public void onClick(View v) {
        String vites = "" + vite;
        this.tvite.setText(vites);
        textView.setText(Main2Activity.impiccato.getVuoto(), 0, Main2Activity.impiccato.getVuoto().length);
        if (vite >= 0) {
            boolean check;
            String input = editText.getText().toString();
            if (input.length() == 1) {
                check = Main2Activity.impiccato.inserisciLettera(input.charAt(0));
                if (check) {
                    Main2Activity.impiccato.rimuoviVita();
                    }
                } else {
                    check = Main2Activity.impiccato.insericiParola(input);
                    if (check) {
                        Main2Activity.impiccato.rimuoviVita();
                    }
                }
            } else {
                Intent i = new Intent(getApplicationContext(), Perso.class);
                startActivity(i);
                setContentView(R.layout.activity_perso);
            }
            if (Main2Activity.impiccato.haiVinto()) {
                Intent i = new Intent(getApplicationContext(), Vinto.class);
                startActivity(i);
                setContentView(R.layout.activity_vinto);
            }
        switch (vite) {
            case 6:
                imageView.setImageResource(R.drawable.hangman_6);
                break;
            case 5:
                imageView.setImageResource(R.drawable.hangman_5);
                break;
            case 4:
                imageView.setImageResource(R.drawable.hangman_4);
                break;
            case 3:
                imageView.setImageResource(R.drawable.hangman_3);
                break;
            case 2:
                imageView.setImageResource(R.drawable.hangman_2);
                break;
            case 1:
                imageView.setImageResource(R.drawable.hangman_1);
                break;
            case 0:
                imageView.setImageResource(R.drawable.hangman_0);
                break;
            }
        vite = Main2Activity.impiccato.getVite();
        }
    }
