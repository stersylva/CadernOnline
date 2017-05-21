package com.example.ster_lenovo.cadernonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.ster_lenovo.cadernonline.dao.InstituicaoDAO;
import com.example.ster_lenovo.cadernonline.modelo.Instituicao;

public class Instituicao_addActivity extends AppCompatActivity {

    private FormularioHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instituicao_add);


        helper = new FormularioHelper(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_formulario, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_formulario_ok:

                Instituicao instituicao = helper.pegaInstituicao();
                InstituicaoDAO dao = new InstituicaoDAO(this);
                dao.insere(instituicao);
                dao.close();


                Toast.makeText(Instituicao_addActivity.this, "Instituição " + instituicao.getNome() + " Salva", Toast.LENGTH_SHORT).show();

                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
