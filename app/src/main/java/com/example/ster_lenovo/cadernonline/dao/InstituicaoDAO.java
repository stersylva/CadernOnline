package com.example.ster_lenovo.cadernonline.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.ster_lenovo.cadernonline.modelo.Instituicao;

/**
 * Created by ster-lenovo on 20/05/2017.
 */

public class InstituicaoDAO extends SQLiteOpenHelper {
    public InstituicaoDAO(Context context) {
        super(context, "agenda", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       String sql = "CREATE TABLE Instituicao (id INTERGER PRIMARY KEY, nome TEXT NOT NULL, endereco TEXT, telefone TEXT);";
       db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       String sql = "DROP TABLE IF EXISTS Instituicao";
        db.execSQL(sql);
        onCreate(db);
    }

    public void insere(Instituicao instituicao) {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues dados = new ContentValues();
        dados.put("nome", instituicao.getNome());
        dados.put("endereco", instituicao.getEndereço());
        dados.put("telefone", instituicao.getTelefone());

        db.insert("Instituicao", null, dados);
    }
}
