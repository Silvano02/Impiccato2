package com.example.silvano.impiccato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Vinto extends AppCompatActivity implements View.OnClickListener {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinto);
        textView = findViewById(R.id.text);
        textView.setText(getIntent().getStringExtra("vinto"));
    }

    @Override
    public void onClick(View v) {

    }
}
