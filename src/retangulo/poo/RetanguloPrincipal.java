package retangulo.poo;

import java.util.Scanner;

public class RetanguloPrincipal {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		Retangulo x = new Retangulo();
		
						
		Retangulo retangulo = new Retangulo();
		
		System.out.print("Digite o valor de Base: ");
		x.base = sc.nextDouble();
		System.out.print("Digite o valor de Altura: ");
		x.altura = sc.nextDouble();
		
		double areaRetangulo = x.Area();
		double perimetroRetangulo = x.Perimetro();
		double diagonalRetangulo = x.Diagonal();
		
		System.out.printf("Retangulo X area: %.2f%n",areaRetangulo);
		System.out.printf("Retangulo X perimetro: %.2f%n",perimetroRetangulo);
		System.out.printf("Retangulo X diagonal: %.2f%n",diagonalRetangulo);
		
		
		
		
		
		
		
		
		
	}

}
