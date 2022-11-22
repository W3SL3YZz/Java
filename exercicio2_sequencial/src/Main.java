/* Exercicio 2) 
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159  
*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Seja bem vindo ao meu sistema de cálculo de área!");
		Double A, R;
		Double PI = 3.14159;

		System.out.println("Insira o valor do raio: ");
		R = sc.nextDouble();
		
		A = PI * (R * R); 
		
		System.out.printf("A área do raio digitado é = %.4f%n", A);
		
		sc.close();
	}

}
