package Entities;

import Enum.Situacao;

public abstract class Item{
    private String codigo;
    private String descricao;
    private String categoria;
    private Cliente cliente; 
    private int volume;
    private double valorDeclarado;
    private Situacao situacao; 
    

    public Item(String codigo, String descricao, int volume, double valorDeclarado, Situacao situacao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.volume = volume;
        this.valorDeclarado = valorDeclarado;
        this.situacao = situacao;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public int getVolume() {
        return volume;
    }

    public String getCategoria(){
        return categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

   
    public String toString() {
        return 
        "\nINFORMAÇÕES DO ITEM" +
            "\nCodigo: " + codigo +
            "\nDescricao: " + descricao +
            "\nCliente: " + cliente.getCodigo() +
            "\nVolume: " + volume +
            "\nvalorDeclarado: " + valorDeclarado +
            "\nSituacao: " + getSituacao().getNome();
    }
}
