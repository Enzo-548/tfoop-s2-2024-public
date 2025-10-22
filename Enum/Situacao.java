package Enum;

public enum Situacao {
    
    PENDENTE("Pendente"),
    ARMAZENADO("Armazenado"),
    CANCELADO("Cancelado"),
    RETIRADO("Retirado");

    private final String nome;

    Situacao(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
