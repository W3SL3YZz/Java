/* 
 Exericio 6)
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (pi = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B
 */


import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Double PI = 3.14159, A, B, C;
		Double triangulo, circulo, trapezio, quadrado, retangulo;
		System.out.println("Insira o valor de A");
		A = sc.nextDouble();		
		
		System.out.println("Insira o valor de B");
		B = sc.nextDouble();
		
		System.out.println("Insira o valor de C");
		C= sc.nextDouble();
		
		triangulo = (A * C) / 2;
		
		circulo = (C * C) * PI;
		
		trapezio = (A + B) / 2.0 * C;
		
		quadrado = B * B;
		
		retangulo = A * B;
		
		System.out.println();
		System.out.printf("A área do triangulo é: %.3f%n", triangulo);
		System.out.printf("A área do circulo é: %.3f%n", circulo);
		System.out.printf("A área do tranpézio é: %.3f%n", trapezio);
		System.out.printf("A área do quadrado é: %.3f%n", quadrado);
		System.out.printf("A área do retangulo é: %.3f%n", retangulo);
		
		sc.close();
	}

}
