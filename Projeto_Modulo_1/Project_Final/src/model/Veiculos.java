package model;

public class Veiculos {

    private String marca;
    private String modelo;
    private String ano;
    private String placa;
    private double preco;

    public Veiculos(String marca, String modelo, String ano, String placa, Double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.preco = preco;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\n---------- Lista de Veículos ----------" + 
        "\nMarca: " + marca + "\nModelo: " + modelo + "\nPlaca: " + placa + "\nPreço: " + preco +
        "\n----------------------------";
    }
}
