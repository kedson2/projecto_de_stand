package Classes;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kedson dos Anjos
 */
public class Funcionario extends Pessoa {

    private  int id_funcionario;
    private String cargo;
  
    private String data_nascimento;
   

    public Funcionario() {
    }

   


    public Funcionario(int id_funcionario, String cargo, String email, String data_nascimento, String carteira_motorista, String nome, String sexo, String nacionalidade, String tipo_documento, String numero_documento, String morada, String distrito, int contacto) {
        super(nome, sexo, nacionalidade, tipo_documento, numero_documento, morada, distrito, contacto);
        this.id_funcionario = id_funcionario;
        this.cargo = cargo;
      
        this.data_nascimento = data_nascimento;
      
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

  

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

   
   

}
