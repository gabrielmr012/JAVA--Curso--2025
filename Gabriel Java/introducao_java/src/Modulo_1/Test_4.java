package Modulo_1;
	import java.util.Scanner;
public class Test_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois Valores: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int result = a * b;
		
		System.out.println("O valor da mutiplicação deles é: " + result);
		
	}
}
