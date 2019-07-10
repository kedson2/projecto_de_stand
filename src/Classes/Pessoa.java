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
public abstract class Pessoa {
    protected String nome;
    protected String sexo;
    protected String nacionalidade;
    protected String tipo_documento;
    protected String numero_documento;
    protected String morada;
    protected String distrito;
    protected int contacto;
   
    public Pessoa() {
    }

    public Pessoa(String nome, String sexo, String nacionalidade, String tipo_documento, String numero_documento, String morada, String distrito, int contacto) {
        this.nome = nome;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.morada = morada;
        this.distrito = distrito;
        this.contacto = contacto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

//    @Override
//    public String toString() {
//        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", nacionalidade=" + nacionalidade + ", tipo_documento=" + tipo_documento + ", numero_documento=" + numero_documento + ", morada=" + morada + ", distrito=" + distrito + ", contacto=" + contacto + '}';
//    }


   
   
    
}



