/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao;

import java.awt.HeadlessException;

import java.sql.PreparedStatement;

import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import Classes.conexao;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Odnilson
 */
public class dao extends conexao {

    // metodos para inserir no banco de bados
    public void Insert(String sql) {
        getConnection();

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            

            stmt.execute();
            JOptionPane.showMessageDialog(null, "Inserido o cadastro com exito.");
        } catch (SQLException ex) {
            System.out.println(sql);
            JOptionPane.showMessageDialog(null, " ERRO NA OPERAÇÃO " + ex.getMessage());
        }
        closeConnection();
    }

    // metodos para fazer listagem em table 
    public String Lista_SqlTabela(String sql, JTable tabela) {
        getConnection();
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);
            System.out.println("Ok executandos" + sql);
            resultset = stmt.executeQuery();
            tabela.setModel(DbUtils.resultSetToTableModel(resultset));

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex + " Na Tabela" + tabela);

        }
        closeConnection();
        return "";
    }

    public void excluir(String excluir) {
        getConnection();

        try {
            PreparedStatement stmt = con.prepareStatement(excluir);

            stmt.execute();
            JOptionPane.showMessageDialog(null, "Executado Com Exito");
        } catch (SQLException ex) {
            System.out.println(excluir);
            JOptionPane.showMessageDialog(null, " ERRO NA OPERAÇÃO " + ex.getMessage());
        }
        closeConnection();

    }
    //metudo pra fazer exclusao
public void Editar(String editar) {
        getConnection();

        try {
            PreparedStatement stmt = con.prepareStatement(editar);

            stmt.execute();
           // JOptionPane.showMessageDialog(null, " Alterado com sucesso");
            System.out.println("Alterado com sucesso");
        } catch (SQLException ex) {
            System.out.println(editar);
            JOptionPane.showMessageDialog(null, " ERRO NA OPERAÇÃO " + ex.getMessage());
        }
        closeConnection();

    }
}
