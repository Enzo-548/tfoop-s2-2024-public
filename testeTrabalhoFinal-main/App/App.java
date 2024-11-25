package App;

import Entities.*;
import Enum.Situacao;
import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);
    private Gerenciador gerenciador;

    public App() {
        this.gerenciador = new Gerenciador();
    }

    public void cadastrarDeposito(Integer codigo, String nome, String cidade, String endereco, Integer capacidadeMaxima) {
        Deposito deposito = new Deposito(codigo, nome, cidade, endereco, capacidadeMaxima);
        gerenciador.cadastrarDeposito(deposito);
    }

    public void cadastrarCliente(Integer codigo, String nome, String telefone) {
        Cliente cliente = new Cliente(codigo, nome, telefone);
        gerenciador.cadastrarCliente(cliente);
    }

    public void cadastrarDuravel(String codigo, String descricao, Integer volume, Double valorDeclarado, String setor, String matPrincipal) {
        try {
            Duravel item = new Duravel(codigo, descricao, volume, valorDeclarado, Situacao.PENDENTE, setor, matPrincipal);
            gerenciador.cadastrarItem(item);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar item: " + e.getMessage());
            scanner.nextLine();
        }
    }

    public void cadastrarPerecivel(String codigo, String descricao, Integer volume, Double valorDeclarado, String origem, String dataDeValidade) {
        try {
            Perecivel item = new Perecivel(codigo, descricao, volume, valorDeclarado, Situacao.PENDENTE, origem, dataDeValidade);
            gerenciador.cadastrarItem(item);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar item: " + e.getMessage());
            scanner.nextLine();
        }
    }

    public void retirarItem(String codigo, Deposito deposito) {
        Item Removido = null;
        for (Item item : deposito.getItensArmazenados()) {
            if (item.getCodigo().equals(codigo)) {
                Removido = item;
                break;
            }
        }
        if (Removido != null) {
            gerenciador.retirarItem(Removido);
        } else {
            System.out.println("Item não encontrado no depósito.");
        }
    }
}
