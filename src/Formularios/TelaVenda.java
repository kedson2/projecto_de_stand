package Formularios;

import Classes.Venda;
import Classes.conexao;
import static Formularios.freLogin.cliente;
import static Formularios.freLogin.veiculo;
import Interfaces.AutomovelOperacao;

import Interfaces.VendaOperacao;
import funcao.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class TelaVenda extends javax.swing.JInternalFrame {

    VendaOperacao registo = new VendaOperacao();
    Venda vendas = new Venda();
    int controladora = 1;
    conexao con = new conexao();
    Connection co = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public TelaVenda() {
        initComponents();
        this.listaClintes.setVisible(false);
        this.listarVeiculos.setVisible(false);
        this.txtdesc.enable(false);
//        this.txtdesc.disable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buscacliente_venda = new javax.swing.JTextField();
        txtautomovel_venda = new javax.swing.JTextField();
        btnsalvar_venda = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtvalor_pagar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_venda = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        tipo_pagamento = new javax.swing.JComboBox<>();
        listaClintes = new javax.swing.JList<>();
        listarVeiculos = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtnome = new javax.swing.JLabel();
        txtmodeloveiculo = new javax.swing.JLabel();
        txtmatriculaveiculo = new javax.swing.JLabel();
        txtmarcaveiculo = new javax.swing.JLabel();
        txtcorveiculo = new javax.swing.JLabel();
        txtfinalvalou = new javax.swing.JLabel();
        txtprecoveiculo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtdesc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("SERVIÇO DE VENDA");
        setName(""); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Cliente:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 20, 60, 23));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Automovel:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 20, 90, 23));

        buscacliente_venda.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        buscacliente_venda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscacliente_vendaKeyReleased(evt);
            }
        });
        getContentPane().add(buscacliente_venda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 240, 32));

        txtautomovel_venda.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtautomovel_venda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtautomovel_vendaKeyReleased(evt);
            }
        });
        getContentPane().add(txtautomovel_venda, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 210, 32));

        btnsalvar_venda.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnsalvar_venda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/btnsave.png"))); // NOI18N
        btnsalvar_venda.setText("Registrar");
        btnsalvar_venda.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnsalvar_venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvar_vendaActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalvar_venda, new org.netbeans.lib.awtextra.AbsoluteConstraints(751, 214, 130, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/btncancel1.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 214, -1, 40));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Modelo:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 60, 32));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setText("Valor a ser Pago:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 120, 30));

        txtvalor_pagar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        getContentPane().add(txtvalor_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 130, 32));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setText("Cor:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 30, 30));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Search.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 40, 32));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Search.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 40, 32));

        lista_venda.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(lista_venda);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 880, 110));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel11.setText("Tipo de Pagamento:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 140, 31));

        tipo_pagamento.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tipo_pagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma Opção", "Cheque", "À Dinheiro" }));
        getContentPane().add(tipo_pagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 180, 31));

        listaClintes.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        listaClintes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaClintesMouseClicked(evt);
            }
        });
        getContentPane().add(listaClintes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 240, 90));

        listarVeiculos.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        listarVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarVeiculosMouseClicked(evt);
            }
        });
        getContentPane().add(listarVeiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 210, 100));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel12.setText("Cliente:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 90, 60, 32));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel13.setText("Marca:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 50, 32));

        txtnome.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtnome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 90, 200, 32));

        txtmodeloveiculo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtmodeloveiculo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtmodeloveiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 90, 130, 32));

        txtmatriculaveiculo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtmatriculaveiculo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtmatriculaveiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 130, 32));

        txtmarcaveiculo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtmarcaveiculo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtmarcaveiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 90, 130, 32));

        txtcorveiculo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtcorveiculo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtcorveiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 130, 32));

        txtfinalvalou.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtfinalvalou.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtfinalvalou, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 130, 32));

        txtprecoveiculo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtprecoveiculo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtprecoveiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 130, 32));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel10.setText("Fazer Desco:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, 30));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Preço do Veiculo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 130, 130, 23));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel14.setText("Matricula:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 70, 23));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel15.setText("Preço Final:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, 30));

        txtdesc.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtdesc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdescKeyReleased(evt);
            }
        });
        getContentPane().add(txtdesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 40, 30));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setText("%");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, -1, 30));

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jButton1.setText("Adicionar Desconntos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 160, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalvar_vendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvar_vendaActionPerformed
        AutomovelOperacao carro = new AutomovelOperacao();
        if (this.txtnome.getText().length() <= 0 || this.txtmarcaveiculo.getText().length() <= 0 || this.txtvalor_pagar.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, " Preencha todos campos");
        } else if (this.txtvalor_pagar.getText().equals(this.txtfinalvalou.getText())) {
            vendas.setTipo_pagamento(this.tipo_pagamento.getSelectedItem() + "");
            vendas.setValor(Double.parseDouble(this.txtvalor_pagar.getText()));
            vendas.setId_Cliente(cliente.getId_cliente());
            vendas.setId_Automovel(veiculo.getId_Automovel());
            vendas.setDescontos(txtdesc.getText()+"%");
            System.out.println(vendas.getDescontos());
            carro.Alterar(veiculo.getId_Automovel(), veiculo.getEstado());
            registo.Cadastra(vendas);
            limpar();

            String sql = "SELECT venda.id_venda, cliente.nome, cliente.contacto, automovel.marca, automovel.modelo,automovel.cor,automovel.matricula, venda.tipo_pagamento,venda.valor_venda FROM venda,cliente,automovel where venda.id_cliente=cliente.id_cliente and venda.id_automovel= automovel.id_automovel ";
            dao x = new dao();

            x.Lista_SqlTabela(sql, lista_venda);

        } else {
            JOptionPane.showMessageDialog(null, " Valor do automovel incorreto ");

        }


    }//GEN-LAST:event_btnsalvar_vendaActionPerformed

    private void buscacliente_vendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscacliente_vendaKeyReleased
        // TODO add your handling code here:

        listarvendacliente(buscacliente_venda.getText());

    }//GEN-LAST:event_buscacliente_vendaKeyReleased

    private void txtautomovel_vendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtautomovel_vendaKeyReleased

        listarcarrosvendas(txtautomovel_venda.getText());

    }//GEN-LAST:event_txtautomovel_vendaKeyReleased

    public void limpar() {
        this.txtmarcaveiculo.setText("");
        this.txtautomovel_venda.setText("");
        this.txtnome.setText("");
        this.txtmodeloveiculo.setText("");
        this.txtmatriculaveiculo.setText("");
        this.txtprecoveiculo.setText("");
        this.txtcorveiculo.setText("");
        this.buscacliente_venda.setText("");
        this.txtvalor_pagar.setText("");
        this.txtdesc.enable(false);
        this.txtdesc.setText("");
        this.txtfinalvalou.setText("");

    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void listaClintesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaClintesMouseClicked
        // TODO add your handling code here:
        listarPesquisacliente();

    }//GEN-LAST:event_listaClintesMouseClicked

    private void listarVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarVeiculosMouseClicked
        // TODO add your handling code here:

        listarPesquisadeveiculosvendas();

    }//GEN-LAST:event_listarVeiculosMouseClicked

    private void txtdescKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescKeyReleased
        // TODO add your handling code here:
        int valo = 0;
        try {
            valo = Integer.parseInt(txtdesc.getText());
            
        } catch (Exception e) {

            txtdesc.setText("");
            System.out.println(e);
        }
        txtfinalvalou.setText(registo.Descontos(Double.parseDouble(txtprecoveiculo.getText()), valo) + "");
        txtvalor_pagar.setText(registo.Descontos(Double.parseDouble(txtprecoveiculo.getText()), valo) + "");
    }//GEN-LAST:event_txtdescKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.txtdesc.enable(true);
        this.txtdesc.requestFocus();

        // this.txtdesc.;
    }//GEN-LAST:event_jButton1ActionPerformed
    public void listarvendacliente(String nome_cline) {
        DefaultListModel defaultlistModel = new DefaultListModel();
        listaClintes.setModel(defaultlistModel);
        co = con.getConnection();
        try {
            String sql = "SELECT *  FROM cliente WHERE nome LIKE '%" + nome_cline + "%'";
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
                listaClintes.setVisible(true);
            } else {
                listaClintes.setVisible(false);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        con.closeConnection();
    }

    public void listarPesquisacliente() {
        co = con.getConnection();
        int linha = listaClintes.getSelectedIndex();
        if (linha >= 0) {
            try {
                String sql = "SELECT *  FROM `cliente` WHERE `nome` LIKE '%" + listaClintes.getSelectedValue() + "%'";
                ps = co.prepareStatement(sql);
                rs = ps.executeQuery();
                rs.first();
                this.txtnome.setText(rs.getString("nome"));
                cliente.setId_cliente(rs.getInt("id_cliente"));
                this.buscacliente_venda.setText("");
                this.listaClintes.setVisible(false);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } else {
        }
        con.closeConnection();
    }

    public void listarcarrosvendas(String marca) {
        DefaultListModel defaultx = new DefaultListModel();
        listarVeiculos.setModel(defaultx);
        co = con.getConnection();
        try {
            String sql = "SELECT *  FROM `automovel` WHERE `marca` LIKE '%" + marca + "%' AND `estado` = 1 AND `categoria_servico` LIKE 'Venda' ORDER BY marca ASC";
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
                listarVeiculos.setVisible(true);
            } else {
                listarVeiculos.setVisible(false);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void listarPesquisadeveiculosvendas() {
        co = con.getConnection();
        int linhas = listarVeiculos.getSelectedIndex();
        if (linhas >= 0) {
            try {
                String tres = "SELECT *  FROM `automovel` WHERE `marca` LIKE '%" + listarVeiculos.getSelectedValue() + "%' AND categoria_servico LIKE 'Venda' AND estado ='1'";
                ps = co.prepareStatement(tres);
                System.out.println(tres);
                rs = ps.executeQuery();
                rs.first();
                this.txtmarcaveiculo.setText(rs.getString("marca"));
                this.txtmodeloveiculo.setText(rs.getString("modelo"));
                this.txtmatriculaveiculo.setText(rs.getString("matricula"));
                this.txtcorveiculo.setText(rs.getString("cor"));
                veiculo.setId_Automovel(rs.getInt("id_automovel"));
                this.txtprecoveiculo.setText(rs.getString("preco"));
                veiculo.setEstado(rs.getBoolean("estado"));
                this.txtautomovel_venda.setText("");
                this.txtfinalvalou.setText(rs.getString("preco"));
                txtvalor_pagar.setText(rs.getString("preco"));
                this.listarVeiculos.setVisible(false);

            } catch (SQLException ex) {
                Logger.getLogger(TelaAluguer.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
        }
        con.closeConnection();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsalvar_venda;
    private javax.swing.JTextField buscacliente_venda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaClintes;
    private javax.swing.JTable lista_venda;
    private javax.swing.JList<String> listarVeiculos;
    private javax.swing.JComboBox<String> tipo_pagamento;
    private javax.swing.JTextField txtautomovel_venda;
    private javax.swing.JLabel txtcorveiculo;
    private javax.swing.JTextField txtdesc;
    private javax.swing.JLabel txtfinalvalou;
    private javax.swing.JLabel txtmarcaveiculo;
    private javax.swing.JLabel txtmatriculaveiculo;
    private javax.swing.JLabel txtmodeloveiculo;
    private javax.swing.JLabel txtnome;
    private javax.swing.JLabel txtprecoveiculo;
    private javax.swing.JTextField txtvalor_pagar;
    // End of variables declaration//GEN-END:variables
}
