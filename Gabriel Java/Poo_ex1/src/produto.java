import java.util.Scanner;
public class produto {
    Scanner scan = new Scanner(System.in);
    String nome; 
    double preco;
    int quantidade;
    double total_estoque;

    public void catalogar(){
        System.out.println("Digite o Nome do Produto: ");
        this.nome = scan.nextLine();
        System.err.println("Digite o preço do produto: ");
        this.preco = scan.nextDouble();
        System.out.println("Digite a quantidade em estoque: ");
        this.quantidade = scan.nextInt();
    }

    public void valor_estoque(){
        this.total_estoque = preco * quantidade;
        System.out.println("Valor total de " + nome + " é de: " + total_estoque);
    }
}
