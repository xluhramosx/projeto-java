package ecommerce_model;

public abstract class Ecommerce {
	
	private int estoque;
	private int tamanho;
	private int marca;
	private String produto ;
	private double preco;
	
	
	public Ecommerce(int estoque, int tamanho, int marca,String produto,
			double preco) {
		super();
		this.estoque = estoque;
		this.tamanho = tamanho;
		this.produto = produto;
		this.marca = marca;
		this.preco = preco;
	}
	

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getMarca() {
		return marca;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public boolean vender(int quantidade) {
		
		if(this.getEstoque() <= 0) {
			System.out.println("\nEstoque Insuficiente");
			return false;
		}
		this.setEstoque(this.getEstoque()- quantidade);
		return true;
	}
	public void adicionar(int quantidade) {

		this.setEstoque(this.getEstoque() + quantidade);

	}

	public void visualizar() {

		String nomeMarca = "";
		
		switch(this.marca) {
		case 1:
			nomeMarca = "Nike";
		break;
		case 2:
			nomeMarca = "Adidas";
		break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Produtos Disponíveis");
		System.out.println("***********************************************************");
		System.out.println("Quantidade em Estoque: " + this.estoque);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Marca: " + nomeMarca);
		System.out.println("Produto: " + produto);
		System.out.println("Preço " + this.preco);
	}
	
	

}
