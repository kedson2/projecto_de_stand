package Classes;

import funcao.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kedson dos Anjos
 */
public class Automovel {

    private String ano;
    private String cor;
    private String matricula;
    private String numero_de_assento;
    private boolean estado;
    private String modelo;
    private String marca;
    private String fornecedor;
    private int id_Automovel;
    private String combustivel;
    private float preco;
    private String categoria_servico;

    public Automovel() {

    }

    

    public Automovel(String ano, String categoria_servico, String cor, String matricula, String numero_de_assento, boolean estado, String modelo, String marca, String fornecedor, int id_Automovel, String combustivel, float preco) {
        this.ano = ano;
        this.cor = cor;
        this.matricula = matricula;
        this.numero_de_assento = numero_de_assento;
        this.estado = estado;
        this.modelo = modelo;
        this.marca = marca;
        this.fornecedor = fornecedor;
        this.id_Automovel = id_Automovel;
        this.combustivel = combustivel;
        this.preco = preco;
        this.categoria_servico = categoria_servico;
    }

    public String getCategoria_servico() {
        return categoria_servico;
    }

    public void setCategoria_servico(String categoria_servico) {
        this.categoria_servico = categoria_servico;
    }

    public float getValor() {
        return preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNumero_de_assento() {
        return numero_de_assento;
    }

    public void setNumero_de_assento(String numero_de_assento) {
        this.numero_de_assento = numero_de_assento;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getId_Automovel() {
        return id_Automovel;
    }

    public void setId_Automovel(int id_Automovel) {
        this.id_Automovel = id_Automovel;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }


}
