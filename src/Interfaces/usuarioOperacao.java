/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.usuario;
import funcao.dao;
import javax.swing.JOptionPane;

/**
 *
 * @author kedson dos Anjos
 */
public class usuarioOperacao implements Opercao<usuario> {

    @Override
    public void Cadastra(usuario novo) {
      String sql = "INSERT into usuario(nome,senha,id_funcionario)"+
                " value ('"+novo.getNome()+"','"+novo.getSenha()+"','"+novo.getId_funcionario()+"')";
        dao u = new dao();
        u.Insert(sql);
    }

    @Override
    public void Alterar(usuario alterar) {
       String sql ="UPDATE `usuario` SET `nome` = '"+alterar.getNome()+"', `senha` = '"+alterar.getSenha()+"' WHERE `usuario`.`id_usuario` = "+alterar.getId_user()+"";
       dao u = new dao();
       u.Editar(sql); 
       JOptionPane.showMessageDialog(null, " Alterado com sucesso");
       
    }

    @Override
    public void Excluir( String excluir ){
        dao x = new dao();
        x.excluir(excluir);
    }
    
    
     public boolean valdar_usuario(String usuario,String senha){
         String validar= "select id_usuario as ID, nome, senha,  from usuario where nome ='" +usuario+ "'And senha ='" + senha+ "'";
         dao x = new dao();
        // x.Lista_SqlTexto(validar,txtusuario );
         
        if(usuario.equals(usuario)&& senha.equals(senha)){
            return true;
        }else{
            return false;
        }
    }  
     public boolean ConfSenha(String senha, String conf){
         if(senha.equals(conf)){
             return true;   
         }
         return false;
     }
     
}
