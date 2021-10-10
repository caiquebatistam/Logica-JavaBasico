package exercicio.estrutura.condicional;

import java.util.Scanner;

/*
Em um pa�s imagin�rio denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele n�o existem pol�ticos corruptos e os recursos arrecadados s�o utilizados em benef�cio da popula��o, sem
qualquer desvio. A moeda deste pa�s � o Rombus, cujo s�mbolo � o R$.
Leia um valor com duas casas decimais, equivalente ao sal�rio de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
*/


public class exer08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o seu salario : ");
		double salario = scan.nextDouble();
		
		if(salario > 0 && salario <= 2000.00) {
			
			System.out.println("\nVoc� est� isento de impostos ! ");
			
		}else if(salario >=2000.01 && salario <= 3000.00) {
			
			double imposto = 0.08 * salario;
			System.out.printf("\nO imposto sobre seu salario � %.2f: ",imposto);
		
		}else if(salario >=3000.01 && salario <= 4500.00) {
			
			double imposto = 0.18 * salario;
			System.out.printf("\nO imposto sobre seu salario � %.2f: ",imposto);
		
		}else if(salario > 4500.00){
			
			double imposto = 0.28 * salario;
			System.out.printf("\nO imposto sobre seu salario � %.2f: ",imposto);
		}
		
		
	}		
}
