 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author kedson dos Anjos
 */
public class usuario  {
    private String nome;
    private String senha;
    private String confirmarsenha;
    private int id_funcionario;
    private int id_user;

    public usuario() {
    }

    public usuario(String nome, String senha, String confirmarsenha, int id_funcionario, int id_user) {
        this.nome = nome;
        this.senha = senha;
        this.confirmarsenha = confirmarsenha;
        this.id_funcionario = id_funcionario;
        this.id_user = id_user;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

 
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmarsenha() {
        return confirmarsenha;
    }

    public void setConfirmarsenha(String confirmarsenha) {
        this.confirmarsenha = confirmarsenha;
    }
    
    
}
