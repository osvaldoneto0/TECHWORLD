package techworld;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                TECHWORLD                           ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Celulares                            ");
			System.out.println("            2 - Notebooks                            ");
			System.out.println("            3 - Adicionar Protudo no carrino         ");
			System.out.println("            4 - Remover Produto do carrinho          ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();
			
			if (opcao == 5) {
				System.out.println("\nObrigado por acesaar nossa loja. Volte Sempre!");
				leia.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println("Celulares\n\n");

				break;
			case 2:
				System.out.println("Notebooks\n\n");

				break;
			case 3:
				System.out.println("Adicionar Protudo no carrino\n\n");

				break;
			case 4:
				System.out.println("Remover Produto do carrinho\n\n");
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;


		}
	}
}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Osvaldo Neto - osvaldonetoo011@gmail.com");
		System.out.println("github.com/osvaldoneto0");
		System.out.println("*********************************************************");
	}
}



