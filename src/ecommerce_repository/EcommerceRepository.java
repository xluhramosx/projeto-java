package ecommerce_repository;

import ecommerce_model.Ecommerce;

public interface EcommerceRepository {

		// CRUD do Eccomerce
		public void procurarPorMarca(int marca);
		public void listarTodas();
		public void adicionar(Ecommerce ecommerce);
		public void atualizar(Ecommerce ecommerce);
		public void excluir(int produto);
		
		// Métodos de Venda
		public void vender(int marca, float quantidade);
		public void depositar(int marca, float quantidade);
		
	}
