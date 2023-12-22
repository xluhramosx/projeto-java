package ecommerce_model;

public class Adidas extends Ecommerce {
	
	private String categoria;
	
	public Adidas(int estoque, int tamanho, int marca, String produto, float preco, String categoria) {
		super(estoque, tamanho, marca, produto, preco);
		this.categoria = categoria;
	}
	
	
	public String getCategoria() {
		return categoria;
	}

    public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

    @Override
	public void visualizar() {
    	super.visualizar();
    	System.out.println("Modelo: " + this.categoria);
	}
}

