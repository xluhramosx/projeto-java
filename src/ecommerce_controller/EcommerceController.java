package ecommerce_controller;

import java.util.ArrayList;

import ecommerce_model.Ecommerce;
import ecommerce_repository.EcommerceRepository;

public class EcommerceController implements EcommerceRepository {
	
	private ArrayList<Ecommerce> listaMarcas = new ArrayList<Ecommerce>();

	@Override
	public void procurarPorMarca(int marca) {
		var ecommerce = buscarNaCollection(marca);
		ecommerce.visualizar();
		
	}

	@Override
	public void listarTodas() {
		for(var ecommerce : listaMarcas) {
			ecommerce.visualizar();
		}
		
	}

	@Override
	public void adicionar(Ecommerce ecommerce) {
		listaMarcas.add(ecommerce);
		System.out.println("\nO produto: " + ecommerce.getProduto() + " foi adicionado!");	
	}

	@Override
	public void excluir(int marca) {
		var ecommerce = buscarNaCollection(marca);
		
		if (ecommerce != null) {
		listaMarcas.remove(marca);
				System.out.println("O Produto foi deletado com sucesso!");
		}else 
			System.out.println("Produto não encontrado!");
	}

	@Override
	public void vender(int marca, int quantidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int marca, int quantidade) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Ecommerce buscarNaCollection(int marca) {
		for (var ecommerce: listaMarcas) {
            if (ecommerce.getMarca() == marca) {
                return ecommerce;
            }
        }
        return null;
	}
	


}
