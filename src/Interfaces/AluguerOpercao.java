/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Aluger;
import Classes.Automovel;
import Classes.conexao;
import funcao.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author HWILL
 */
public class AluguerOpercao implements Opercao<Aluger> {

    @Override
    public void Cadastra(Aluger loca) {

        String sql = "Insert into aluger(id_cliente, id_automovel, valor_aluguer, data_inicio, data_termino,hora_termino,veiculo ) "
                + "value('" + loca.getId_cliente() + "','" + loca.getId_Automovel() + "','" + loca.getValor_final() + "','" + loca.getData_de_saida() + "','" + loca.getData_de_entrega() + "','" + loca.getHora_de_entrega() + "','Alugado')";
        dao x = new dao();
        x.Insert(sql);
    }

    @Override
    public void Alterar(Aluger objeto) {

    }

    @Override
    public void Excluir(String f) {

    }

    public int CalcularPreco(LocalDate inicio, LocalDate termino) {
        int f = inicio.compareTo(termino);
        return f;
    }

    public double CalcularPreco(int dia, double preco) {
        double f = dia * preco;
        return f;
    }

    public boolean Pagar(double custo, double pago) {
        double diferenca = custo - pago;
        if (diferenca == 0) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Digite O valor do aluguer valido!");
            return false;
        }

    }

    public void devolver(int s, double valor, LocalDate hoje) {
        String sql = "UPDATE `aluger` SET `veiculo` = 'Devolvido',valor_aluguer='" + valor + "',data_termino='" + hoje + "'  WHERE `aluger`.`id_aluger` = " + s + " ";
        dao x = new dao();
        x.Editar(sql);
        System.out.println(sql);
         JOptionPane.showMessageDialog(null, " Automovel foi devolvido com sucesso");
    }

    public boolean Verificar(LocalDate diatermino, String hora, boolean is, String u, int devolver) {
        Date relogio = new Date();
        LocalDate hoje = LocalDate.now();
        hora = (String.format("%1$tH:%1$tM", relogio));

        if (hoje.isEqual(diatermino)) {

            int v = JOptionPane.showConfirmDialog(null, "O veiculo ja pode ser entregue \n Dejesa fazer-lo agora");
            if (v == 0) {
                return true;
            }
        } else if (hoje.isAfter(diatermino)) {
            int v = JOptionPane.showConfirmDialog(null, " A devolução do veiculo esta em atrasso \n Dejesa fazer-lo agora?");
            if (v == 0) {
                return true;
            }

        } else if (hoje.isBefore(diatermino)) {
            JOptionPane.showMessageDialog(null, "A devolução ainda na ta na hora");
            return false;
        }
        return false;
    }

    public AluguerOpercao() {
    }

    public void Acomulado(JLabel acomulado) {
        conexao con = new conexao();
        Connection co = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        co = con.getConnection();
        LocalDate hoje = LocalDate.now();
        String sql = "SELECT SUM(valor_aluguer)FROM aluger WHERE data_inicio LIKE  '" + hoje + "'";
        try {
            ps = co.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("Ok executandos" + sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                acomulado.setText(rs.getDouble("SUM(valor_aluguer)") + "");
            } else {
                JOptionPane.showMessageDialog(null, "Erro");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public double somar(double valor, double acrecent) {
        double total = valor + acrecent;
        return total;

    }
}
