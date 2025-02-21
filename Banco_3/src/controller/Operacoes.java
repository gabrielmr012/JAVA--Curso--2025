package controller;

import java.util.Scanner;
import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Operacoes {
    Scanner scan = new Scanner(System.in);

    public Cliente criarCliente() {
        System.out.println("Nome do Titular: ");
        String nome = scan.nextLine();
        System.out.println("Cpf: ");
        String cpf = scan.nextLine();
        Cliente cliente = new Cliente(nome, cpf, null, null);
        Banco.listaClientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
        return cliente;
    }

    public int gerarNumConta(int numconta){
        numconta = (int)(Math.random() * 9000) + 1000;
        return numconta;
    }

    public ContaCorrente criarContaCorrente(){
        String nome = Banco.listaClientes.get(0).getNome();
        int numconta = gerarNumConta(0);
        double saldo = 0.0;
        ContaCorrente contaCorrente = new ContaCorrente(nome, numconta, saldo);
        Banco.listaContaCorrente.add(contaCorrente);
        return null;
    }

    public ContaPoupanca criarContaPoupanca(){
        return null;
    }

    public double depositar(){
        return 0.0;
    }

    public double sacar(){
        return 0.0;
    }

    public double transferir(){
        return 0.0;
    }

    public double consultarSaldo(){
        return 0.0;
    }

}
