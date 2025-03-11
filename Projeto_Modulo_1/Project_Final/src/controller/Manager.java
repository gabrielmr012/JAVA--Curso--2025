package controller;

import java.util.Random;
import java.util.Scanner;
import model.*;
import utils.Texts;

public class Manager {
    Scanner scan = new Scanner(System.in);

    public Cliente novoCliente() {
        System.out.println("Informe os dados do cliente: ");
        System.out.println("Nome: ");
        String nome = scan.nextLine();
        System.out.println("\nCPF: ");
        String cpf = scan.nextLine();
        System.out.println("\nTelefone: ");
        String telefone = scan.nextLine();
        System.out.println("\nEndereço: ");
        String endereco = scan.nextLine();
        Cliente novoCliente = new Cliente(nome, cpf, telefone, endereco);
        Loja.clientes.add(novoCliente);
        return novoCliente;
    }

    public void listarClientes() {
        System.out.println("Informe o CPF do cliente: ");
        scan.nextLine();
        String cpf = scan.nextLine();
        for (Cliente cliente : Loja.clientes) {
            if (cpf.equals(cliente.getCpf())) {// .equals para realizar comparação de strings, pois cpf é um tipo de
                                               // string, e não funciona com ==
                System.out.println("");
                System.out.println(cliente);
            }
        }
    }

    public Veiculos cadastrarVeiculo() {
        System.out.println("Informe os dados do Veículo:");
        scan.nextLine();
        System.out.println("Marca: ");
        String marca = scan.nextLine();
        System.out.println("\nModelo: ");
        String modelo = scan.nextLine();
        System.out.println("\nAno: ");
        String telefone = scan.nextLine();
        String placa = gerarPlaca();
        System.out.println("\nPlaca: " + placa);
        System.out.println("\nPreço: ");
        double preco = scan.nextDouble();
        Veiculos veiculos = new Veiculos(marca, modelo, telefone, placa, preco);
        Loja.veiculos.add(veiculos);
        System.out.println("Veículo cadastrado com Sucesso!");
        return veiculos;
    }

    public void listarVeiculosPorPlaca() {
        System.out.println("Informe a placa do veículo: ");
        scan.nextLine();
        String placa = scan.nextLine();
        for (Veiculos veiculos : Loja.veiculos) {
            if (placa.equals(veiculos.getPlaca())) {// .equals para realizar comparação de strings, pois cpf é um tipo
                                                    // de string, e não funciona com ==
                System.out.println("");           //ver porque deu errado
                System.out.println(veiculos);
            }
        }
    }

    public void listarTodosVeiculos() {
        System.out.println("Lista de Veiculos: " + Loja.veiculos);

    }

    public String gerarPlaca() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWYXZ0123456789";
        Random r = new Random();
        StringBuilder codigo = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int index = r.nextInt(caracteres.length());
            codigo.append(caracteres.charAt(index));
        }
        return codigo.toString();
    }

    public void excluirVeiculo() {
        System.out.println("Informe a placa do veículo: ");
        scan.nextLine();
        String placa = scan.nextLine();
        boolean removido = Loja.veiculos.removeIf(veiculos -> veiculos.getPlaca().equalsIgnoreCase(placa));
        if (removido) {
            System.out.println("Veículo com a Placa: " + placa + " Foi Removido");
        }
    }

    public void alterarVeiculo() {
        System.out.println("Informe a placa do veículo: ");
        scan.nextLine();
        String placa = scan.nextLine();
        int opcao = 0;
        String menuAlterarDados = """
                [1] - Alterar Marca
                [2] - Alterar Modelo
                [3] - Alterar Ano
                [4] - Alterar Valor
                [5] - Sair
                """;

        for (Veiculos veiculo : Loja.veiculos) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                while (opcao <= 4) {
                    System.out.println(menuAlterarDados);
                    opcao = scan.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("Informe a nova Marca: ");
                            scan.nextLine();
                            String marca = scan.nextLine();
                            veiculo.setMarca(marca);
                            break;

                        case 2: 
                            System.out.println("Informe o Novo Modelo: ");
                            scan.nextLine();
                            String modelo = scan.nextLine();
                            veiculo.setModelo(modelo);
                            break;

                        case 3: 
                            System.out.println("Informe o Ano: ");
                            scan.nextLine();
                            String ano = scan.nextLine();
                            veiculo.setAno(ano);
                            break;
                        
                        case 4: 
                            System.out.println("Informe o novo Valor: ");
                            scan.nextLine();
                            double preco = scan.nextInt();
                            veiculo.setPreco(preco);
                            break;

                        case 5: 
                            break;
                    }

                }
            }
        }
    }


    public Vendedor novoVendedor() {
        System.out.println("Informe os dados do Vendedor: ");
        System.out.println("Nome: ");
        String nome = scan.nextLine();
        System.out.println("\nCPF: ");
        String cpf = scan.nextLine();
        System.out.println("\nTelefone: ");
        String telefone = scan.nextLine();
        System.out.println("\nEndereço: ");
        String endereco = scan.nextLine();
        int id = gerarIDVendedor(0);
        System.out.println("\nID do Vendedor: " + id);
        System.out.println("\nSálario: ");
        int salario = scan.nextInt();
        Vendedor novoVendedor = new Vendedor(nome, cpf, telefone, endereco, id, salario);
        Loja.vendedores.add(novoVendedor);
        return novoVendedor;
    }

    public int gerarIDVendedor(int idVendedor) {
        idVendedor = (int) (Math.random() * 9000) + 1000;
        return idVendedor;
    }

    public void listarVendedor() {
        System.out.println("Informe o ID do Vendedor: ");
        scan.nextLine();
        int id = scan.nextInt();
        for (Vendedor vendedor : Loja.vendedores) {
            if (id == vendedor.getIdVendedor()) {
                System.out.println("");
                System.out.println(vendedor);
            }
        }
    }

    public void excluirVendedor() {
        System.out.println("Informe o ID do Vendedor: ");
        scan.nextLine();
        int id = scan.nextInt();
        boolean removido = Loja.vendedores.removeIf(vendedores -> vendedores.getIdVendedor() == id);
        if (removido) {
            System.out.println("Vendedor com o: " + id + " Foi Removido");
        }
    }

    public void listarVendedores() {
        System.out.println("Lista de Veiculos: " + Loja.vendedores);

    }

    

}
