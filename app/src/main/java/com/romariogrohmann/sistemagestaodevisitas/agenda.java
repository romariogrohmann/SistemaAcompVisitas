package com.romariogrohmann.sistemagestaodevisitas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class agenda extends AppCompatActivity {

    private ImageButton btIncluir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agenda);

        btIncluir = findViewById(R.id.btIncluir);


        btIncluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), incluirvisitas.class);
                startActivity(intent);
            }
        });

    }
}
