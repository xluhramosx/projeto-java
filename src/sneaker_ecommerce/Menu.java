package sneaker_ecommerce;

import ecommerce_model.Nike;
import ecommerce_model.Adidas;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		// Teste da Classe Nike
		Nike p2 = new Nike(5, 36, 1, "Nike Air Jordan 5", 1799.99f, "Jordan");
		p2.visualizar();
		p2.vender(2);
		p2.visualizar();
		p2.comprar(1);
		p2.visualizar();

		// Teste da Classe Nike
		Adidas p3 = new Adidas(2, 39, 2, "Tenis Adi2000", 799.99f, "Originals");
		p3.visualizar();
		p3.vender(2);
		p3.visualizar();
		p3.comprar(1);
		p3.visualizar();

		Scanner read = new Scanner(System.in);
		int opcao;

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
			System.out.println("            4 - Atualizar Produtos                   ");
			System.out.println("            5 - Excluir Produto                      ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			try {
				opcao = read.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nEscolha uma opção válida");
				read.nextLine();
				opcao=0;
			}

			if (opcao == 6) {
				System.out.println("\n\tSneakers da Luh agradece a preferência!");
				read.close();
				System.exit(0);
			}

			switch (opcao) {

			case 1:
				System.out.println("Incluir Produto\n\n");

				break;
			case 2:
				System.out.println("Listar todas os Produtos\n\n");

				break;
			case 3:
				System.out.println("Buscar Produtos por Marca\n\n");

				break;
			case 4:
				System.out.println("Atualizar Produtos\n\n");

				break;
			case 5:
				System.out.println("Excluir Produto \n\n");

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


