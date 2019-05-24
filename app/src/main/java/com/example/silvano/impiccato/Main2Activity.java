package com.example.silvano.impiccato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText;
    private Button button;
    private String parola;
    public static Impiccato impiccato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText = findViewById(R.id.input_parola);
        button = findViewById(R.id.button_parola);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.parola = (editText.getText().toString());
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        impiccato = new Impiccato(this.parola);
        startActivity(i);
        setContentView(R.layout.activity_main);
    }
}
