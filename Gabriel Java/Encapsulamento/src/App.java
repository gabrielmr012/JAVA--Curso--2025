import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Conta c = new Conta();
        App a = new App();
        int opcao;

        System.out.println("---------Conta Bancária---------");
        System.out.println("Informe o Número da sua conta: ");

        c.contaverificar();

        System.out.println("Selecione uma Opção: ");
        System.out.println("[1] - Ver Saldo");
        System.out.println("[2] - Novo Deposito");
        System.out.println("[3] - Pagar Conta");
        
        opcao = scan.nextInt();

        if (opcao == 1) {
            System.out.println(c.getSaldo());    
        }
        else if (opcao == 2) {
            c.novodeposito(opcao, opcao);
        }
        else if (opcao == 3) {
            c.pagarconta(0, 0, 0);
        }

    }

}
