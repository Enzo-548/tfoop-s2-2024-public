package UserInterface;

import java.lang.Integer;

import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import App.App;
import App.Gerenciador;
import Entities.Deposito;

public class UserInterface {
    private final App app = new App();
    private final Gerenciador gerenciador = new Gerenciador();

    public UserInterface() {

    }

    public Integer parseInt0(String s) {
        return Integer.parseInt(s);
    }

    public void construtor() {
        JFrame j1 = new JFrame("Menu De Operacoes");
        j1.setSize(750, 750);
        j1.setDefaultCloseOperation(3);
        j1.setVisible(true);
        Font font1 = new Font("Sansserif", 2, 33);
        Font font2 = new Font("Sansserif", 2, 20);

        FlowLayout layout1 = new FlowLayout();
        GridLayout layout2 = new GridLayout();
        JPanel p1 = new JPanel(layout1, true);
        JLabel mensagembala = new JLabel("Bem vindo ao algoritmo de armazenamento");
        mensagembala.setFont(font1); mensagembala.setForeground(Color.magenta);
        p1.add(mensagembala);

        JLabel mensagembala1 = new JLabel("Bem vindo ao algoritmo de armazenamento", 10);
        mensagembala1.setFont(font2); mensagembala1.setForeground(Color.magenta);
        mensagembala1.setVisible(false);
        p1.add(mensagembala1);



        JButton b1 = new JButton("Cadastrar Deposito");
        b1.setSize(100, 100);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog jd1 = new JDialog(j1, "Cadastrar Depósito", true, null);
                jd1.setSize(500, 150);
                jd1.setLayout(layout1);
                jd1.setResizable(true);
                JLabel txt1 = new JLabel("Código", 0);
                txt1.setSize(50, 50);
                jd1.add(txt1);

                JTextField jtxtF1 = new JTextField(5);
                jtxtF1.setSize(200, 20);
                jtxtF1.setName("tru");
                jd1.add(jtxtF1);

                JLabel txt2 = new JLabel("Nome", 0);
                txt2.setSize(50, 50);
                jd1.add(txt2);

                JTextField jtxtF2 = new JTextField(25);
                jtxtF2.setVisible(true);
                jtxtF2.setDoubleBuffered(true);
                jtxtF2.setSize(50, 50);
                jd1.add(jtxtF2);

                JLabel txt3 = new JLabel("Cidade", 0);
                txt3.setSize(50, 50);
                jd1.add(txt3);

                JTextField jtxtF3 = new JTextField(20);
                jtxtF3.setVisible(true);
                jtxtF3.setDoubleBuffered(true);
                jtxtF3.setSize(50, 50);
                jd1.add(jtxtF3);

                JLabel txt4 = new JLabel("Endereço", 0);
                txt4.setSize(50, 50);
                jd1.add(txt4);

                JTextField jtxtF4 = new JTextField(55);
                jtxtF4.setVisible(true);
                jtxtF4.setDoubleBuffered(true);
                jtxtF4.setSize(50, 50);
                jd1.add(jtxtF4);

                JLabel txt5 = new JLabel("Cap. Máxima", 0);
                txt5.setSize(50, 50);
                jd1.add(txt5);

                JTextField jtxtF5 = new JTextField(4);
                jtxtF5.setVisible(true);
                jtxtF5.setDoubleBuffered(true);
                jtxtF5.setSize(50, 50);
                jd1.add(jtxtF5);

                JButton jdb1 = new JButton("Cadastrar Depósito");
                jdb1.addActionListener(new ActionListener() {
                    @Override

                    public void actionPerformed(ActionEvent e) {
                        Integer cod = parseInt0(jtxtF1.getText());
                        Integer capm = parseInt0(jtxtF5.getText());
                        app.cadastrarDeposito(cod, jtxtF2.getText(), jtxtF3.getText(), jtxtF4.getText(), capm);
                        jd1.setVisible(false);
                        mensagembala1.setText("Deposito cadastrado com sucesso");
                        mensagembala1.setVisible(true);
                    }
                });
                jd1.add(jdb1);
                jd1.setVisible(true);
            }

        });
        p1.add(b1);

        JButton b2 = new JButton("Cadastrar Cliente");
        b2.setSize(100, 100);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // CODIGO, NOME, TELEFONE
                JDialog jd1 = new JDialog(j1, "Cadastrar Cliente", true, null);
                jd1.setSize(500, 150);
                jd1.setLayout(layout1);
                jd1.setResizable(true);
                JLabel txt1 = new JLabel("Código", 0);
                txt1.setSize(50, 50);
                jd1.add(txt1);

                JTextField jtxtF1 = new JTextField(5);
                jtxtF1.setSize(200, 20);
                jtxtF1.setName("tru");
                jd1.add(jtxtF1);

                JLabel txt2 = new JLabel("Nome", 0);
                txt2.setSize(50, 50);
                jd1.add(txt2);

                JTextField jtxtF2 = new JTextField(25);
                jtxtF2.setVisible(true);
                jtxtF2.setDoubleBuffered(true);
                jtxtF2.setSize(50, 50);
                jd1.add(jtxtF2);

                JLabel txt3 = new JLabel("Telefone", 0);
                txt3.setSize(50, 50);
                jd1.add(txt3);

                JTextField jtxtF3 = new JTextField(20);
                jtxtF3.setVisible(true);
                jtxtF3.setDoubleBuffered(true);
                jtxtF3.setSize(50, 50);
                jd1.add(jtxtF3);

                JButton jdb1 = new JButton("Cadastrar Cliente");
                jdb1.addActionListener(new ActionListener() {
                    @Override

                    public void actionPerformed(ActionEvent e) {
                        Integer cod = parseInt0(jtxtF1.getText());
                        app.cadastrarCliente(cod, jtxtF2.getText(), jtxtF3.getText());
                        jd1.setVisible(false);
                        mensagembala1.setText("Cliente cadastrado com sucesso");
                        mensagembala1.setVisible(true);
                    }
                });
                jd1.add(jdb1);
                jd1.setVisible(true);
            }
        });
        p1.add(b2);
        
        JButton b3 = new JButton("Cadastrar Item");
        b3.setSize(100, 100);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // SELETOR - duravel , perecivel
                JDialog jd1 = new JDialog(j1, "Qual tipo deseja cadastrar?", true, null);
                jd1.setSize(500, 500);
                jd1.setLayout(layout1);
                jd1.setResizable(true);
                
                JLabel jtxt1 = new JLabel("Qual tipo de item deseja cadastrar ?", null, 2);
                jtxt1.setSize(200, 200);
                jd1.add(jtxt1);

                JButton jbi1 = new JButton("Duravel");
                jbi1.setSize(100, 100);
                jbi1.setVisible(true);
                jbi1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jd1.setVisible(false);

                        JDialog jd2 = new JDialog(j1, "Cadastrar Duravel", true, null);
                        jd2.setSize(500, 150);
                        jd2.setLayout(layout1);
                        jd2.setResizable(true);
                        

                        // CODIGO, DESCRICAO, VOLUME, VALOR DECLARADO, SITUACAO
        /*
         * DURAVEL - SETOR, MAT PRINCIPAL
         * PERECIVEL - ORIGEM, TEMPO MAXIMO VALIDADE
         */

                        JLabel txt1 = new JLabel("Código", 0);
                        txt1.setSize(50, 50);
                        jd2.add(txt1);

                        JTextField jtxtF1 = new JTextField(5);
                        jtxtF1.setSize(200, 20);
                        jtxtF1.setName("tru");
                        jd2.add(jtxtF1);

                        JLabel txt2 = new JLabel("Descrição", 0);
                        txt2.setSize(50, 50);
                        jd2.add(txt2);

                        JTextField jtxtF2 = new JTextField(25);
                        jtxtF2.setVisible(true);
                        jtxtF2.setDoubleBuffered(true);
                        jtxtF2.setSize(50, 50);
                        jd2.add(jtxtF2);

                        JLabel txt3 = new JLabel("Volume", 0);
                        txt3.setSize(50, 50);
                        jd2.add(txt3);

                        JTextField jtxtF3 = new JTextField(20);
                        jtxtF3.setVisible(true);
                        jtxtF3.setDoubleBuffered(true);
                        jtxtF3.setSize(50, 50);
                        jd2.add(jtxtF3);

                        JLabel txt4 = new JLabel("Valor Declarado", 0);
                        txt4.setSize(50, 50);
                        jd2.add(txt4);

                        JTextField jtxtF4 = new JTextField(5);
                        jtxtF4.setVisible(true);
                        jtxtF4.setDoubleBuffered(true);
                        jtxtF4.setSize(50, 50);
                        jd2.add(jtxtF4);

                        JLabel txt5 = new JLabel("Setor", 0);
                        txt5.setSize(50, 50);
                        jd2.add(txt5);

                        JTextField jtxtF5 = new JTextField(4);
                        jtxtF5.setVisible(true);
                        jtxtF5.setDoubleBuffered(true);
                        jtxtF5.setSize(50, 50);
                        jd2.add(jtxtF5);

                        JLabel txt6 = new JLabel("Mat. Principal", 0);
                        txt6.setSize(50, 50);
                        jd2.add(txt6);

                        JTextField jtxtF6 = new JTextField(10);
                        jtxtF6.setVisible(true);
                        jtxtF6.setDoubleBuffered(true);
                        jtxtF6.setSize(50, 50);
                        jd2.add(jtxtF6);
                        
                        JButton jdb1 = new JButton("Cadastrar Durável");
                        jdb1.addActionListener(new ActionListener() {
                            @Override

                            public void actionPerformed(ActionEvent e) {
                                
                                double valor = Double.valueOf(jtxtF4.getText());
                                Integer volume = parseInt0(jtxtF3.getText());
                                app.cadastrarDuravel(jtxtF1.getText(), jtxtF2.getText(), volume, valor, jtxtF5.getText(), jtxtF6.getText());
                                jd2.setVisible(false);
                                mensagembala1.setText("Item duravel cadastrado com sucesso");
                                mensagembala1.setVisible(true);
                            }
                        });
                        jd2.add(jdb1);
                        jd2.setVisible(true);
                    }
                });
                jd1.add(jbi1);

                JButton jbi2 = new JButton("Perecivel");
                jbi2.setSize(100, 100);
                jbi2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jd1.setVisible(false);

                        JDialog jd2 = new JDialog(j1, "Cadastrar Perecivel", true, null);
                        jd2.setSize(500, 150);
                        jd2.setLayout(layout1);
                        jd2.setResizable(true);

                        JLabel txt1 = new JLabel("Código", 0);
                        txt1.setSize(50, 50);
                        jd2.add(txt1);

                        JTextField jtxtF1 = new JTextField(5);
                        jtxtF1.setSize(200, 20);
                        jtxtF1.setName("tru");
                        jd2.add(jtxtF1);

                        JLabel txt2 = new JLabel("Descrição", 0);
                        txt2.setSize(50, 50);
                        jd2.add(txt2);

                        JTextField jtxtF2 = new JTextField(25);
                        jtxtF2.setVisible(true);
                        jtxtF2.setDoubleBuffered(true);
                        jtxtF2.setSize(50, 50);
                        jd2.add(jtxtF2);

                        JLabel txt3 = new JLabel("Volume", 0);
                        txt3.setSize(50, 50);
                        jd2.add(txt3);

                        JTextField jtxtF3 = new JTextField(20);
                        jtxtF3.setVisible(true);
                        jtxtF3.setDoubleBuffered(true);
                        jtxtF3.setSize(50, 50);
                        jd2.add(jtxtF3);

                        JLabel txt4 = new JLabel("Valor Declarado", 0);
                        txt4.setSize(50, 50);
                        jd2.add(txt4);

                        JTextField jtxtF4 = new JTextField(5);
                        jtxtF4.setVisible(true);
                        jtxtF4.setDoubleBuffered(true);
                        jtxtF4.setSize(50, 50);
                        jd2.add(jtxtF4);

                        JLabel txt5 = new JLabel("Origem", 0);
                        txt5.setSize(50, 50);
                        jd2.add(txt5);

                        JTextField jtxtF5 = new JTextField(4);
                        jtxtF5.setVisible(true);
                        jtxtF5.setDoubleBuffered(true);
                        jtxtF5.setSize(50, 50);
                        jd2.add(jtxtF5);

                        JLabel txt6 = new JLabel("Data de validade", 0);
                        txt6.setSize(50, 50);
                        jd2.add(txt6);

                        JTextField jtxtF6 = new JTextField(10);
                        jtxtF6.setVisible(true);
                        jtxtF6.setDoubleBuffered(true);
                        jtxtF6.setSize(50, 50);
                        jd2.add(jtxtF6);
                        
                        JButton jdb1 = new JButton("Cadastrar Perecível");
                        jdb1.addActionListener(new ActionListener() {
                            @Override

                            public void actionPerformed(ActionEvent e) {
                                
                                double valor = Double.valueOf(jtxtF4.getText());
                                Integer volume = parseInt0(jtxtF3.getText());
                                app.cadastrarDuravel(jtxtF1.getText(), jtxtF2.getText(), volume, valor, jtxtF5.getText(), jtxtF6.getText());
                                jd2.setVisible(false);
                                mensagembala1.setText("Item perecivel cadastrado com sucesso");
                                mensagembala1.setVisible(true);
                            }
                        });
                        jd2.add(jdb1);
                        jd2.setVisible(true);
                    }
                });
                jbi2.setVisible(true);
                jd1.add(jbi2);
                jd1.setVisible(true);
                /*
                  JDialog jd = new JDialog(j1, "Cadastrar Item", true, null);
                  jd.setSize(500, 150);
                  jd.setLayout(layout1);
                  jd.setResizable(true);
                  
                  
                  JLabel txt1 = new JLabel("Código", 0);
                  txt1.setSize(50, 50);
                  jd.add(txt1);
                  
                  JTextField jtxtF1 = new JTextField(5);
                  jtxtF1.setSize(200, 20);
                  jtxtF1.setName("tru");
                  jd.add(jtxtF1);
                  
                  
                  
                  JLabel txt2 = new JLabel("Nome", 0);
                  txt2.setSize(50, 50);
                  jd.add(txt2);
                  
                  JTextField jtxtF2 = new JTextField(25);
                  jtxtF2.setVisible(true);
                  jtxtF2.setDoubleBuffered(true);
                 jtxtF2.setSize(50, 50);
                  jd.add(jtxtF2);
                  
                  JLabel txt3 = new JLabel("Cidade", 0);
                  txt3.setSize(50, 50);
                  jd.add(txt3);
                  
                  JTextField jtxtF3 = new JTextField(20);
                  jtxtF3.setVisible(true);
                  jtxtF3.setDoubleBuffered(true);
                  jtxtF3.setSize(50, 50);
                  jd.add(jtxtF3);
                  
                  JLabel txt4 = new JLabel("Endereço", 0);
                  txt4.setSize(50, 50);
                  jd.add(txt4);
                 
                  JTextField jtxtF4 = new JTextField(55);
                  jtxtF4.setVisible(true);
                  jtxtF4.setDoubleBuffered(true);
                  jtxtF4.setSize(50, 50);
                  jd.add(jtxtF4);
                 
                  JLabel txt5 = new JLabel("Cap. Máxima", 0);
                  txt5.setSize(50, 50);
                 jd.add(txt5);
                  
                  JTextField jtxtF5 = new JTextField(4);
                  jtxtF5.setVisible(true);
                  jtxtF5.setDoubleBuffered(true);
                  jtxtF5.setSize(50, 50);
                  jd.add(jtxtF5);
                  
                  
                 
                  JButton jdb1 = new JButton("Cadastrar Depósito");
                 jdb1.addActionListener(new ActionListener() {
                  
                  @Override
                  
                  public void actionPerformed(ActionEvent e){
                 Integer cod = parseInt0(jtxtF1.getText());
                  Integer capm = parseInt0(jtxtF5.getText());
                  app.cadastrarDeposito(cod, jtxtF2.getText(), jtxtF3.getText(),
                  jtxtF4.getText(), capm);
                  jd.setVisible(false);
                 }
                  });
                  jd.add(jdb1);
                  jd.setVisible(false);
                  
                 */}
        });
        p1.add(b3);

        JButton b4 = new JButton("Armazenar itens");
        b4.setSize(100, 100);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                gerenciador.organizarItensParaArmazenamento();
                mensagembala1.setText("Itens armazenados com sucesso");
                                mensagembala1.setVisible(true);
            }
        });
        p1.add(b4);

        JButton b5 = new JButton("Retirar item(EM ANALISE)");
        b5.setSize(100, 100);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JDialog jd = new JDialog(j1, "Retirar item(EM ANALISE)", true, null);
                  jd.setSize(500, 150);
                  jd.setLayout(layout1);
                  jd.setResizable(true);
                  
                  
                  JLabel txt1 = new JLabel("Código do item", 0);
                  txt1.setSize(50, 50);
                  jd.add(txt1);
                  
                  JTextField jtxtF1 = new JTextField(5);
                  jtxtF1.setSize(200, 20);
                  jtxtF1.setName("tru");
                  jd.add(jtxtF1);
                  

                  JLabel txt2 = new JLabel("Código do deposito", 0);
                  txt2.setSize(50, 50);
                  jd.add(txt2);
                  
                  JTextField jtxtF2 = new JTextField(5);
                  jtxtF2.setSize(200, 20);
                  jtxtF2.setName("tru");
                  jd.add(jtxtF2);

                  JButton jdb1 = new JButton("Retirar item");
                  jdb1.addActionListener(new ActionListener() {
                   
                   @Override
                   
                    public void actionPerformed(ActionEvent e){
                        Integer cod0 = parseInt0(jtxtF2.getText());
                        Deposito d0 = null;
                        for(int i = 0; i<gerenciador.getDepositos().size(); i++){
                        if(gerenciador.getDepositos().get(i).getCodigo() == cod0){
                        d0 = gerenciador.getDepositos().get(i);
                        break;}
                    
                }
                   app.retirarItem(jtxtF1.getText(), d0);
                   mensagembala1.setText("Item retirado com sucesso");
                   mensagembala1.setVisible(true);
                   jd.setVisible(false);
                  }
                   });
                   jd.add(jdb1);
                   jd.setVisible(true);
            }
        });
        p1.add(b5);
        
        JButton b6 = new JButton("Carregar Dados");
        b6.setSize(100, 100);
        p1.add(b6);

        JButton b7 = new JButton("Consultar item armazenado");
        b7.setSize(100, 100);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JDialog jd = new JDialog(j1, "Consultar item armazenado", true, null);
                  jd.setSize(500, 150);
                  jd.setLayout(layout1);
                  jd.setResizable(true);
                  
                  
                  JLabel txt1 = new JLabel("Código do item", 0);
                  txt1.setSize(50, 50);
                  jd.add(txt1);
                  
                  JTextField jtxtF1 = new JTextField(5);
                  jtxtF1.setSize(200, 20);
                  jtxtF1.setName("tru");
                  jd.add(jtxtF1);

                  JButton jdb1 = new JButton("Consultar");
                 jdb1.addActionListener(new ActionListener() {
                  
                  @Override
                  
                  public void actionPerformed(ActionEvent e){
                  JLabel jtxt2 = new JLabel(gerenciador.consultarItensArmazenados().toString());
                  jd.add(jtxt2);
                  mensagembala1.setText("Item consultado com sucesso");
                   mensagembala1.setVisible(true);
                  jd.setVisible(false);
                 }
                  });
                  jd.add(jdb1);
                  jd.setVisible(true);
            }
        });
        p1.add(b7);

        JButton b8 = new JButton("Escrever Dados");
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                gerenciador.escreverDados();
                mensagembala1.setText("Dados escritos com sucesso");
                mensagembala1.setVisible(true);
            }
        });
        b8.setSize(100, 100);
        p1.add(b8);
        JButton b9 = new JButton("Carregar Dados Salvos");
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JDialog jd = new JDialog(j1, "Cadastrar Item", true, null);
                  jd.setSize(500, 150);
                  jd.setLayout(layout1);
                  jd.setResizable(true);
                  //String str = gerenciador.carregarDadosSalvos();
                JLabel txt1 = new JLabel("Código", 0);
                  txt1.setSize(50, 50);
                  jd.add(txt1);

                  jd.setVisible(true);
            }
        });
        b9.setSize(100, 100);
        p1.add(b9);
        JButton b10 = new JButton("Finalizar Sessão");
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                j1.dispose();
            }
        });
        b10.setSize(100, 100);
        p1.add(b10);
        
        p1.setVisible(true);
        

        j1.add(p1);
    }

    /*
     * this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     * TratadorEventostratadorEventos=
     * newTratadorEventos();
     * botaoOK.addActionListener(tratadorEventos);
     * botaoLimpa.addActionListener(tratadorEventos);
     * this.setVisible(true);
     * }
     */
}
