package sneaker_ecommerce;

import ecommerce_model.Nike;
import ecommerce_model.Adidas;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce_model.Ecommerce;
import ecommerce_controller.EcommerceController;

public class Menu {

	public static void main(String[] args) {

		EcommerceController ecommerce = new EcommerceController();

		Scanner read = new Scanner(System.in);
		int opcao, estoque = 0, tamanho, marca;
		String produto;
		double preco;

		System.out.println("\nCriar Produtos\n");

		Nike p1 = new Nike(5, 40, 1, "Air Jordan 6", 1799.99f, "Jordan");
		ecommerce.adicionar(p1);
		Adidas p3 = new Adidas(4, 39, 2, "Adi2000", 799.99f, "Originals");
		ecommerce.adicionar(p3);

		ecommerce.listarTodas();

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                SNEAKERS DA LUH                      ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Incluir Produto                      ");
			System.out.println("            2 - Listar todas os Produtos             ");
			System.out.println("            3 - Buscar Produtos por Marca            ");
			System.out.println("            4 - Excluir Produto                      ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			try {
				opcao = read.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nEscolha uma opção válida");
				read.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {
				System.out.println("\n\tSneakers da Luh agradece a preferência!");
				read.close();
				System.exit(0);
			}

			switch (opcao) {

			case 1:
				System.out.println("Incluir Produto\n\n");

				System.out.println("Digite a Marca do Produto: ");
				marca = read.nextInt();
				read.nextLine();

				switch (marca) {
				case 1 -> {
					System.out.println("Digite o Nome do Produto: ");
					produto = read.nextLine();
					System.out.println("Digite o Tamanho do Produto: ");
					tamanho = read.nextInt();
					System.out.println("Digite o Preço do Produto: ");
					preco = read.nextDouble();

					String modelo = null;
					ecommerce.adicionar(new Nike(estoque, tamanho, marca, produto, preco, modelo));
					break;
				}
				case 2 -> {
					System.out.println("Digite o Nome do Produto: ");
					produto = read.nextLine();
					System.out.println("Digite o Tamanho do Produto: ");
					tamanho = read.nextInt();
					System.out.println("Digite o Preço do Produto: ");
					preco = read.nextDouble();

					String categoria = null;
					ecommerce.adicionar(new Adidas(estoque, tamanho, marca, produto, preco, categoria));
					break;
				}
				}

				keyPress();
				break;
			case 2:
				System.out.println("Listar todas os Produtos\n\n");
				ecommerce.listarTodas();
				keyPress();
				break;
			case 3:
				System.out.println("Buscar Produtos por Marca\n\n");
				System.out.println("Digite a marca desejada: ");
				marca = read.nextInt();
				
				ecommerce.procurarPorMarca(marca);

				keyPress();
				break;
			case 4:
				System.out.println("Excluir Produto \n\n");
				
				System.out.println("Digite a marca desejada: ");
				marca = read.nextInt();
				
				ecommerce.excluir(marca);

				keyPress();
				break;
			 default:
				System.out.println("\nOpção Inválida!\n");
			}

		}
	}

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

}
