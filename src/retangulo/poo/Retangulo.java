package retangulo.poo;

public class Retangulo {
	
	public double base;
	public double altura;
	
	
	public double Area() {
		
		double area = base * altura;
		return area;		
	}
	
	public double Perimetro() {
		
		double perimetro = 2  * ( base + altura);
		return perimetro;
	}
	
	public double Diagonal() {
		
		double diagonal = Math.sqrt( Math.pow(base,2) + Math.pow(altura,2));
		return diagonal;
	}
}
