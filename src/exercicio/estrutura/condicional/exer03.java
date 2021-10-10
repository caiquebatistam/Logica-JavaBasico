package exercicio.estrutura.condicional;

import java.util.Scanner;

/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
*/

public class exer03 {

	public static void main(String[] args) {

		int a,b;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDigita o valor de A: ");
		a = scan.nextInt();
		System.out.println("\nDigita o valor de B: ");
		b = scan.nextInt();
		
		if( a % b == 0 || b % a == 0) {
			System.out.println("\nSão Multiplos");
		}else {
			System.out.println("\nNão são Multiplos");
		}
		
		
		
	}

}
