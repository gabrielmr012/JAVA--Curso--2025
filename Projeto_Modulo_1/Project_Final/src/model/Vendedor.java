package model;

public class Vendedor extends Pessoa {

    private int idVendedor;
    private int salario;

    public Vendedor(String nome, String cpf, String telefone, String endereco, int idVendedor, int salario) {
        super(nome, cpf, telefone, endereco);
        this.idVendedor = idVendedor;
        this.salario = salario;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }
    
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    //Gera um id aleatório para o vendedor e retorna esse id
    public int idVendedorGenerate(int idVendedor) {
        idVendedor = (int)(Math.random() * 9000) + 1000;
        return idVendedor;
    }    

}
