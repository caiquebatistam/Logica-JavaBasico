package exercicio.estrutura.condicional;

import java.util.Scanner;

/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).

Se o ponto estiver na origem, escreva a mensagem “Origem”

Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
*/

public class exer07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de X: ");
		int x = scan.nextInt();
		System.out.println("Digite o valor de Y: ");
		int y = scan.nextInt();
		
		
		if(x > 0  && y > 0) {
			
			System.out.println("\n X e Y estão no quadrante 1");
		
		}else if(x > 0 && y < 0) {
			
			System.out.println("\n X e Y estão no quadrante 4");
		
		}else if(x < 0 && y < 0) {
			
			System.out.println("\n X e Y estão no quadrante 3");
		
		}else if(x < 0 && y > 0) {
			
			System.out.println("\n X e Y estão no quadrante 2");
		
		}else if(x == 0 || y == 0) {
			
			System.out.println("\nOrigem !");
		}
		
	}

}
