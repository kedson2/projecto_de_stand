package Interfaces;

import Classes.Cliente;

import funcao.dao;
import javax.swing.JOptionPane;


public class ClienteOperacao implements Opercao<Cliente> {

    @Override
    public void Cadastra(Cliente cliente) {

        String sql = "Insert into cliente( nome, sexo, contacto, numero_documento, nacionalidade,  tipo_documento,  morada, distrito) "
                + "value('" + cliente.getNome() + "','" + cliente.getSexo() + "','" + cliente.getContacto() + "','" + cliente.getNumero_documento() + "',"
                + "'" + cliente.getNacionalidade() + "','" + cliente.getTipo_documento() + "','" + cliente.getMorada() + "','" + cliente.getDistrito() + "')";
        dao x = new dao();
        x.Insert(sql);

    }

   


    @Override
    public void Excluir(String excluir) {
        dao x = new dao();
        x.excluir(excluir);
        

    }

    @Override
    public void Alterar(Cliente cliente) {
        
       String editar="UPDATE cliente SET  nome ='"+cliente.getNome()+"' , sexo = '"+cliente.getSexo()+"',contacto= '"+cliente.getContacto()+"',distrito='"+cliente.getDistrito()+"',morada='"+cliente.getMorada()+"',tipo_documento='"+cliente.getTipo_documento()+"',numero_documento='"+cliente.getNumero_documento()+"',nacionalidade ='"+cliente.getNacionalidade()+"'WHERE `cliente`.`id_cliente`= '"+cliente.getId_cliente()+"' ";
               
        dao x=new dao();
       x.Editar(editar);
        JOptionPane.showMessageDialog(null, " Alterado Cliente com sucesso"); 
        
    }

}
