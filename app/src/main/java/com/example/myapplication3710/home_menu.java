package com.example.myapplication3710;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class home_menu extends ListActivity {


    private static final String[] PAGINAS = new String[]{"Verde","Azul","Amarelo","Branco"};
    private ArrayAdapter<String> meuAdaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_home_menu);
        meuAdaptador = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,PAGINAS);
        setListAdapter(meuAdaptador);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(this,"Usuario selecionou a cor"+PAGINAS[position],Toast.LENGTH_LONG).show();


    }
}
