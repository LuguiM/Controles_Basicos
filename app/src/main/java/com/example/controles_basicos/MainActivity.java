package com.example.controles_basicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText tNombre = (EditText)this.findViewById(R.id.etNombre);
        final EditText tApellido = (EditText)this.findViewById(R.id.etApellido);
        Button bDatos = (Button)this.findViewById(R.id.btEnviarDatos);

        bDatos.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                String nom = tNombre.getText().toString();
                String ape = tApellido.getText().toString();

                Toast.makeText(getApplicationContext(), "Tu Nombre es: " +nom+" " +ape,Toast.LENGTH_LONG).show();
            }
        });

    }
}