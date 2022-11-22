/* Exercicio 4)
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais 
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, hhTrab;
		Double salario, valorHH;
		
		System.out.println("Seja bem vindo ao meu programa de cálculo salarial! ");
		
		System.out.println("Informe o código do funcionário que você deseja cálcular o salário: ");
		codigo = sc.nextInt();		
		
		System.out.println("Informe o número de horas que o funcionário " + codigo + " trabalhou: ");
		hhTrab = sc.nextInt();
		
		System.out.println("Informe o valor da hora trabalhada: ");
		valorHH = sc.nextDouble();
		
		// Calculando valor do salario com base no valor da hora e nas horas trabalhadas.
		salario = hhTrab * valorHH;
		
		
		System.out.println("Código do funcionário: " + codigo);
		System.out.printf("Salário: U$ %.2f%n ", salario);
		
		sc.close();
		
	}

}
