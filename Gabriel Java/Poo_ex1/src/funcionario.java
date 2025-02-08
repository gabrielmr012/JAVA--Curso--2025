import java.util.Scanner;
public class funcionario {
    Scanner scan = new Scanner(System.in);
        
        String nome;
        String cargo;
        double salario;
    
    public void cadastro_funcionario(){
        System.out.println("informe seu nome completo: ");
            this.nome = scan.nextLine();
        System.out.println("Informe seu cargo: ");
            this.cargo = scan.nextLine();
        System.out.println("Informe seu salário: ");
            this.salario = scan.nextDouble();
    }

    public double aumento(){
            return salario * 0.15;
        }

}
