package Modulo_1;
import java.util.Scanner;
public class Test_Media {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Seja Bem-Vindo, Digite suas notas: ");
		System.out.print("1 - Bimestre: ");
		
			double b1 = scan.nextDouble();
		
		System.out.print ("2 - Bimestre: ");
		
			double b2 = scan.nextDouble();
		
		System.out.print("3 - Bimestre: ");
		
			double b3 = scan.nextDouble();
		
		System.out.print("4 - Bimestre: ");
		
			double b4 = scan.nextDouble();
		
			double media = (b1 + b2 + b3 + b4) / 4 ;
			
		if(media >= 7) {
			System.out.println("Parabéns, Você foi aprovado! Sua media é: " + media);
		} 
		else {
			System.out.println("Você não foi aprovado!");
		}
		
		
	}

}
