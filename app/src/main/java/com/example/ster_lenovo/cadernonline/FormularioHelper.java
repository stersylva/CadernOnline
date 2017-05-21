package com.example.ster_lenovo.cadernonline;

import android.widget.EditText;

import com.example.ster_lenovo.cadernonline.modelo.Instituicao;

/**
 * Created by ster-lenovo on 20/05/2017.
 */

public class FormularioHelper {

    private final EditText campoNome;
    private final EditText campoEndereço;
    private final EditText campoTelefone;

    public FormularioHelper(Instituicao_addActivity activity){
        campoNome = (EditText) activity.findViewById(R.id.instituicao_nome);
        campoEndereço = (EditText) activity.findViewById(R.id.instituicao_endereco);
        campoTelefone = (EditText) activity.findViewById(R.id.instituicao_telefone);
    }

    public Instituicao pegaInstituicao() {
        Instituicao instituicao = new Instituicao();
        instituicao.setNome(campoNome.getText().toString());
        instituicao.setEndereço(campoEndereço.getText().toString());
        instituicao.setTelefone(campoTelefone.getText().toString());
        return instituicao;
    }
}
