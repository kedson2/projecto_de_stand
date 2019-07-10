package Formularios;

import Classes.Aluger;
import Classes.conexao;
import static Formularios.freLogin.cliente;
import static Formularios.freLogin.veiculo;
import Interfaces.AluguerOpercao;
import Interfaces.AutomovelOperacao;
import funcao.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author HWILL
 */
public class TelaAluguer extends javax.swing.JInternalFrame {

    int controladora = 0;
    LocalDate hoje = LocalDate.now();
    AutomovelOperacao kkkk = new AutomovelOperacao();
    AluguerOpercao registo = new AluguerOpercao();
    Aluger novo = new Aluger();

    conexao con = new conexao();
    Connection co = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public TelaAluguer() {
        initComponents();

        listarcarros.setVisible(false);
        listarcliente.setVisible(false);
        TelaAluguer.txtxinciu.setText(hoje.toString());
        Date relogio = new Date();
        this.txthora.setText(String.format("%1$tH:%1$tM", relogio));
        registo.Acomulado(txtacomulado);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnsalvar_aluguer = new javax.swing.JButton();
        txtcliente_aluguer = new javax.swing.JTextField();
        txtautovel_aluguer = new javax.swing.JTextField();
        btncancelaraluguer = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablealuger = new javax.swing.JTable();
        btn_novo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtdataenterga = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        duracao_locacao = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtcusto = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtdetahes = new javax.swing.JTextField();
        listarcliente = new javax.swing.JList<>();
        txthora = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        listarcarros = new javax.swing.JList<>();
        txtxmodeloveiculo = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtnomeCliente = new javax.swing.JLabel();
        txtxrmatricula = new javax.swing.JLabel();
        txtmarcaveiculo = new javax.swing.JLabel();
        txxtcor = new javax.swing.JLabel();
        txtxpreco = new javax.swing.JLabel();
        txtxinciu = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtacomulado = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("SERVIÇO ALUGUER");
        setOpaque(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Cliente:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 23));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Automovel:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, 23));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setText("Valor por dia:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, 28));

        btnsalvar_aluguer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnsalvar_aluguer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/btnsave.png"))); // NOI18N
        btnsalvar_aluguer.setText("Registrar");
        btnsalvar_aluguer.setBorder(null);
        btnsalvar_aluguer.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnsalvar_aluguer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvar_aluguerActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalvar_aluguer, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 90, -1));

        txtcliente_aluguer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcliente_aluguerActionPerformed(evt);
            }
        });
        txtcliente_aluguer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcliente_aluguerKeyReleased(evt);
            }
        });
        getContentPane().add(txtcliente_aluguer, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 208, 28));

        txtautovel_aluguer.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtautovel_aluguer.setOpaque(false);
        txtautovel_aluguer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtautovel_aluguerKeyReleased(evt);
            }
        });
        getContentPane().add(txtautovel_aluguer, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 202, 30));

        btncancelaraluguer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btncancelaraluguer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/btncancel1.png"))); // NOI18N
        btncancelaraluguer.setText("Cancelar");
        btncancelaraluguer.setBorder(null);
        btncancelaraluguer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelaraluguerActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelaraluguer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, 35));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel12.setText("Cor:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, -1, -1));

        tablealuger.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablealuger);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 910, 111));

        btn_novo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Add.png"))); // NOI18N
        btn_novo.setText("Nova");
        btn_novo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_novo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 74, 38));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Search.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 22, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Search.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 22, 30));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setText("Data de iniciu:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 28));

        txtdataenterga.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        getContentPane().add(txtdataenterga, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 107, 30));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel15.setText("Data devolução:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, 23));

        duracao_locacao.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        duracao_locacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a Opição", "Dias", "Semana", "Mes", "Ano" }));
        duracao_locacao.setOpaque(false);
        duracao_locacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duracao_locacaoActionPerformed(evt);
            }
        });
        duracao_locacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                duracao_locacaoKeyReleased(evt);
            }
        });
        getContentPane().add(duracao_locacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 140, 31));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("Duração:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 59, 28));

        txtcusto.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtcusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcustoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 130, 30));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel16.setText("Custo Total:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, 23));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setText("Detalhe a escoha:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, 28));

        txtdetahes.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtdetahes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdetahesActionPerformed(evt);
            }
        });
        txtdetahes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdetahesKeyReleased(evt);
            }
        });
        getContentPane().add(txtdetahes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 110, 28));

        listarcliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        listarcliente.setFocusCycleRoot(true);
        listarcliente.setFocusTraversalPolicy(null);
        listarcliente.setFocusTraversalPolicyProvider(true);
        listarcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarclienteMouseClicked(evt);
            }
        });
        getContentPane().add(listarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 210, 90));

        txthora.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        getContentPane().add(txthora, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 110, 30));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel10.setText("Hora:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 41, 30));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel11.setText("Modelo:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, 23));

        listarcarros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        listarcarros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarcarrosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listarcarrosMousePressed(evt);
            }
        });
        getContentPane().add(listarcarros, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 200, 90));

        txtxmodeloveiculo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtxmodeloveiculo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtxmodeloveiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 90, 30));

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel17.setText("Cliente:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 23));

        txtnomeCliente.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtnomeCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtnomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 170, 30));

        txtxrmatricula.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtxrmatricula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtxrmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 100, 30));

        txtmarcaveiculo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtmarcaveiculo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtmarcaveiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 90, 30));

        txxtcor.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txxtcor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txxtcor, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 100, 30));

        txtxpreco.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtxpreco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtxpreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 120, 30));

        txtxinciu.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtxinciu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtxinciu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 120, 30));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel13.setText("Marca:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel18.setText("Matricula:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Valor Total de Alugueis de hoje:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 210, 30));

        txtacomulado.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtacomulado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtacomulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 220, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelaraluguerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelaraluguerActionPerformed
        // TODO add your handling code here:
        Cancelar();
    }//GEN-LAST:event_btncancelaraluguerActionPerformed

    private void btnsalvar_aluguerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvar_aluguerActionPerformed
        if (this.txtnomeCliente.getText().length() <= 0 || this.txtmarcaveiculo.getText().length() <= 0 || this.txtdetahes.getText().length() <= 0 || this.txtcusto.getText().length() <= 0 || this.txtdataenterga.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Preenxe todos os campos");
        } else {
            novo.setId_Automovel(veiculo.getId_Automovel());
            novo.setId_cliente(cliente.getId_cliente());
            novo.setValor_final(Double.parseDouble(txtcusto.getText()));
            novo.setData_de_saida(this.txtxinciu.getText());
            novo.setData_de_entrega(this.txtdataenterga.getText());
            novo.setHora_de_entrega(this.txthora.getText());
            System.out.println(veiculo.getEstado());
            kkkk.Alterar(veiculo.getId_Automovel(), veiculo.getEstado());
            System.out.println(veiculo.getEstado());
            System.out.println(txtxrmatricula.getText());
            registo.Cadastra(novo);
            String sql = "SELECT aluger.id_aluger,data_inicio,data_termino, cliente.nome, automovel.marca,automovel.matricula, veiculo FROM aluger,cliente,automovel where aluger.id_cliente=cliente.id_cliente AND `veiculo` LIKE 'Alugado' and aluger.id_automovel= automovel.id_automovel ORDER BY `id_aluger` ASC";
            dao x = new dao();
            Cancelar();
            x.Lista_SqlTabela(sql, tablealuger);
            Cancelar();
            registo.Acomulado(txtacomulado);
            btncancelaraluguer.setEnabled(false);
        }
    }//GEN-LAST:event_btnsalvar_aluguerActionPerformed


    private void txtcliente_aluguerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcliente_aluguerKeyReleased
        // TODO add your handling code here:

