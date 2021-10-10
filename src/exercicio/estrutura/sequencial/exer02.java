package exercicio.estrutura.sequencial;

import java.util.Scanner;

/*
 Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
 casas decimais conforme exemplos.
 Fórmula da área: area = π . raio^2
 Considere o valor de π = 3.14159    
*/



public class exer02 {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		double areaCirc, pi = 3.1415, raio;
		
		System.out.println("Digite o valor do raio : ");
		raio = scan.nextDouble();
		
		areaCirc = pi*Math.pow(raio,2);
		
		System.out.printf("\nO raio do circulo é %.4f",areaCirc);
		
		
		
	}
	

}
