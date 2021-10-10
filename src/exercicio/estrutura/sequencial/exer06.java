package exercicio.estrutura.sequencial;

import java.util.Scanner;

/*
Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
mostre:
a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
b) a �rea do c�rculo de raio C. (pi = 3.14159)
c) a �rea do trap�zio que tem A e B por bases e C por altura.
d) a �rea do quadrado que tem lado B.
e) a �rea do ret�ngulo que tem lados A e B.
*/


public class exer06 {

	public static void main(String[] args) {

		double a,b,c,areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo ;
		double  pi = 3.14;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = scan.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = scan.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = scan.nextDouble();
		
		// base * altura / 2
		areaTrianguloRetangulo = (a * b) /2;
		
		// areaCirc = pi*r^2
		areaCirculo = pi * Math.pow(c, 2);
		
		// (base maior + base menor)*altura / 2
		areaTrapezio = (a+b)*c/2;
		
		// base * altura ou lado ^2
		areaQuadrado = Math.pow(b, 2);
		
		// base * altura
		areaRetangulo = a * b;
		
		
		System.out.println("\nA �rea do tri�ngulo ret�ngulo que tem A por base e C por altura : "+areaTrianguloRetangulo);
		System.out.println("\n");
		System.out.println("\nA �rea do c�rculo de raio C. : "+areaCirculo);
		System.out.println("\n");
		System.out.println("\nA  �rea do trap�zio que tem A e B por bases e C por altura : "+areaTrapezio);
		System.out.println("\n");
		System.out.println("\nA �rea do quadrado que tem lado B. : "+areaQuadrado);
		System.out.println("\n");
		System.out.println("\nA �rea do ret�ngulo que tem lados A e B. : "+areaRetangulo);
		System.out.println("\n");
		
		
	}

}
