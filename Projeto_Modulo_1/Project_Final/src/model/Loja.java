package model;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    
    //Definir os valores a baixo: 
    private String nome = "Velvet Autohaus";
    private String cnpj = "12.345.678/0001-90";
    private String endereco = " Av. Boa Viagem, 1234, Boa Viagem, Recife - PE, 51020-010";
    private String telefone = "(81) 3456-7890";
    
    public static List<Veiculos> veiculos = new ArrayList<Veiculos>();
    public static List<Vendedor> vendedores = new ArrayList<Vendedor>();
    public static List<Cliente> clientes = new ArrayList<Cliente>();
    public static List<Vendas> vendas = new ArrayList<Vendas>(); 
    
    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public static String dadosLoja(String nome, String cnpj, String endereco, String telefone) {
        return "Nome: " + nome + "\nCNPJ: " + cnpj + "\nEndereço: " + endereco + "\nTelefone: " + telefone;
    }

}
