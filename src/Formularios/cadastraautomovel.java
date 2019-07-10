/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Classes.Automovel;
import static Formularios.freLogin.veiculo;
import Interfaces.AutomovelOperacao;
import javax.swing.JOptionPane;

/**
 *
 * @author HWILL
 */
public class cadastraautomovel extends javax.swing.JInternalFrame {

    Automovel au = new Automovel();

    private final AutomovelOperacao automovelinserir = new AutomovelOperacao();

    /**
     * Creates new form TelaCadastroAutomovel
     */
    public cadastraautomovel() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        boxtipocombustivel = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        boxnumerodeassento = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtmarca = new javax.swing.JTextField();
        txtano = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        txtmatricula = new javax.swing.JTextField();
        txtcor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtfornecedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        salvarauto = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        Alterar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        boxservico = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("CADASTRO DE VEICULO");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Marca:");

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/btncancel1.png"))); // NOI18N
        jButton4.setText("Cancelar");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Matricula:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Tipo_Combustivel:");

        boxtipocombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecione um valor", "Gasóleo", "Gasólina" }));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Numero_de_assento:");

        boxnumerodeassento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecione um valor", "2", "4", "5", "6", "7", "8" }));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Cor:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Fornecedor:");

        txtmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarcaActionPerformed(evt);
            }
        });

        txtano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanoActionPerformed(evt);
            }
        });

        txtmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmodeloActionPerformed(evt);
            }
        });

        txtmatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatriculaActionPerformed(evt);
            }
        });

        txtcor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Modelo:");

        txtfornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfornecedorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Ano:");

        salvarauto.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        salvarauto.setForeground(new java.awt.Color(0, 51, 255));
        salvarauto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/btnsave.png"))); // NOI18N
        salvarauto.setText("Salvar");
        salvarauto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarautoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Valor:");

        txtValor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Alterar.png"))); // NOI18N
        Alterar.setText("Alterar");
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Categoria de Serviço:");

        boxservico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecione um valor", "Venda", "Aluguer" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtano))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtcor, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jButton4)
                        .addGap(99, 99, 99)
                        .addComponent(Alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salvarauto)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boxservico, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boxtipocombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxnumerodeassento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValor))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtano, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxnumerodeassento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(boxtipocombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boxservico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvarauto)
                    .addComponent(Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Pintar() {
        this.txtmarca.setText(veiculo.getMarca());
        this.txtmodelo.setText(veiculo.getModelo());
        this.txtcor.setText(veiculo.getCor());
        this.txtmatricula.setText(veiculo.getMatricula());
        this.txtano.setText(veiculo.getAno() + "");
        this.txtfornecedor.setText(veiculo.getFornecedor());
        this.boxnumerodeassento.setSelectedItem(veiculo.getNumero_de_assento());
        this.boxtipocombustivel.setSelectedItem(veiculo.getCombustivel());
        this.txtValor.setText(veiculo.getPreco() + "");
        this.salvarauto.setVisible(false);
        this.boxservico.setSelectedItem(veiculo.getCategoria_servico());
        veiculo.getEstado();

    }
    private void txtmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmarcaActionPerformed

    private void txtanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanoActionPerformed

    private void txtmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmodeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmodeloActionPerformed

    private void txtmatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatriculaActionPerformed

    private void txtcorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorActionPerformed

    private void txtfornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfornecedorActionPerformed

    private void salvarautoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarautoActionPerformed
        if (this.txtmodelo.getText().length() <= 0 || this.txtmarca.getText().length() <= 0 || this.txtcor.getText().length() <= 0 || this.txtfornecedor.getText().length() <= 0 || this.txtano.getText().length() <= 0 || this.txtValor.getText().length() <= 0 || this.txtmatricula.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Preenxe todos os campos");
        } else if (this.txtano.getText().length() < 4 || this.txtano.getText().length() > 4) {

            JOptionPane.showMessageDialog(null, " Ano invalido ");
        } else {
            au.setCombustivel(this.boxtipocombustivel.getSelectedItem() + "");
            au.setFornecedor(this.txtfornecedor.getText());
            au.setMarca(this.txtmarca.getText());
            au.setMatricula(this.txtmatricula.getText());
            au.setNumero_de_assento(this.boxnumerodeassento.getSelectedItem() + "");
            au.setModelo(this.txtmodelo.getText());
            au.setCor(this.txtcor.getText());
            au.setAno(this.txtano.getText());
            au.setPreco(Float.parseFloat(this.txtValor.getText()));
            au.setCategoria_servico(this.boxservico.getSelectedItem() + "");
            au.setNumero_de_assento(boxnumerodeassento.getSelectedItem() + "");
            automovelinserir.Cadastra(au);
            limpar();
        }
    }//GEN-LAST:event_salvarautoActionPerformed
    public void limpar() {
        this.txtmarca.setText("");
        this.txtmodelo.setText("");
        this.txtcor.setText("");
        this.txtmatricula.setText("");
        this.txtano.setText("");
        this.txtfornecedor.setText("");
        this.boxnumerodeassento.setSelectedIndex(0);
        this.boxtipocombustivel.setSelectedIndex(0);
        this.txtValor.setText("");
        this.boxservico.setSelectedIndex(0);
    }


    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        // TODO add your handling code here:
        if (this.txtmodelo.getText().length() <= 0 || this.txtmarca.getText().length() <= 0 || this.txtcor.getText().length() <= 0 || this.txtfornecedor.getText().length() <= 0 || this.txtano.getText().length() <= 0 || this.txtValor.getText().length() <= 0 || this.txtmatricula.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Preenxe todos os campos");
        } else if (this.txtano.getText().length() < 4 || this.txtano.getText().length() > 4) {

            JOptionPane.showMessageDialog(null, " Ano invalido ");
        } else {
            veiculo.setCombustivel(this.boxtipocombustivel.getSelectedItem() + "");
            veiculo.setFornecedor(this.txtfornecedor.getText());
            veiculo.setMarca(this.txtmarca.getText());
            veiculo.setMatricula(this.txtmatricula.getText());
            veiculo.setNumero_de_assento(this.boxnumerodeassento.getSelectedItem() + "");
            veiculo.setModelo(this.txtmodelo.getText());
            veiculo.setCor(this.txtcor.getText());
            veiculo.setAno(this.txtano.getText());
            veiculo.setPreco(Float.parseFloat(this.txtValor.getText()));
            veiculo.setCategoria_servico(this.boxservico.getSelectedItem() + "");
            automovelinserir.Alterar(veiculo);
            limpar();

        }
    }//GEN-LAST:event_AlterarActionPerformed
    public void btndesativar() {
       Alterar.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JComboBox<String> boxnumerodeassento;
    private javax.swing.JComboBox<String> boxservico;
    private javax.swing.JComboBox<String> boxtipocombustivel;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton salvarauto;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtano;
    private javax.swing.JTextField txtcor;
    private javax.swing.JTextField txtfornecedor;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmatricula;
    private javax.swing.JTextField txtmodelo;
    // End of variables declaration//GEN-END:variables
}
