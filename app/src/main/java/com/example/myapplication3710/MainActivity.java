package com.example.myapplication3710;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tv1;
    Button botao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.textView);
        botao=findViewById(R.id.button2);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proximaTela(v);
            }
        });
        //TODO fazer tela login
    }

    public void proximaTela(View View){
        Intent intent = new Intent(this, home_menu.class);
        startActivity(intent);
    }
}
