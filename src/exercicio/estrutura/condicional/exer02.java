package exercicio.estrutura.condicional;

// Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar

import java.util.Scanner;

public class exer02 {

	public static void main(String[] args) {

		int x;
		
		System.out.println("Digite um n�mero : ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		
		if ( x % 2 == 0) {
			
			System.out.println("Este n�mero � par");
		}else {
			System.out.println("Este n�mero � impar");
		}
	
	
	}

}
