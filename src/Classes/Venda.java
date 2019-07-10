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
public class Venda  {
    private int  id_venda;
    private String tipo_pagamento;
    private int id_Cliente;
    private int id_Automovel;
    private double valor;
    private String data;
    private String descontos;

    public Venda(int id_venda, String tipo_pagamento, int id_Cliente, int id_Automovel, double valor , String data,String descontos) {
        this.id_venda = id_venda;
        this.tipo_pagamento = tipo_pagamento;
        this.id_Cliente = id_Cliente;
        this.id_Automovel = id_Automovel;
        this.valor = valor;
        this.data = data;
        this.descontos=descontos;
    }

    public Venda() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescontos() {
        return descontos;
    }

    public void setDescontos(String descontos) {
        this.descontos = descontos;
    }

   

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public String getTipo_pagamento() {
        return tipo_pagamento;
    }

    public void setTipo_pagamento(String tipo_pagamento) {
        this.tipo_pagamento = tipo_pagamento;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public int getId_Automovel() {
        return id_Automovel;
    }

    public void setId_Automovel(int id_Automovel) {
        this.id_Automovel = id_Automovel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    

    
 

}
