package exercicio.estrutura.condicional;

import java.util.Scanner;

/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode
come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.*/

public class exer04 {

	public static void main(String[] args) {

		int horaI, horaF, duracaoJogo;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial: ");
		horaI = scan.nextInt();
		System.out.println("Digite a hora final: ");
		horaF = scan.nextInt();
		
		
		if(horaI < horaF) {
			
			duracaoJogo = horaI - horaF;
		
		}else{
			duracaoJogo = 24 - horaI + horaF;
		}
		
		System.out.println("O jogo durou "+duracaoJogo+" hora(s)");
		

		
		
	}

}
