package exercicio.estrutura.condicional;

import java.util.Scanner;

/*
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
*/


public class exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número entre 0 a 100");
		int num = scan.nextInt();
		
		if (num >=0 && num < 25) {
			
			System.out.println("\nO valor : "+num+" esta no intervalo entre [0 - 25]");
		
		}else if(num >= 25 && num < 50) {
			
			System.out.println("\nO valor : "+num+" esta no intervalo entre [25 - 50]");
		
		}else if(num >=50 && num < 75) {
			
			System.out.println("\nO valor : "+num+" esta no intervalo entre [50 - 75]");

		}else if(num >=75 && num <= 100) {
		
			System.out.println("\nO valor : "+num+" esta no intervalo entre [75 - 100]");
		}

		
	}	
		
}
