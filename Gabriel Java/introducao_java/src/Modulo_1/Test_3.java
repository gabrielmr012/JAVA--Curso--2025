package Modulo_1;
import java.util.Scanner;

public class Test_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		double valorproduto;
		double valorpago;
		double resultado;
		
		System.out.println("Digite o valor do Produto: " );
			
			valorproduto = scan.nextDouble();
		
			
		System.out.println("Digite o Valor a ser pago: " );
		
			valorpago = scan.nextDouble();
			
		System.out.println("Valor do Produto: $:" + valorproduto);
		System.out.println("Valor Pago: $:" + valorpago);
		
			if(valorpago >= valorproduto) {
				
				resultado = (valorpago - valorproduto) * 3.75; 
				
				System.out.println("Seu troco é : " + resultado);
				
			}
			
			else {
				
				System.out.println("O Valor é insuficiente, Tente novamente!");
			
			}
		
			
		
	}

}
