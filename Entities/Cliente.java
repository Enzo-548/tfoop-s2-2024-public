package Entities;

//import java.util.Random;

public class Cliente {
    private int codigo;
    private String nome;
    private String telefone;

    public Cliente(int codigo, String nome, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return 
        "\nINFORMAÇÕES DO CLIENTE" +
            "\nCodigo: " + codigo +
            "\nNome: " + nome +
            "\nTelefone: " + telefone;
    }
}

