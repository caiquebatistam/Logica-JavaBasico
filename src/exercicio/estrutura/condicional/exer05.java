package exercicio.estrutura.condicional;

import java.util.Scanner;

/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.*/

public class exer05 {

	public static void main(String[] args) {

		int codigo;
		double valorTotal;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDigite o código do produto : ");
		codigo = scan.nextInt();
		
		if(codigo == 1) {
			
			double precoCachorro = 4.00;
			System.out.println("\nDigite a quantidade : ");
			double qtd = scan.nextInt();
			valorTotal = qtd * precoCachorro;
			System.out.printf("\nValor total a pagar %.2f: ",valorTotal);
		
		}else if(codigo == 2){
			
			double precoSalada = 4.50;
			System.out.println("\nDigite a quantidade : ");
			double qtd = scan.nextInt();
			valorTotal = qtd * precoSalada;
			System.out.printf("\nValor total a pagar %.2f: ",valorTotal);
			
		}else if(codigo == 3) {
		
			double precoBacon = 5.00;
			System.out.println("\nDigite a quantidade : ");
			double qtd = scan.nextInt();
			valorTotal = qtd * precoBacon;
			System.out.printf("\nValor total a pagar %.2f: ",valorTotal);
		
		}else if(codigo == 4) {
			
			double precoTorrada = 2.00;
			System.out.println("\nDigite a quantidade : ");
			double qtd = scan.nextInt();
			valorTotal = qtd * precoTorrada;
			System.out.printf("\nValor total a pagar %.2f: ",valorTotal);
		
		}else {
		
			double precoRefri = 1.50;
			System.out.println("\nDigite a quantidade : ");
			double qtd = scan.nextInt();
			valorTotal = qtd * precoRefri;
			System.out.printf("\nValor total a pagar %.2f: ",valorTotal);

		}	
			
			
		
		
	}

}
