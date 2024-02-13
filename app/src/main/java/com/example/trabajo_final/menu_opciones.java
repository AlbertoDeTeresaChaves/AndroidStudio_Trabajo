package com.example.trabajo_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class menu_opciones extends AppCompatActivity {
Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_opciones);
        boton = findViewById(R.id.bton);
        boton.setOnClickListener(iniciar);
    }
   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    public View.OnClickListener iniciar = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
                Intent cambio = new Intent(v.getContext(),compraCriptomonedas.class);
                startActivity(cambio);
        }
    };

}