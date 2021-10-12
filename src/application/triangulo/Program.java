package application.triangulo;

import java.util.Scanner;

import entities.triangulo.Triangulo;

public class Program {

	public static void main(String[] args) {

		
		Triangulo x,y;
		x = new Triangulo();
		y = new Triangulo();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n",areaX);
		System.out.printf("Triangle Y area: %.4f%n",areaY);
		
		if (areaX > areaY) {
			System.out.println("Largers area X");
		}else {
			System.out.println("Largers area Y");
		}
			
		
		
		
		sc.close();
	}

}
