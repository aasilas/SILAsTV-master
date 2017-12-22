package com.example.adm.silastv;

/**
 * Created by adm on 20/12/2017.
 */

import android.content.ContentValues;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

public class CanalDao {

    private Banco bd;

    public CanalDao(Banco bd) {
        this.bd = bd;
    }

    public void insert(Canal canal) {
        ContentValues values = new ContentValues();
        values.put(Banco.COL_ID, canal.get_id());
        values.put(Banco.COL_NOME_CANAL, canal.getNomeCanal());
        values.put(Banco.COL_DESCRICAO, canal.getDescricao());
        values.put(Banco.COL_DESCRICAO, canal.getDescricao());
        bd.getWritableDatabase().insert("CANAIS", null, values);
        bd.getWritableDatabase().close();
    }

    public List<Canal> listar() {
        List<Canal> lista = new ArrayList<>();

        Cursor c = bd.getReadableDatabase().query("CANAL", new String[]{"_id,nome_canal,descricao,url"}, null, null, null, null, null);
        if (c.moveToNext()) {
            c.moveToFirst();
            do {
                Canal f = new Canal(c.getString(0), c.getString(1), c.getString(2),c.getString(3));
                lista.add(f);
            } while (c.moveToNext());
            bd.getWritableDatabase().close();
        }
        return lista;
    }
}
