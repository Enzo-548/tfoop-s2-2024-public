package Entities;

import java.util.ArrayList;
import java.util.List;

public class Deposito {
    private int codigo;
    private String nome;
    private String cidade;
    private String endereco;
    private int capacidadeMaxima;
    private List<Item> itensArmazenados; 

    public Deposito(int codigo, String nome, String cidade, String endereco, int capacidadeMaxima) {
        this.codigo = codigo;
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
        this.capacidadeMaxima = capacidadeMaxima;
        this.itensArmazenados = new ArrayList<Item>();  
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public List<Item> getItensArmazenados() {
        return itensArmazenados;
    }

    public void alocarItem(Item item) {
        if (getCapacidadeMaxima() >= item.getVolume()) {
            itensArmazenados.add(item);  
            System.out.println("Item " + item.getCodigo() + " alocado com sucesso no depósito " + this.nome);
        } else {
            System.out.println("Erro: Capacidade insuficiente no depósito para o item " + item.getCodigo());
        }
    }

    public String consultarItensArmazenados() {
        String str = "";
        if (itensArmazenados.isEmpty()) {
            str = str + "Não há itens armazenados neste depósito.";
        } else {
            for (Item item : itensArmazenados) {
                 str = str + item.toString(); 
            }
        }
        return str;
    }

    @Override
    public String toString() {
        return
        "\nINFORMAÇÕES DO DEPOSITO" +
            "\nCodigo: " + codigo +
            "\nNome: " + nome +
            "\nCidade: " + cidade +
            "\nEndereco: " + endereco +
            "\nCapacidade Maxima: " + capacidadeMaxima +
            "\nITENS ARMAZENADOS\n";
    }
}
