package Modulo_1;
import java.util.Scanner;

public class Test_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor1 = scan.nextInt();
		
		int sucessor = valor1 + 1;
		int antecessor = valor1 - 1;
		
		System.out.println("O sucessor de 3 é: " + sucessor);
		System.out.println("O antecessor de 3 é: " + antecessor);
	
	}
}
