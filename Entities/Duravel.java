package Entities;

import Enum.Situacao;

public class Duravel extends Item implements Categoria{
    private String setor;
    private String materialPrincipal;

    public Duravel(String codigo, String descricao, int volume, double valorDeclarado, Situacao situacao, String setor, String materialPrincipal) {
        super(codigo, descricao, volume, valorDeclarado, situacao);
        this.setor = setor;
        this.materialPrincipal = materialPrincipal;
    }
    
    @Override
    public String getDescricao(){
        return "Durável";
    }

    @Override
    public String toString() {
        return
        super.toString() + "\n" +
        "\nINFORMAÇÕES DO ITEM DURÁVEL" + 
            "\nSetor: " + setor + 
            "\nMaterial Principal: " + materialPrincipal;
    }
}
