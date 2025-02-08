import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Controle de Estoque");
        produto p = new produto();
        funcionario f = new funcionario();
        retangulo r = new retangulo();

        p.catalogar();
        p.valor_estoque();

        System.out.println("Funcionário");

        f.cadastro_funcionario();
        double aumento_salario = f.aumento();
        System.out.println("Você ganhou um aumento de: " + aumento_salario);
        
        System.out.println("informe a Altura e a Largura do Retangulo: ");
        r.valores();
        double area = r.area();
        double perimetro = r.perimetro();

        System.out.println("A área do retangulo é: " + area + " e o prerímetro é: " + perimetro);



    }
}
