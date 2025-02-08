package Modulo_1;
	import java.util.Scanner; 

public class Test_5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor em minutos: ");
		double minutos = scan.nextInt();
		
		double horas = minutos / 60;
		
		System.out.println("O valor em Horas é: " + horas); 
		
	}
	
	
}
