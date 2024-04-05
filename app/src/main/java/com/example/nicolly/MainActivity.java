package com.example.nicolly;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void aleatorizarFrase(View view) {
        System.out.println("Oi");
        int result = new Random().nextInt(4);

        TextView textResult = findViewById(R.id.textResult);

        if (result == 0) {
            textResult.setText("Acredite em si mesmo e você será imparável.\n");
        } else if (result == 1) {
            textResult.setText("Nunca desista dos seus sonhos. \n");
        } else if (result == 2) {
            textResult.setText("Você merece o melhor! \n");
        } else if (result == 3) {
            textResult.setText("Vencedores vencem dores. \n");
        } else if (result == 4) {
            textResult.setText("A coragem está um passo à frente do medo. \n");
        }
    }
}