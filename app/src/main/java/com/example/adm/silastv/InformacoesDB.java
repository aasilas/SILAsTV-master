package com.example.adm.silastv;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by android on 15/12/2017.
 */

public class InformacoesDB extends SQLiteOpenHelper {

    public InformacoesDB(Context context){
        super(context, Script.DB_NOME, null, Script.DB_VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Script.SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(Script.SQL_DELETE_ENTRIES);
        onCreate(db);
    }
}
