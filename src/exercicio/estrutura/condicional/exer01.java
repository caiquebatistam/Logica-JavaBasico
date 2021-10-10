package exercicio.estrutura.condicional;

import java.util.Scanner;

// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public class exer01 {

	public static void main(String[] args) {

		int x;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDigite um número : ");
		x = scan.nextInt();
		
		if(x < 0 ) {
			System.out.println("Este número é negativo");
		}
		else {
			System.out.println("Este número é positivo");
		}
			
		
	}

}
