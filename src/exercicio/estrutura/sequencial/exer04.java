package exercicio.estrutura.sequencial;

import java.util.Scanner;

/*
  	Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
	hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
	decimais.
*/	
	public class exer04 {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome = "Caique Batista";
		int numeroFunc;
		double numHorasTrab, salarioHora = 30.00, salarioTotal;
		
		System.out.println("\nDigite o n�mero do funcionario : ");
		numeroFunc = scan.nextInt();
		System.out.println("\nDigite o n�mero de horas trabalhadas : ");
		numHorasTrab = scan.nextDouble();
		
		salarioTotal = numHorasTrab * salarioHora;
		
		System.out.println("\nFuncionario: "+numeroFunc+nome);
		System.out.printf("\nSalario m�s %.2f: ",salarioTotal);
		
		
		
		
		
	}
}
	

