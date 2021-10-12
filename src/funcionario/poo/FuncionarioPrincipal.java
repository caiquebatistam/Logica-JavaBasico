package funcionario.poo;

import java.util.Scanner;

public class FuncionarioPrincipal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Funcionario x = new Funcionario();
		
		System.out.print("Digite seu nome : ");
		x.nome = sc.next();
		System.out.println("Digite seu salario : ");
		x.salarioBruto = sc.nextDouble();
		
		
		System.out.printf("\nSalario Liquido %s: R$ %.2f:",x.nome,x.salarioLiquido());
		System.out.println("\nQual a porcentagem de aumento em cima do salario bruto que deseja ? " );
		double porcentagem = sc.nextDouble();
		x.aumentoSalario(porcentagem);
		System.out.println();
		System.out.print("Salario Atualizado : "+x);
		
		
	}

}
