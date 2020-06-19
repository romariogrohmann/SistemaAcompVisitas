package com.romariogrohmann.sistemagestaodevisitas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dadosVisita extends AppCompatActivity {

    private Button btFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dadosvisita);

        btFinal = findViewById(R.id.btFinaliza);

        btFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), finalizavisita.class);
                startActivity(intent);
            }
        });
    }
}
