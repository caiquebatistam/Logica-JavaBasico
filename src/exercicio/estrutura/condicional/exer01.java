package exercicio.estrutura.condicional;

import java.util.Scanner;

// Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.

public class exer01 {

	public static void main(String[] args) {

		int x;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDigite um n�mero : ");
		x = scan.nextInt();
		
		if(x < 0 ) {
			System.out.println("Este n�mero � negativo");
		}
		else {
			System.out.println("Este n�mero � positivo");
		}
			
		
	}

}
