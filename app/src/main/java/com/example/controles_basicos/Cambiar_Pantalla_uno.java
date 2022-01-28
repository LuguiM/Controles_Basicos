package com.example.controles_basicos;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;



public class Cambiar_Pantalla_uno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambiar_pantalla_uno);

        final EditText eNombre =
                (EditText) findViewById(R.id.etNombre);
        final EditText eEdad = (EditText) findViewById(R.id.etEdad);
        Button bEnviar = (Button)findViewById(R.id.btEnviarDatos);

        bEnviar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = eNombre.getText().toString();
                String edad = eEdad.getText().toString();
                Bundle pasarDatos = new Bundle();
                pasarDatos.putString("pNombre", nombre);
                pasarDatos.putString("pEdad", edad);
                Intent siga = new
                        Intent(Cambiar_Pantalla_uno.this, Cambiar_pantalla_2.class);
                siga.putExtras(pasarDatos);
                startActivity(siga);
                 }
               });
            }
        }


