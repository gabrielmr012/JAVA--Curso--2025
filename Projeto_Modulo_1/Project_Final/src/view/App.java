package view;

import java.util.Scanner;

import controller.Manager;
import model.Loja;
import utils.Texts;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Texts text = new Texts();
        Manager manager = new Manager();
        // ----- OBJETOS -----
        int opcao = 0;
        // ----- VARIÁVEIS -----

        while (true) {
            System.out.println(text.menuPrincipal());
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(text.menuFrenteDeLoja());
                    opcao = scan.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println(text.menuGerenciarVeiculos());
                            scan.nextLine();
                            opcao = scan.nextInt();
                            switch (opcao) {
                                case 1:
                                    manager.listarVeiculosPorPlaca();
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println(text.menuGerenciarLoja());
                                switch (opcao) {
                                    case 1:
                                        manager.listarTodosVeiculos();
                                        break;
                                    case 2:
                                        manager.listarVendedores();
                                        break;
                                    default:
                                        break;
                                }
                            break;
                        case 3:
                            System.out.println(text.menuGerenciarVendedor());
                            manager.listarVendedor();
                            break;
                        case 4:
                            System.out.println(text.menuGerenciarCliente());
                            opcao = scan.nextInt();
                                switch (opcao) {
                                    case 1:
                                        manager.listarClientes();
                                        break;
                                    default:
                                        break;
                                }
                            break;
                        case 5:
                            System.out.println(text.menuGerenciarVendas());
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println(text.menuAdministracaoCadastro());//menu administração----
                    opcao = scan.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println(text.menuGerenciarVeiculosAdmin());
                            opcao = scan.nextInt();
                                switch (opcao) {
                                    case 1:
                                        manager.cadastrarVeiculo();
                                        break;
                                    case 2: 
                                        manager.excluirVeiculo();
                                    case 3: 
                                        manager.alterarVeiculo();
                                    case 4: 
                                        manager.listarTodosVeiculos();
                                        break;
                                    default:
                                        break;
                                }
                            break;
                        case 2:
                            System.out.println(text.menuGerenciarLojaAdmin());
                            break;
                        case 3:
                            System.out.println(text.menuGerenciarVendedorAdmin());
                            scan.nextLine();
                            opcao = scan.nextInt();
                            switch (opcao) {
                                case 1:
                                    manager.novoVendedor();
                                    break;
                                case 2: 
                                    manager.excluirVendedor();
                                    break;
                                case 3: 
                                    //manager.alterarVendedor();
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 4:
                            System.out.println(text.menuGerenciarClienteAdmin());
                            opcao = scan.nextInt();
                            switch (opcao) {
                                case 1:
                                    manager.novoCliente();
                                    System.out.println("Cliente Cadastrado com Sucesso!");
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 5:
                            System.out.println(text.menuGerenciadorVendaAdmin());
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }

    }
}
