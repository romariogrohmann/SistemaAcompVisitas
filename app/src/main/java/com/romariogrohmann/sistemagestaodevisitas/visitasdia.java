package com.romariogrohmann.sistemagestaodevisitas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class visitasdia extends AppCompatActivity {

    private Button btItens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visitasdia);

        btItens = findViewById(R.id.btItens);

        btItens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), dadosVisita.class);
                startActivity(intent);
            }
        });

    }
}
