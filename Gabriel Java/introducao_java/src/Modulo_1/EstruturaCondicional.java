package Modulo_1;
import java.util.Scanner;
public class EstruturaCondicional {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor para saber se é par: ");
		
		double a = scan.nextDouble(); 
		
		if(a % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Ímpar");
		}
	}
	
	
}



//estudar melhor condições if, else e else if 
//switch case  