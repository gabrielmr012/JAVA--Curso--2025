package Modulo_1;
import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		int valorproduto = 1800;
		
		System.out.println("Valor do produto: " + valorproduto );
		System.out.println("Digite o valor depositado: ");
		int valorpago = scan.nextInt();
		double result = (valorproduto - valorpago) * -1;
		
		
		if(result >= 0) {
			
			System.out.println("Seu troco é: " + result);
		}
		
		else {
			System.out.println("Você Deve: " + result * -1);
		}
		
		
		

	}

}
