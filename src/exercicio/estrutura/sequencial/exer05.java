package exercicio.estrutura.sequencial;

import java.util.Scanner;

/*
	Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
	c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago
*/


public class exer05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double preco1, preco2;
		
		System.out.println("Digite o c�digo da Pe�a 01 ");
		cod1 = scan.nextInt();
		System.out.println("Digite o total de pe�as 01 ");
		qtd1 = scan.nextInt();
		System.out.println("Digite o valor por unidade do produto 01 : ");
		preco1 = scan.nextDouble();
		
		System.out.println("Digite o c�digo da Pe�a 02 ");
		cod2 = scan.nextInt();
		System.out.println("Digite o total de pe�as 02 ");
		qtd2= scan.nextInt();
		System.out.println("Digite o valor por unidade do produto 02 : ");
		preco2 = scan.nextDouble();
		
		
		double total = preco1 * qtd1 + preco2 * qtd2;
		
		
		System.out.printf("Valor Total a pagar:  %.2f:",total);
		
		
	}

}
