import java.util.Scanner;
public class retangulo {
    Scanner scan = new Scanner(System.in);
    double h;
    double l;

    public void valores(){
        System.out.println("informe a Altura do Retangulo: ");
            this.h = scan.nextDouble();
        System.out.println("Informe a Largura do Retangulo: ");
            this.l = scan.nextDouble();
    }

    public double area(){
        return h * l;
    }

    public double perimetro(){
        return (h*2) + (l*2);
    }
}