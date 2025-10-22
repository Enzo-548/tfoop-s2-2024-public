package Entities;

import Enum.Situacao;

public class Perecivel extends Item implements Categoria{
    private String origem;
    private String tempoMaximoValidade;

    public Perecivel(String codigo, String descricao, int volume, double valorDeclarado, Situacao situacao, String origem, String tempoMaximoValidade) {
        super(codigo, descricao, volume, valorDeclarado, situacao); 
        this.origem = origem;
        this.tempoMaximoValidade = tempoMaximoValidade;
    }

    @Override
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
