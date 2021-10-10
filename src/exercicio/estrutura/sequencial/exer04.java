package exercicio.estrutura.sequencial;

import java.util.Scanner;

/*
  	Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
	hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
	decimais.
*/	
	public class exer04 {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome = "Caique Batista";
		int numeroFunc;
		double numHorasTrab, salarioHora = 30.00, salarioTotal;
		
		System.out.println("\nDigite o número do funcionario : ");
		numeroFunc = scan.nextInt();
		System.out.println("\nDigite o número de horas trabalhadas : ");
		numHorasTrab = scan.nextDouble();
		
		salarioTotal = numHorasTrab * salarioHora;
		
		System.out.println("\nFuncionario: "+numeroFunc+nome);
		System.out.printf("\nSalario mês %.2f: ",salarioTotal);
		
		
		
		
		
	}
}
	

