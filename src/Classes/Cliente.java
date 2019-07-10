package Classes;



public class Cliente extends Pessoa {
    private int id_cliente;

   

    public Cliente(int id_cliente, String nome, String sexo, String nacionalidade, String tipo_documento, String numero_documento, String morada, String distrito, int contacto) {
        super(nome, sexo, nacionalidade, tipo_documento, numero_documento, morada, distrito, contacto);
        this.id_cliente = id_cliente;
    }


      
    public Cliente() {
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    

  
}
