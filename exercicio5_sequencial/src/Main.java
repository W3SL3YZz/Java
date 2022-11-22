/* Exercicio 5)
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1, qtPeca1, peca2, qtPeca2;
		Double valorPeca1, valorPeca2, ttPeca1, ttPeca2, totalPagar;
		
		System.out.println("Seja bem vindo ao meu sistema de compra de peças!");
		System.out.println("Informe o código da primeira peça: ");
		peca1 = sc.nextInt();
		
		System.out.println("Informe a quantidade de peças que você deseja comprar: ");
		qtPeca1 = sc.nextInt();
		
		System.out.println("Informe o valor unitário da peça " + peca1);
		valorPeca1 = sc.nextDouble();
		
		System.out.println("Informe o código da segunda peça: ");
		peca2 = sc.nextInt();
		
		System.out.println("Informe a quantidade de peças que você deseja comprar: ");
		qtPeca2= sc.nextInt();
		
		System.out.println("Informe o valor unitário da peça " + peca2);
		valorPeca2 = sc.nextDouble();
		
		ttPeca1 = (Double) (qtPeca1 * valorPeca1);
		ttPeca2 = (Double) (qtPeca2 * valorPeca2);
		
		totalPagar = ttPeca1 + ttPeca2;
		
		System.out.printf("O valor total a pagar será de: R$ %.2f%n", totalPagar);
		
		sc.close();
	}

}
