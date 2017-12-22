package com.example.adm.silastv;

/**
 * Created by adm on 20/12/2017.
 */

import java.io.Serializable;

public class Canal implements Serializable {

    private String _id;
    private String nomeCanal;
    private String descricao;
    private String url;

    public Canal (String _id, String nomeCanal, String descricao, String url) {
        this._id = _id;
        this.nomeCanal = nomeCanal;
        this.descricao = descricao;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNomeCanal() {
        return nomeCanal;
    }

    public void setNomeCanal(String nomeExercicio) {
        this.nomeCanal = nomeExercicio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }


    @Override
    public String toString() {
        return nomeCanal;
    }
}