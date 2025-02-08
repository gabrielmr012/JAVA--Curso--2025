package Modulo_1;
import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
		System.out.println("Digite tres Valores: ");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		double result; 
		
		result = (a + b + c) / 3;
		
		System.out.println("A média desses valores é: " + result );
		
	
	}

}
