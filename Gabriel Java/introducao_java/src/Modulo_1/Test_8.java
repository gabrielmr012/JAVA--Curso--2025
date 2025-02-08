package Modulo_1;
import java.util.Scanner;

public class Test_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Digite um valor: ");
//		
//		double a = scan.nextDouble();
//		
//		double dobro = a * 2;
//		double terca = a / 3; 
//		
//		System.out.println("O dobro do valor é: " + dobro);
//		System.out.println("A terça parte é: " + terca);
		
//-------------------------------------------------------------------------
		
//		System.out.println("Digite uma distância em M: ");
//		
//		double distancia = scan.nextDouble();
//		double km = distancia / 1000;
//		double hm = distancia / 100;
//		double dam = distancia / 10;
//		double dm = distancia * 10;
//		double cm = distancia * 100;
//		double mm = distancia * 1000;
//		
//		System.out.println("Distância em km: " + km);
//		System.out.println("Distância em Hm: " + hm);
//		System.out.println("Distância em Dam: " + dam);
//		System.out.println("Distância em dm: " + dm);
//		System.out.println("Distância em cm: " + cm);
//		System.out.println("Distância em mm: " + mm);

//-----------------------------------------------------------------------------
		
//		System.out.println("Quantos Reais Você tem? ");
//		double reais = scan.nextDouble();
//		double dolar = reais / 3.75;
//		
//		System.out.printf("Você pode comprar: $: %.2f", dolar); 
//	
		
//-----------------------------------------------------------------------------
		
//		System.out.println("Digite as dimensões da parede: ");
//		
//		double h = scan.nextDouble();
//		double l = scan.nextDouble();
//		double a = h * l; 
//		
//		System.out.println("A área da parede em m2 é: " + a);
//		
//		double litros = a * 2;
//		
//		System.out.printf("Você precisará de %.2f litros.\n", litros);
//		
//		

//-----------------------------------------------------------------------------
		
//		System.out.println("Digite 3 valores para encontrarmos o Delta: ");
//		
//		double a = scan.nextDouble();
//		double b = scan.nextDouble();
//		double c = scan.nextDouble();
//		double delta; 
//		
//		delta = Math.pow(b, 2) - (4 * a * c);
//		
//		System.out.println("O valor de Delta é: " + delta);
		
		

//		System.out.println("Você tem 5% de desconto," + " Digite o valor do produto: ");
//		double produto = scan.nextDouble();
//		System.out.println("Valor do Produto: " + produto);
//		double desconto = produto * 0.5;
//		double valdesconto = produto - desconto;
//		System.out.println("O valor com 5% de Desconto é: " + valdesconto);


//		System.out.println("Digite seu salário: ");
//		double salario = scan.nextDouble();
//		double aumento = salario + (salario * 0.15);
//		
//		System.out.println("Seu aumento é: " + aumento);
		
		
		
//		System.out.println("Digite o valor de KM pecorridos: ");
//		double km = scan.nextDouble();
//		System.out.println("Digite o valor de Dias: ");
//		double dias = scan.nextDouble();
//		
//		double valor = (dias * 90) + (0.20 * km);
//		
//		System.out.println("O valor a ser pago: " + valor);
		
		
//		System.out.println("Informe quantos dias você trabalhou: ");
//			double dias = scan.nextDouble();
//		System.out.println("Valor do salário: " + ((dias * 8) * 25));
		
		// System.out.println("Digite a quantidade de cigarros por dia: ");
		// 	double cigarroDia = scan.nextDouble();
		// System.out.println("Informe a quantos anos você fuma: ");
		// 	double cigarroAno = scan.nextDouble();
		
			
		// 	double cigarroTotal = (cigarroDia * cigarroAno * 365) ;
		// System.out.println("Total de cigarros fumados nesse período de tempo: " + cigarroTotal);
			
		// 	double tempoperdido = cigarroTotal * 0.00694;
			
		// System.out.printf("Pelas estimativas foram perdidos %.2f dias.\n", tempoperdido);
		
		// System.out.println("informe a velocidade do Carro: ");
		// 	double velocidade = scan.nextDouble();
		// 	double multa;		
		// if(velocidade > 80){
		// 	System.out.println("Você foi multado por excesso de velocidade");
		// 	multa = velocidade * 5;
		// 	System.out.println("Você deve: " + multa );
		// }
		
		// System.out.println("Informe sua data de nascimento: ");
		// 	int dataN = scan.nextInt();
		// 	int anoatual = 2025;
		// if ((anoatual - dataN) > 16) {
		// 	System.out.println("Você pode votar!");
		// }
		// else{
		// 	System.out.print("Você não pode votar ainda!");
		// }

		// System.out.println("Informe seu Nome: ");
		// 	String nome = scan.nextLine();
		// System.out.println("Informe suas notas: ");
		// 	double nota1 = scan.nextDouble();
		// 	double nota2 = scan.nextDouble();
		// 	double media = (nota1 + nota2) / 2;
		
		// if (media >= 7) {
		// 	System.out.println("Parabens" + nome + ", você foi aprovado!");
		// 	System.out.println("Sua média foi: " + media);
		// }
		// else{
		// 	System.out.print("Infelizmente você não obteve o resultado esperado, sua media foi: " + media);
		// }
		while (true) {
			
		System.out.println("------------MENU------------");
		System.out.println("Selecione uma Opção: ");
		System.out.println("Opção (1)");
		System.out.println("Opção (2)");
		System.out.println("Opção (3)");
		System.out.println("Opção (4)");

		int opcao = scan.nextInt();
		
		
			if (opcao == 1) {
				System.out.println("Você escolheu a opção 1");
					System.out.println("Escolha um numero de 1 até 10");
						int val1 = scan.nextInt();
							if (val1 % 2 != 0) {
								System.out.println("Esse valor é Impar");
						}
						else{
							System.out.println("Esse valor é Par");
						}
			}
			else if (opcao == 2 ) {
				System.out.println("Você escolheu a opção 2");
			}
			else if (opcao == 3){
				System.out.println("Você escolheu a opção 3");
			}
			else{
				opcao = 4;
				System.out.println("Você saiu");
				break;
			}


			
		}

	}
}
