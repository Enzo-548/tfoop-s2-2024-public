package App;

import Entities.*;
import Enum.Situacao;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public class Gerenciador {
    

    private List<Deposito> depositos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Item> itensPendentes = new ArrayList<>();

    public List<Deposito> getDepositos() {
        return depositos;
    }

    public void cadastrarDeposito(Deposito deposito) {
        try {
            depositos.add(deposito);
            depositos.sort((d1, d2) -> Integer.compare(d1.getCodigo(), d2.getCodigo()));
            System.out.println("Depósito cadastrado com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar depósito: " + e.getMessage());
        }
    }
    
    public void cadastrarCliente(Cliente cliente) {
        try {
            clientes.add(cliente);
            clientes.sort((c1, c2) -> Integer.compare(c1.getCodigo(), c2.getCodigo()));
            System.out.println("Cliente cadastrado com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
        }
    }
    
    public void cadastrarItem(Item item) {
        try {
            for (Item i : itensPendentes) {
                if (i.getCodigo().equals(item.getCodigo())) {
                    throw new Exception("Código do item já existe.");
                }
            }
            itensPendentes.add(item);
            System.out.println("Item cadastrado com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar item: " + e.getMessage());
        }
    }

    // USANDO A SITUAÇÃO 

    public String consultarItensArmazenados() {
        String str = "";
        try {
            for (Deposito deposito : depositos) {
                str = str + deposito.consultarItensArmazenados();
            }
            return str;
        } catch (Exception e) {
            System.out.println("Erro ao consultar itens: " + e.getMessage());
        }
        return str;
    }

    // USANDO A SITUAÇÃO 

    public void alterarSituacao(String codI){
        try {
            for (Deposito deposito : depositos) {
                Item im = null;
                int i = 0;
                if (deposito.getItensArmazenados().get(i).getCodigo().equals(codI)){
                    im = deposito.getItensArmazenados().get(i);
                    if (im.getSituacao() == Situacao.RETIRADO) {
                        throw new Exception("Não é retirar o item, pois este ja foi retirado.");
                    }
                    deposito.getItensArmazenados().get(i).setSituacao(Situacao.RETIRADO);
                    System.out.println("Item foi retirado com sucesso.");
                    return;
                }
                i++;
            }
            System.out.println("Item não encontrado.");
        } catch (Exception e) {
            System.out.println("Erro ao alterar situação: " + e.getMessage());
        }
    }

    public void carregarDados() {
            List<Item> rm = new ArrayList<>();
            while (clientes.size()>0) {
            for(Item item : itensPendentes){
                if(item.getSituacao().equals(Situacao.RETIRADO) || item.getSituacao().equals(Situacao.ARMAZENADO)){
                        if(item.getCliente() == null){
                        item.setCliente(clientes.get(0)); 
                        }else break;
                    rm.add(item);
                }
            }
        clientes.remove(0);
        }
            itensPendentes.removeAll(rm);
            System.out.println("Dados carregados com sucesso.");
    }

    // USANDO A SITUAÇÃO DO PEDIDO 
    /*  talvez eu quero alocar mais de um tipo de item */
    public void organizarItensParaArmazenamento() {
        try {
            for (Item item : itensPendentes) {
                if ((item.getSituacao() == Situacao.PENDENTE) || item.getSituacao() == Situacao.CANCELADO) {
                    boolean alocado = false;
                    for (Deposito deposito : depositos) {
                        if (deposito.getCapacidadeMaxima() >= item.getVolume()) {
                            deposito.alocarItem(item);
                            item.setSituacao(Situacao.ARMAZENADO);
                            alocado = true;
                            break;
                        }
                    }
                    if (!alocado) {
                        item.setSituacao(Situacao.CANCELADO);
                        System.out.println("Item " + item.getCodigo() + " foi cancelado por falta de espaço.");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao organizar itens: " + e.getMessage());
        }
    }

    public void escreverDados() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("dados.txt"), "UTF-8"))) {
            writer.write("Depósitos:\n");
            for (Deposito deposito : depositos) {
                writer.write(deposito.toString() + "\n" + "\nITENS ARMAZENADOS\n" + deposito.consultarItensArmazenados());
            }
    
            writer.write("\nItens Pendentes:\n");
            for (Item item : itensPendentes) {
                writer.write(item.toString() + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    public String carregarDadosSalvos() {
        StringBuilder dados = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("dados.txt", Charset.forName("UTF-8")))){
            String linha = "";
            while ((linha = br.readLine()) != null) {
                dados.append(linha).append("\n");
            }
            System.out.println("Dados carregados com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao carregar dados salvos: " + e.getMessage());
        }
        return dados.toString();
    }

    public void finalizarSistema() {
        try {
            System.out.println("Sistema finalizado.");
        } catch (Exception e) {
            System.out.println("Erro ao finalizar sistema: " + e.getMessage());
        }
    }
}
