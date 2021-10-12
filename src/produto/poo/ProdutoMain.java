package produto.poo;

import java.util.Scanner;

public class ProdutoMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o produto");
		System.out.print("Nome : ");
		String nome = sc.nextLine();
		System.out.print("Preço : ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade : ");
		int quantidade = sc.nextInt();
		Produto produto = new Produto(nome, preco, quantidade);
		
		System.out.println();
		System.out.println("Dados Produto : " + produto);

		System.out.println();
		System.out.print("Entre com a quantidade do produto que deseja adicionar no estoque : " );
		quantidade = sc.nextInt();
		produto.addProducts(quantidade);
		
		System.out.println();
		System.out.println("Dados Produto : " + produto);
		
		sc.close();
		
		
	}

}
