package sneaker_ecommerce;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
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

			opcao = read.nextInt();
			
			if (opcao == 6) {
				System.out.println("\n\tSneakers da Luh agradece a preferência!");
				read.close();
				System.exit(0);
			}
			
			switch(opcao) {
			
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

}
