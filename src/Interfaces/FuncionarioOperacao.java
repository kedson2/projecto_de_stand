
package Interfaces;

import Classes.Funcionario;
import funcao.dao;
import javax.swing.JOptionPane;

/**
 *
 * @author HWILL
 */
public class FuncionarioOperacao implements Opercao<Funcionario>{

   

    @Override
    public void Cadastra(Funcionario func) {
     String sql= "Insert into funcionario(nome, sexo,data_nascimento,cargo,contacto,distrito,morada,tipo_documento,numero_documento,nacionalidade) "
                + "value('"+func.getNome()+"','"+func.getSexo()+"','"+func.getData_nascimento()+"','"+func.getCargo()+"',"
             + "'"+func.getContacto()+"','"+func.getDistrito()+"','"+func.getMorada()+"','"+func.getTipo_documento()+"','"+func.getNumero_documento()+"','"+func.getNacionalidade()+"')";
        
        dao x=new dao();
        x.Insert(sql);
    }

    @Override
    public void Alterar(Funcionario func) {
        String editar="UPDATE funcionario SET  nome ='"+func.getNome()+"' , sexo = '"+func.getSexo()+"',data_nascimento = '"+func.getData_nascimento()+"',cargo = '"+func.getCargo()+"',contacto= '"+func.getContacto()+"',distrito='"+func.getDistrito()+"',morada='"+func.getMorada()+"',tipo_documento='"+func.getTipo_documento()+"',numero_documento='"+func.getNumero_documento()+"',nacionalidade ='"+func.getNacionalidade()+"' WHERE `funcionario`.`id_funcionario` ='"+func.getId_funcionario()+"' ";
               
        dao x=new dao();
       x.Editar(editar);
        JOptionPane.showMessageDialog(null, " Alterado funcionario com exito ");
        
    }

     @Override
    public void Excluir(String f) {
           dao x=new dao();
          x.excluir(f);
    }
 
     public String sql_nome(int id_funcionario) {
        String nome="Select nome from funcionario";
        return nome;
        
    }
    
   
}
