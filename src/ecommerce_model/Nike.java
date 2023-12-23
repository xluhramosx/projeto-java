package ecommerce_model;

public class Nike extends Ecommerce {
	
	private String modelo;
	
	public Nike(int estoque, int tamanho, int marca, String produto, double preco, String modelo) {
		super(estoque, tamanho, marca, produto, preco);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public void visualizar() {
    	super.visualizar();
    	System.out.println("Modelo: " + this.modelo);
    }

}
