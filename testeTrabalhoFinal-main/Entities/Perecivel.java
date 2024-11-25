package Entities;

import Enum.Situacao;

public class Perecivel extends Item {
    private String origem;
    private String tempoMaximoValidade;

    public Perecivel(String codigo, String descricao, double volume, double valorDeclarado, Situacao situacao, String origem, String tempoMaximoValidade) {
        super(codigo, descricao, volume, valorDeclarado, situacao); 
        this.origem = origem;
        this.tempoMaximoValidade = tempoMaximoValidade;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getTempoMaximoValidade() {
        return tempoMaximoValidade;
    }

    public void setTempoMaximoValidade(String tempoMaximoValidade) {
        this.tempoMaximoValidade = tempoMaximoValidade;
    }

    public String getDescricao(){
        return "Perecivel";
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
        "\nINFORMAÇÕES DO ITEM PERECÍVEL" + 
            "\nOrigem: " + origem + 
            "\nValidade: " + tempoMaximoValidade + "dias.";
    }
}
