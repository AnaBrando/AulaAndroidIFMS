package com.example.myapplication3710;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tv1;
    Button botao;
    ImageView imag;
    EditText text1;
    EditText text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.textView);
        botao=findViewById(R.id.button2);
        imag = findViewById(R.id.imageView);
        imag.setTag(R.drawable.naruto);
        text2 = findViewById(R.id.editText3);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                funcao1();
            }
        });
        text1 = findViewById(R.id.editText);
        Configuration config  = getResources().getConfiguration();
        if(config.orientation == Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.activity_deitady);
        }
        else{
            setContentView(R.layout.activity_main);
        }
        //TODO fazer tela login
    }

    public void funcao1(){

        if((int) imag.getTag() == R.drawable.sasuke){
            imag.setImageResource(R.drawable.naruto);
            tv1.setText("Naruto");
            imag.setTag(R.drawable.naruto);
            String tx1 = text1.getText().toString();
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Olá");
            //define a mensagem
            builder.setMessage(tx1);
            builder.setNeutralButton("Ok",null);
            builder.show();

        } else{
            tv1.setText("Sasuke");
            imag.setImageResource(R.drawable.sasuke);
            imag.setTag(R.drawable.sasuke);
            String text2 = text1.getText().toString();
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Olá");
            //define a mensagem
            builder.setMessage(text2);
            builder.show();
            builder.setNeutralButton("Ok",null);

        }

    }
}
