package com.example.trabajo_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class compraCriptomonedas extends AppCompatActivity {
    Spinner spiner;
    Button bcompra;
    EditText cantidad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra_criptomonedas);
        spiner = findViewById(R.id.spinner);
        bcompra = findViewById(R.id.b_compra);
        bcompra.setOnClickListener(icompra);
        cantidad = findViewById(R.id.cantidad);


        ArrayList<String> opcripto = new ArrayList<>();
        opcripto.add("Bitcoin");
        opcripto.add("Dash");
        opcripto.add("Litecoin");
        opcripto.add("Ripple");

        ArrayAdapter<String> adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,opcripto);
        spiner.setAdapter(adapter);
    }
    public View.OnClickListener icompra = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            cantidad.setText("");
            Toast.makeText(compraCriptomonedas.this, "Agregado al deposito", Toast.LENGTH_SHORT).show();
        }
    };
}