package com.smn947.tartas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> tartas = new ArrayList<String>();
        tartas.add("Juan");
        tartas.add("Pedro");
        tartas.add("José");
        tartas.add("María");
        tartas.add("Sofía");

        LinearLayout linLayout = findViewById(R.id.listaDeTartas);
        linLayout.removeAllViews();
        LayoutInflater ltInflater = getLayoutInflater();


        for (int i = 0; i <= tartas.size() - 1; i++) {
            final String tartaNameText = tartas.get(i);
            View tarta = ltInflater.inflate(R.layout.tarta, linLayout, false);

            TextView tartaName = (TextView) tarta.findViewById(R.id.tartaName);
            tartaName.setText(tartaNameText);

            Button tartaButton = (Button) tarta.findViewById(R.id.boton);
            tartaButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "Seleccionado tarta: " + tartaNameText, Toast.LENGTH_SHORT).show();
                    //Aqui cargas 
                }
            });

            linLayout.addView(tarta);
        }

        //item.getLayoutParams().width = LinearLayout.LayoutParams.MATCH_PARENT;

    }
}