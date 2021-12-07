package com.example.evaluacioncontinua02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Body extends AppCompatActivity {

    Button detalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body);
        detalle=(Button)findViewById(R.id.ventana3);

        detalle.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent( Body.this, detail.class);
                startActivity(i);
            }
        });
    }
}