package com.example.myapplication3710;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tv1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        tv1 = findViewById(R.id.texto);
        button=findViewById(R.id.botao);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proximaTela(v,tv1);
            }
        });
    }


    public void proximaTela(View View,TextView txt){
        Intent intent = new Intent(this, TerceiroActivity.class);
        startActivity(intent);
    }



}
