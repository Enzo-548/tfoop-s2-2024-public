package Entities;

import Enum.Situacao;

public class Duravel extends Item {
    private String setor;
    private String materialPrincipal;

    public Duravel(String codigo, String descricao, double volume, double valorDeclarado, Situacao situacao, String setor, String materialPrincipal) {
        super(codigo, descricao, volume, valorDeclarado, situacao);
        this.setor = setor;
        this.materialPrincipal = materialPrincipal;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getMaterialPrincipal() {
        return materialPrincipal;
    }

    public void setMaterialPrincipal(String materialPrincipal) {
        this.materialPrincipal = materialPrincipal;
    }

    public String getCategoria() {
        return "Durável";
    }

    
    public String toString() {
        return
        super.toString() + "\n" +
        "\nINFORMAÇÕES DO ITEM DURÁVEL" + 
            "\nSetor: " + setor + 
            "\nMaterial Principal: " + materialPrincipal;
    }
}
