package exercicio.estrutura.condicional;

// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

import java.util.Scanner;

public class exer02 {

	public static void main(String[] args) {

		int x;
		
		System.out.println("Digite um número : ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		
		if ( x % 2 == 0) {
			
			System.out.println("Este número é par");
		}else {
			System.out.println("Este número é impar");
		}
	
	
	}

}
