package Interfaces;

import Classes.Automovel;
import funcao.dao;
import javax.swing.JOptionPane;

public class AutomovelOperacao implements Opercao<Automovel> {

    @Override
    public void Cadastra(Automovel veiculo) {
        String sql = "Insert into automovel( modelo,marca,matricula,fornecedor,combustivel,numero_de_assento,ano,cor, preco,categoria_servico, estado)"
                + " value ('" + veiculo.getModelo() + "','" + veiculo.getMarca() + "','" + veiculo.getMatricula() + "','" + veiculo.getFornecedor() + "','" + veiculo.getCombustivel() + "','" + veiculo.getNumero_de_assento() + "','" + veiculo.getAno() + "','" + veiculo.getCor() + "','" + veiculo.getPreco() + "','" + veiculo.getCategoria_servico() + "',1)";

        dao x = new dao();
        x.Insert(sql);
    }

    @Override
    public void Excluir(String excluir) {

        dao x = new dao();
        x.excluir(excluir);

    }

    @Override
    public void Alterar(Automovel au) {
        String editar = "UPDATE automovel SET  modelo ='" + au.getModelo() + "',marca = '" + au.getMarca() + "',cor= '" + au.getCor() + "',fornecedor='" + au.getFornecedor() + "'"
                + ",numero_de_assento ='" + au.getNumero_de_assento() + "',combustivel='" + au.getCombustivel() + "',ano ='" + au.getAno() + "',categoria_servico ='" + au.getCategoria_servico() + "' "
                + " , preco ='" + au.getPreco() + "'WHERE  `automovel`.`id_automovel` = " + au.getId_Automovel() + " ";

        dao x = new dao();
        x.Editar(editar);
         JOptionPane.showMessageDialog(null, " Alterado  automovel com sucesso");
    }

    public void Alterar(int s, boolean is) {

        if (is == true) {
            String g = "UPDATE `automovel` SET `estado` = '0' WHERE `automovel`.`id_automovel` = " + s + "";
            dao x = new dao();
            System.out.println(g);
            x.Editar(g);
        } else if (is == false) {
            String sql = "UPDATE `automovel` SET `estado` = '1' WHERE `automovel`.`id_automovel` = " + s + "";
            dao x = new dao();
            x.Editar(sql);
        }
    }
}
