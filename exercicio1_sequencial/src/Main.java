/* Exercicio 1)
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos. 
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int primeiroValor, segundoValor, total;
		
		System.out.println("Seja bem vindo ao meu sistema de cálculo!");
		System.out.println("Digite o primeiro valor para começar: ");
		primeiroValor = sc.nextInt();
		System.out.println("Perfeito! Agora que você digitou o primeiro valor, digite o segundo: ");
		segundoValor = sc.nextInt();
		
		total = segundoValor + primeiroValor;
		
		System.out.println("O primeiro valor digitado foi: " + primeiroValor);
		System.out.println("O segundo valor digitado foi: " + segundoValor);
		System.out.println("A soma de " + primeiroValor + " com " + segundoValor + " é: " + total);
		sc.close();

	}

}
