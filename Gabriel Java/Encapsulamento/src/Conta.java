import java.util.Scanner;

public class Conta {
    Scanner scan = new Scanner(System.in);

    private String contanum = "098844";
    private double saldo = 45000.00;
    private String titular = "Lucas";

    public String getContanum() {
        return contanum;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void contaverificar() {
        contanum = scan.nextLine();
        if (contanum.equals("098844")) {
            System.out.println("Seja Bem-vindo " + titular);
        }

        else {
            System.out.println("Sua conta não foi encontrada");
        }
    }

    public void novodeposito(double valordeposito, double novosaldo) {
            System.out.println("Quanto deseja depositar?");
            valordeposito = scan.nextDouble();
            novosaldo = saldo + valordeposito;
            System.out.println("Seu saldo atual: " + novosaldo);
    }

    public void pagarconta(double valor, double numconta, double novosaldo){
        System.out.println("Digite o número da conta: ");
        numconta = scan.nextDouble();
        System.out.println("Digite o valor a ser pago: ");
        valor = scan.nextDouble();
            if (valor > saldo) {
                System.out.println("Saldo insulficiente!");
            }
            else{
                novosaldo = saldo - valor;
                System.out.println("Sua conta foi paga, seu saldo atual: " + novosaldo);
            }
    }

}
