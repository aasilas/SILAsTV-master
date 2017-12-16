package com.example.adm.silastv;

import android.provider.BaseColumns;

/**
 * Created by android on 15/12/2017.
 */

public class Script {

    public static final String DB_NOME = "informacoes.db";
    public static final int DB_VERSAO = 1;
    public static final String SQL_CREATE_ENTRIES = "CREATE TABLE " +
            ProdutoEntry.TABELA_NOME + " (" +
            ProdutoEntry._ID + " INTEGER PRIMARY KEY," +
            ProdutoEntry.COLUNA_NUMERO_CANAL + " TEXT," +
            ProdutoEntry.COLUNA_NOME_CANAL + " TEXT," +
            ProdutoEntry.COLUNA_NOME_DESCRICAO + " TEXT," +
            ProdutoEntry.COLUNA_NOME_IMAGEM + " TEXT)";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + ProdutoEntry.TABELA_NOME;

    public static class ProdutoEntry implements BaseColumns {

        public static final String TABELA_NOME = "informacoes";
        public static final String COLUNA_NUMERO_CANAL = "numero";
        public static final String COLUNA_NOME_CANAL = "nome";
        public static final String COLUNA_NOME_DESCRICAO = "descricao";
        public static final String COLUNA_NOME_IMAGEM = "imagem";


    }
}
