package com.romariogrohmann.sistemagestaodevisitas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class telainicial extends AppCompatActivity {

    private ImageButton btVisitas;
    private ImageButton btAgenda;
    private ImageButton btRelatorios;
    private ImageButton btPendencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telainicial);

        btVisitas = findViewById(R.id.btVisitas);
        btAgenda = findViewById(R.id.btAgenda);
        btRelatorios = findViewById(R.id.btRelatorios);
        btPendencias = findViewById(R.id.btPendencias);


        btVisitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), visitasdia.class);
                startActivity(intent);
            }
        });

        btAgenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), agenda.class);
                startActivity(intent);
            }
        });

        btRelatorios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), relatorios.class);
                startActivity(intent);
            }
        });

        btPendencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), pendencias.class);
                startActivity(intent);
            }
        });

    };


}
