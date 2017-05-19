package com.example.ster_lenovo.cadernonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Instituicao_addActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instituicao_add);

        Button botaoSalvar = (Button) findViewById(R.id.btn_inst_salvar);
        botaoSalvar.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(Instituicao_addActivity.this, "Instituição Salva Com Sucesso!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
