package produto.poo;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	// Criação do construtor
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
	}
	//Contrutor sobrecarga - imaginando o cenario em que quero colocar o produto mas não tenho estoque ainda
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
		
	
	
	// Métodos
	
	public double totalValueInStock() {
		return preco * quantidade;
	}
	
	
	public void addProducts(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProducts(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome
			+ ", R$ "
			+ String.format("%.2f", preco)
			+ " , "
			+quantidade
			+ " unidade, Total : R$ "
			+ String.format("%.2f", totalValueInStock());
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}

	
	
}
