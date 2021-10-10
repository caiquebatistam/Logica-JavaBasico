package exercicio.estrutura.sequencial;

import java.util.Scanner;

/*
	Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
	código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
*/


public class exer05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double preco1, preco2;
		
		System.out.println("Digite o código da Peça 01 ");
		cod1 = scan.nextInt();
		System.out.println("Digite o total de peças 01 ");
		qtd1 = scan.nextInt();
		System.out.println("Digite o valor por unidade do produto 01 : ");
		preco1 = scan.nextDouble();
		
		System.out.println("Digite o código da Peça 02 ");
		cod2 = scan.nextInt();
		System.out.println("Digite o total de peças 02 ");
		qtd2= scan.nextInt();
		System.out.println("Digite o valor por unidade do produto 02 : ");
		preco2 = scan.nextDouble();
		
		
		double total = preco1 * qtd1 + preco2 * qtd2;
		
		
		System.out.printf("Valor Total a pagar:  %.2f:",total);
		
		
	}

}
