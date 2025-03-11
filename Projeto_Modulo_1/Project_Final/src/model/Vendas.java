package model;

public class Vendas {

    private int idVenda;
    private String dataVenda;
    private Veiculos veiculoVendido;
    private Vendedor vendedor;
    private Cliente comprador;
    private Double valorVenda;


    public Vendas(int idVenda, String dataVenda, Veiculos veiculoVendido, Vendedor vendedor, Cliente comprador, Double valorVenda) {
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.veiculoVendido = veiculoVendido;
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.valorVenda = valorVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Veiculos getVeiculoVendido() {
        return veiculoVendido;
    }

    public void setVeiculoVendido(Veiculos veiculoVendido) {
        this.veiculoVendido = veiculoVendido;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int idVendaGenerate(int idVenda) {
        idVenda = (int)(Math.random() * 9000) + 1000;
        return idVenda;
    }  
}
