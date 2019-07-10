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
public class Aluger {

    private int id_aluger;
    private int id_cliente;
    private int id_Automovel;
    private int id_tipo_de_pagamento;
    private double valor;
    private String data_de_entrega;
    private String data_de_saida;
    private String hora_de_entrega;
    private String hora_de_saida;
    private double Valor_de_seguro;
    private double valor_final;
    private String veiculo;

    public Aluger() {

    }

    public Aluger(int id_aluger,String veiculo, int id_cliente, double valor_final, int id_Automovel, int id_tipo_de_pagamento, double valor, String data_de_entrega, String data_de_saida, String hora_de_entrega, String hora_de_saida, double Valor_de_seguro) {
        this.id_aluger = id_aluger;
        this.id_cliente = id_cliente;
        this.id_Automovel = id_Automovel;
        this.id_tipo_de_pagamento = id_tipo_de_pagamento;
        this.valor = valor;
        this.data_de_entrega = data_de_entrega;
        this.data_de_saida = data_de_saida;
        this.hora_de_entrega = hora_de_entrega;
        this.hora_de_saida = hora_de_saida;
        this.Valor_de_seguro = Valor_de_seguro;
        this.valor_final = valor_final;
        this.veiculo=veiculo;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public double getValor_final() {
        return valor_final;
    }

    public void setValor_final(double valor_final) {
        this.valor_final = valor_final;
    }

    public int getId_aluger() {
        return id_aluger;
    }

    public void setId_aluger(int id_aluger) {
        this.id_aluger = id_aluger;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_Automovel() {
        return id_Automovel;
    }

    public void setId_Automovel(int id_Automovel) {
        this.id_Automovel = id_Automovel;
    }

    public int getId_tipo_de_pagamento() {
        return id_tipo_de_pagamento;
    }

    public void setId_tipo_de_pagamento(int id_tipo_de_pagamento) {
        this.id_tipo_de_pagamento = id_tipo_de_pagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData_de_entrega() {
        return data_de_entrega;
    }

    public void setData_de_entrega(String data_de_entrega) {
        this.data_de_entrega = data_de_entrega;
    }

    public String getData_de_saida() {
        return data_de_saida;
    }

    public void setData_de_saida(String data_de_saida) {
        this.data_de_saida = data_de_saida;
    }

    public String getHora_de_entrega() {
        return hora_de_entrega;
    }

    public void setHora_de_entrega(String hora_de_entrega) {
        this.hora_de_entrega = hora_de_entrega;
    }

    public String getHora_de_saida() {
        return hora_de_saida;
    }

    public void setHora_de_saida(String hora_de_saida) {
        this.hora_de_saida = hora_de_saida;
    }

    public double getValor_de_seguro() {
        return Valor_de_seguro;
    }

    public void setValor_de_seguro(double Valor_de_seguro) {
        this.Valor_de_seguro = Valor_de_seguro;
    }

}
