package com.example.ster_lenovo.cadernonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListarInstituicaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_instituicao);

        String [] instituicao= {"Facol"} ;
        ListView listarInstituicao = (ListView) findViewById(R.id.listar_instituicao);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, instituicao);
        listarInstituicao.setAdapter(adapter);
    }
}
