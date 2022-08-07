import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int totalAlunos;
		
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de alunos:  ");
		totalAlunos = leitor.nextInt();
		
		char desejaContinuar = 'S';
		
		while(totalAlunos > 0) {
			
			while(desejaContinuar == 'S' || desejaContinuar == 's' ) {
				System.out.println("Informe o número: ");
				int numero = leitor.nextInt();
				
				if(numero == 0 ) {
					System.out.println("O número é zero!");
				} else {
					if (numero > 0) {
						System.out.println("O número é maior que zero!");
					} else {
						System.out.println("O número é menor que zero!");
					}
				}
				
				System.out.println("Deseja continuar? S - Sim / N - Não");
				desejaContinuar = leitor.next().charAt(0); // charAt pega a primeira letra da palavra digitada
				
				if(desejaContinuar == 'N' || desejaContinuar == 'n') {
					System.out.println("Obrigado por utilizar nosso Software!");
				}
				
			}
			
		}
		
		leitor.close();
		
}
}
