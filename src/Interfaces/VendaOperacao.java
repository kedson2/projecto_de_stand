package Interfaces;

import Classes.Venda;
import funcao.dao;

public class VendaOperacao implements Opercao<Venda> {

    
    @Override
    public void Cadastra(Venda venda) {
        
       String sql = "Insert into venda(id_cliente, id_automovel, valor_venda,tipo_pagamento,descontos ) "
                + "value('" + venda.getId_Cliente() + "','" + venda.getId_Automovel() + "','" + venda.getValor() + "','" + venda.getTipo_pagamento()+ "','" + venda.getDescontos()+ "')";
        dao x = new dao();
        x.Insert(sql);
       
    }
    public void salvardb(Venda venda){
        
    }

    @Override
    public void Alterar(Venda objeto) {

    }

    @Override
    public void Excluir(String f) {

    }
    public double Descontos(double preco,double desc){
         desc=desc/100;
        double resultado=preco*desc;
        return preco-resultado;
         
    }


   
}
