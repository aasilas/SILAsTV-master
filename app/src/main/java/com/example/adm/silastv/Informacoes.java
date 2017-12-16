package com.example.adm.silastv;

import java.io.Serializable;

/**
 * Created by android on 15/12/2017.
 */

public class Informacoes implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer _id;
    private String numero;
    private String nome;
    private String descricao;
    private String imagem;

    public Informacoes() {
        // TODO Auto-generated constructor stub
    }

    public Informacoes(Integer _id, String numero, String nome, String descricao) {
        super();
        this._id = _id;
        this.nome = numero;
        this.numero = nome;
        this.descricao = descricao;
    }

    public Integer getId() {
        return _id;
    }
    public void setId(Integer id) {
        this._id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPreco() {
        return numero;
    }
    public void setPreco(String preco) {
        this.numero = preco;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

}
