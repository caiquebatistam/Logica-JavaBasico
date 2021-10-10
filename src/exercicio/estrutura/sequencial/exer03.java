package exercicio.estrutura.sequencial;

import java.util.Scanner;

/*
	Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
 	de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*/


public class exer03 {

	public static void main(String[] args) {

		int a,b,c,d, dif;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de A : ");
		a = scan.nextInt();
		System.out.println("\nDigite o valor de B : ");
		b = scan.nextInt();
		System.out.println("\nDigite o valor de C : ");
		c = scan.nextInt();
		System.out.println("\nDigite o valor de D : ");
		d = scan.nextInt();
		
		dif = (a*b - c*d);
		
		System.out.println("\nO valor resultante é : "+ dif);
		
		
		
	}

}
