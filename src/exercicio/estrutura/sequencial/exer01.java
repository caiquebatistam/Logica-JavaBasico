package exercicio.estrutura.sequencial;

import java.util.Scanner;

/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/


public class exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.println("\nDigite o valor de A");
		a = scan.nextInt();
		System.out.println("\nDigite o valor de B");
		b = scan.nextInt();
		
		soma = a+b;
		
		System.out.println("\nO Valor da somatória é : "+soma);
		
		
		
		

		
		
		
	}

}
