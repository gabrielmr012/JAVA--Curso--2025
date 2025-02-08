import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        desconto d = new desconto();

        System.out.println("Informe o valor do Produto;");   
        d.calculo_desconto(0, 0, 0);

    }
}