//            listarPesquisa();
//        
////        String nome_a_pesquisar = txtcliente_aluguer.getText();
        listar(txtcliente_aluguer.getText());
    }//GEN-LAST:event_txtcliente_aluguerKeyReleased

    private void txtautovel_aluguerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtautovel_aluguerKeyReleased
        // TODO add your handling code here:

        listarcarros(txtautovel_aluguer.getText());
    }//GEN-LAST:event_txtautovel_aluguerKeyReleased

    private void txtcliente_aluguerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcliente_aluguerActionPerformed
//        listarcliente.setVisible(false);
//        controladora = 1;
    }//GEN-LAST:event_txtcliente_aluguerActionPerformed

    private void duracao_locacaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_duracao_locacaoKeyReleased
    }//GEN-LAST:event_duracao_locacaoKeyReleased

    private void txtdetahesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdetahesKeyReleased
        // TODO add your handling code here:
        if (duracao_locacao.getSelectedItem() == "Dias") {
            try {
                int dia = Integer.parseInt(txtdetahes.getText());
                double c = Double.parseDouble(txtxpreco.getText());

                txtcusto.setText(registo.CalcularPreco(dia, c) + "");

                LocalDate dias = hoje.plusDays(dia);
                txtdataenterga.setText(dias.toString());
            } catch (NumberFormatException e) {
                txtdataenterga.setText("");

            }

        } else if (duracao_locacao.getSelectedItem() == "Mes") {
            try {
                int mez = Integer.parseInt(txtdetahes.getText());
                int c = Integer.parseInt(txtxpreco.getText());
                int k = mez * 31;

                txtcusto.setText(registo.CalcularPreco(k, c) + "");
                LocalDate mes = hoje.plusMonths(mez);
                txtdataenterga.setText(mes.toString());

            } catch (NumberFormatException e) {
                txtdataenterga.setText("");

            }

        } else if (duracao_locacao.getSelectedItem() == "Ano") {
            try {
                int ano = Integer.parseInt(txtdetahes.getText());
                int a = Integer.parseInt(txtxpreco.getText());

                int k = ano * 365;

                txtcusto.setText(registo.CalcularPreco(k, a) + "");
                LocalDate anos = hoje.plusYears(ano);
                txtdataenterga.setText(anos.toString());
            } catch (NumberFormatException e) {
                txtdataenterga.setText("");

            }

        } else if (duracao_locacao.getSelectedItem() == "Semana") {
            try {
                int week = Integer.parseInt(txtdetahes.getText());
                int a = Integer.parseInt(txtxpreco.getText());

                int k = week * 7;

                txtcusto.setText(registo.CalcularPreco(k, a) + "");
                LocalDate semana = hoje.plusWeeks(week);
                txtdataenterga.setText(semana.toString());
            } catch (NumberFormatException e) {
                txtdataenterga.setText("");

            }

        } else if (duracao_locacao.getSelectedItem() == "Selecione a Opição") {
            JOptionPane.showMessageDialog(null, "Por favor selecione uma opção");
        }
    }//GEN-LAST:event_txtdetahesKeyReleased

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        btnsalvar_aluguer.setEnabled(true);
        btncancelaraluguer.setEnabled(true);
    }//GEN-LAST:event_btn_novoActionPerformed

    private void duracao_locacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duracao_locacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duracao_locacaoActionPerformed

    private void txtcustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcustoActionPerformed

    private void txtdetahesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdetahesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdetahesActionPerformed

    private void listarclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarclienteMouseClicked
        listarPesquisa();


    }//GEN-LAST:event_listarclienteMouseClicked

    private void listarcarrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarcarrosMouseClicked
        // TODO add your handling code here:
        listarPesquisadeveiculos();

    }//GEN-LAST:event_listarcarrosMouseClicked

    private void listarcarrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarcarrosMousePressed
    }//GEN-LAST:event_listarcarrosMousePressed

    public void listar(String nome_cline) {
        DefaultListModel defaultlistModel = new DefaultListModel();
        listarcliente.setModel(defaultlistModel);
        co = con.getConnection();
        try {
            String sql = "SELECT *  FROM `cliente` WHERE `nome` LIKE '%" + nome_cline + "%'";
            ps = co.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("Ok executandos" + sql);
            defaultlistModel.removeAllElements();
            int v = 0;
            while (rs.next() & v < 4) {
                if (!nome_cline.equals("")) {
                    defaultlistModel.addElement(rs.getString("nome"));

                    v++;
                }
            }
            if (v >= 1) {
                listarcliente.setVisible(true);
            } else {
                listarcliente.setVisible(false);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void listarPesquisa() {
        co = con.getConnection();
        int linha = listarcliente.getSelectedIndex();
        if (linha >= 0) {
            try {
                String sql = "SELECT *  FROM `cliente` WHERE `nome` LIKE '%" + listarcliente.getSelectedValue() + "%' ";
                ps = co.prepareStatement(sql);
                rs = ps.executeQuery();
                rs.first();
                this.txtnomeCliente.setText(rs.getString("nome"));
                cliente.setId_cliente(rs.getInt("id_cliente"));
                txtcliente_aluguer.setText("");
                this.listarcliente.setVisible(false);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } else {
        }
    }

    public void listarcarros(String marca) {
        DefaultListModel defaultx = new DefaultListModel();
        listarcarros.setModel(defaultx);
        co = con.getConnection();
        try {
            String sql = "SELECT *  FROM `automovel` WHERE `marca` LIKE '%" + marca + "%' AND `estado` = 1 AND `categoria_servico` LIKE 'Aluguer' ORDER BY marca ASC";
            ps = co.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("Ok executandos" + sql);
            defaultx.removeAllElements();
            int k = 0;
            while (rs.next() & k < 4) {
                if (!marca.equals("")) {
                    defaultx.addElement(rs.getString("marca"));
                    k++;
                }
            }
            if (k >= 1) {
                listarcarros.setVisible(true);
            } else {
                listarcarros.setVisible(false);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void listarPesquisadeveiculos() {
        co = con.getConnection();
        int linhas = listarcarros.getSelectedIndex();
        if (linhas >= 0) {
            try {
                String tres = "SELECT *  FROM `automovel` WHERE `marca` LIKE '%" + listarcarros.getSelectedValue() + "%' AND categoria_servico LIKE 'Aluguer' AND estado ='1' ";
                ps = co.prepareStatement(tres);
                System.out.println(tres);
                rs = ps.executeQuery();
                rs.first();
                this.txtmarcaveiculo.setText(rs.getString("marca"));
                this.txtxmodeloveiculo.setText(rs.getString("modelo"));
                this.txtxrmatricula.setText(rs.getString("matricula"));
                this.txxtcor.setText(rs.getString("cor"));
                veiculo.setId_Automovel(rs.getInt("id_automovel"));
                this.txtxpreco.setText(rs.getString("preco"));
                veiculo.setEstado(rs.getBoolean("estado"));
                this.listarcarros.setVisible(false);

            } catch (SQLException ex) {
                Logger.getLogger(TelaAluguer.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
        }
    }

    public void Cancelar() {
        this.txtcliente_aluguer.setText("");
        this.txtautovel_aluguer.setText("");
        this.txtdetahes.setText("");
        this.txtcusto.setText("");
        this.txtdataenterga.setText("");
        this.txtxrmatricula.setText("");
        this.txthora.setText("");
        this.txtmarcaveiculo.setText("");
        this.txtxpreco.setText("");
        this.txtxmodeloveiculo.setText("");
        this.txtnomeCliente.setText("");
        btnsalvar_aluguer.setEnabled(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btncancelaraluguer;
    private javax.swing.JButton btnsalvar_aluguer;
    private javax.swing.JComboBox<String> duracao_locacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JList<String> listarcarros;
    public javax.swing.JList<String> listarcliente;
    private javax.swing.JTable tablealuger;
    private javax.swing.JLabel txtacomulado;
    private javax.swing.JTextField txtautovel_aluguer;
    private javax.swing.JTextField txtcliente_aluguer;
    private javax.swing.JTextField txtcusto;
    private javax.swing.JTextField txtdataenterga;
    private javax.swing.JTextField txtdetahes;
    public javax.swing.JTextField txthora;
    private javax.swing.JLabel txtmarcaveiculo;
    private javax.swing.JLabel txtnomeCliente;
    public static javax.swing.JLabel txtxinciu;
    private javax.swing.JLabel txtxmodeloveiculo;
    private javax.swing.JLabel txtxpreco;
    private javax.swing.JLabel txtxrmatricula;
    private javax.swing.JLabel txxtcor;
    // End of variables declaration//GEN-END:variables
}
