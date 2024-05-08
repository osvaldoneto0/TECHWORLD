package techworld;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import techworld.model.Eletronico;
import techworld.model.Celular;
import techworld.model.Notebook;
import techworld.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
				Celular celular1 = new Celular("GalaxyX","Samsung",2000f,"Azul",3,2);
				celular1.visualizar();
				Notebook notebook1 =  new Notebook ("Inspiron","Dell",3000f,"Preto",15,"Gamer");
				notebook1.visualizar();

		
		
		
		Scanner leia = new Scanner(System.in);
		int opcao;

		while (true) {
              
			System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND );
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                TECHWORLD                            ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Listar produtos                      ");
			System.out.println("            2 - Cadastrar Protudo no sistema         ");
			System.out.println("            3 - Remover Produto do sistema           ");
			System.out.println("            4 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			

			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}

			if (opcao == 4) {
				System.out.println("\nTECHWORLD - O melhor do eletrônico é aqui!");
				leia.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE+"Listar produtos\n\n");
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Cadastrar Protudo no sistema\n\n");
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Remover Produto do sistema\n\n");
				keyPress();
				break;
			
			default:
				System.out.println(Cores.TEXT_RED_BOLD +"\nOpção Inválida!\n");
				keyPress();
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
	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
}
}



