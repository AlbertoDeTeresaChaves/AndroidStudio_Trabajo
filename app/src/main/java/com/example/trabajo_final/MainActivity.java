package com.example.trabajo_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button b_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.text_usernameL);
        password = findViewById(R.id.text_passwordL);
        b_login = findViewById(R.id.button_login);
        b_login.setOnClickListener(iniciar);
    }
    public View.OnClickListener iniciar = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String Usuario = username.getText().toString();
            String Contraseña = password.getText().toString();

            if(Usuario.equals("admin") && Contraseña.equals("admin")){
                Intent cambio = new Intent(v.getContext(),menu_opciones.class);
                startActivity(cambio);
            }else{
                Toast.makeText(MainActivity.this, "Usuario o Contraseña incorrecto", Toast.LENGTH_SHORT).show();
            }
        }
    };




}