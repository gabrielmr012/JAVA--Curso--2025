package Modulo_1;
import java.util.Scanner;
public class Test_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 3 números: ");
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double d;
		
		d = (a + b + c) * 3 % 5;
		
		System.out.println("Resultado: " + d);
		
		
		
		
	}

}
