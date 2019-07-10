/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Classes.Aluger;
import Classes.Automovel;
import Classes.Cliente;
import Classes.Funcionario;
import Classes.conexao;
import Classes.usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HWILL
 */
public class freLogin extends javax.swing.JFrame {

    conexao con = new conexao();
    Connection co = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    /**
     * Creates new form freLogin
     */
    public freLogin() {
        initComponents();
        co = con.getConnection();
        
    }

    public void logar(String nome, String senha) {
        String sql = "Select * From usuario where nome=? AND senha =? ";
        try {
            ps = co.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, senha);
            rs = ps.executeQuery();
            if (rs.next()) {
                
                JFMenu telamenu = new JFMenu();
                this.setVisible(false);
               telamenu.Mostra(rs.getInt("id_usuario"));
                telamenu.setVisible(true);
                telamenu.setExtendedState(JFMenu.NORMAL);
                JOptionPane.showMessageDialog(this, "Bem vindo ao Sistema");
            } else {
                JOptionPane.showMessageDialog(null, "Erro");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        jOptionPane3 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        btnsair = new javax.swing.JButton();
        txtsenha = new javax.swing.JPasswordField();
        btnlogin1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Meiryo", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Usúario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 63, 20));

        txtusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtusuario.setText("admin");
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 143, 30));

        btnsair.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnsair.setForeground(new java.awt.Color(204, 0, 0));
        btnsair.setText("Sair");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });
        getContentPane().add(btnsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        txtsenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtsenha.setText("admin");
        txtsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 143, 30));

        btnlogin1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnlogin1.setForeground(new java.awt.Color(0, 0, 204));
        btnlogin1.setText("Login");
        btnlogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogin1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/92cafafe3eb9bd23120da23bf498e592.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 290));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsenhaActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnlogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogin1ActionPerformed
        // TODO add your handling code here:
        logar(txtusuario.getText(), txtsenha.getText());


    }//GEN-LAST:event_btnlogin1ActionPerformed

    /**
     * @param args the command line arguments
     */
    static Funcionario func = new Funcionario();
    static Cliente cliente = new Cliente();
    static Automovel veiculo = new Automovel();
    static Aluger aluguer = new Aluger();
    static usuario user= new usuario();

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(freLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(freLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(freLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(freLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new freLogin().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin1;
    private javax.swing.JButton btnsair;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JOptionPane jOptionPane3;
    private javax.swing.JPasswordField txtsenha;
    public static javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}