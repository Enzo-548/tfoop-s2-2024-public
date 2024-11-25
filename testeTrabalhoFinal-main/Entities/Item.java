package Entities;

import Enum.Situacao;

public abstract class Item implements Categoria{
    private String codigo;
    private String descricao;
    private double volume;
    private double valorDeclarado;
    private Situacao situacao; 

    public Item(String codigo, String descricao, double volume, double valorDeclarado, Situacao situacao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.volume = volume;
        this.valorDeclarado = valorDeclarado;
        this.situacao = situacao;  
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(double valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

   
    public String toString() {
        return 
        "\nINFORMAÇÕES DO ITEM" +
            "\nCodigo: " + codigo +
            "\nDescricao: " + descricao +
            "\nVolume: " + volume +
            "\nvalorDeclarado: " + valorDeclarado +
            "\nSituacao: " + getSituacao();
    }
}
