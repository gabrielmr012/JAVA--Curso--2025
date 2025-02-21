package view;

import java.util.Scanner;

import controller.Banco;
import controller.Operacoes;
import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Operacoes operacoes = new Operacoes();
        String menu = """
                [1] - Cadastrar Cliente
                [2] - Cadastrar Conta Corrente
                [3] - Cadastrar Conta Poupança
                [4] - Depositar
                [5] - Sacar
                [6] - Transferir
                [7] - Consultar Saldo
                [8] - Sair
                """;
        int opcao = 0;
        while (true) {
            System.out.println(menu);
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    operacoes.criarCliente();//imprimir e conta correnta cliente de forma formatada e em String
                    Cliente cliente = Banco.listaClientes.get(0);
                    System.out.println(cliente);
                    break;
                case 2:
                    operacoes.criarContaCorrente();
                    ContaCorrente contaCorrente = Banco.listaContaCorrente.get(0);
                    System.out.println(contaCorrente);
                    break;
                case 3:
                    operacoes.criarContaPoupanca();
                    break;
                case 4:
                    operacoes.depositar();
                    break;
                case 5:
                    operacoes.sacar();
                    break;
                case 6:
                    operacoes.transferir();
                    break;
                case 7:
                    operacoes.consultarSaldo();
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        }

    }
}
