package com.example.ster_lenovo.cadernonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListarInstituicaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listar_instituicao);


        String [] instituicao= {"Facol"} ;
        ListView listarInstituicao = (ListView) findViewById(R.id.listar_instituicao);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, instituicao);
        listarInstituicao.setAdapter(adapter);

        Button novaInstituicao = (Button) findViewById(R.id.btn_nova_inst);
        novaInstituicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVaiProCadastroInst = new Intent(ListarInstituicaoActivity.this, Instituicao_addActivity.class);
                startActivity(intentVaiProCadastroInst);
            }
        });
    }
}
