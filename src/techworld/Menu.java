package techworld;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import techworld.model.Eletronico;
import techworld.controller.TechWorldController;
import techworld.model.Celular;
import techworld.model.Notebook;
import techworld.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		TechWorldController eletronicos = new  TechWorldController();
		
				Celular celular1 = new Celular(eletronicos.gerarId(),"GalaxyX","Samsung",2000f,"Azul",3,2);
				celular1.visualizar();
				Notebook notebook1 =  new Notebook (eletronicos.gerarId(),"Inspiron","Dell",3000f,"Preto",15,"Gamer");
				notebook1.visualizar();

		
		
		
		Scanner leia = new Scanner(System.in);
		int opcao, idEletronico,tipo,entradasDeChip;
		String modelo,marca,cor,modeloDoTeclado;
		float valor;

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
			System.out.println("            4 - Atualizar                            ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			

			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}

			if (opcao == 5) {
				System.out.println("\nTECHWORLD - O melhor do eletrônico é aqui!");
				leia.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE+"Listar produtos\n\n");
				eletronicos.listarTodos();
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Cadastrar Protudo no sistema\n\n");
				
				System.out.println("Por favor digite o modelo do eletrônico: ");
				leia.skip("\\R?");
				modelo = leia.nextLine();
				do {
					System.out.println("Escolha o tipo do aparelho eletrônico | 1 - Celular ou | 2 - Notebook: ");
					tipo = leia.nextInt();
					}while (tipo < 1 && tipo >2);
				
				System.out.println("Digite o Valor do Aparelho Eletrônico (R$): ");
				valor = leia.nextFloat();
				leia.nextLine();
				System.out.println("Digite a cor do Aparelho Eletrônico: ");
				cor = leia.nextLine();
				
				System.out.println("Digite o nome da Marca: ");
				marca = leia.nextLine();
				
				
				switch (tipo) {
				case 1 -> {
					System.out.println("Digite a quatidade de Entradas de Chip: ");
					entradasDeChip = leia.nextInt();
					eletronicos.cadastrar(new Celular(eletronicos.gerarId(),modelo,marca,valor,cor,tipo,entradasDeChip));
				}
				case 2 ->{
					System.out.println("Digite o modelo do Teclado: ");
					modeloDoTeclado = leia.nextLine();
					eletronicos.cadastrar(new Notebook(eletronicos.gerarId(),modelo,marca,valor,cor,tipo,modeloDoTeclado));
				}
				}
			
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Remover Produto do sistema\n\n");
				System.out.println("Digite o id do eletrônico:");
				idEletronico =leia.nextInt();
				eletronicos.remover(idEletronico);
				keyPress();
				break;
			case 4 :
				System.out.println(Cores.TEXT_WHITE + "Atualizar\n\n");
				
				System.out.println("Digite o ID no aparelho eletronico: ");
				idEletronico = leia.nextInt();
				
				var buscarEletronico = eletronicos.buscarNaCollection(idEletronico);
				
				if(buscarEletronico != null) {
					
					tipo = buscarEletronico.getTipo();
					
					System.out.println("Por favor digite o modelo do eletrônico: ");
					leia.skip("\\R?");
					modelo = leia.nextLine();
					
					System.out.println("Digite o Valor do Aparelho Eletrônico (R$): ");
					valor = leia.nextFloat();
					leia.nextLine();
					System.out.println("Digite a cor do Aparelho Eletrônico: ");
					cor = leia.nextLine();
					
					System.out.println("Digite o nome da Marca: ");
					marca = leia.nextLine();
					
					switch (tipo) {
					case 1 -> {
						System.out.println("Digite a quatidade de Entradas de Chip: ");
						entradasDeChip = leia.nextInt();
						
						eletronicos.atualizar(new Celular(idEletronico,modelo,marca,valor,cor,tipo,entradasDeChip));	
					}case 2 -> {
						System.out.println("Digite o modelo do Teclado: ");
						modeloDoTeclado = leia.nextLine();
						
						eletronicos.atualizar(new Notebook(idEletronico,modelo,marca,valor,cor,tipo,modeloDoTeclado));
						
					}
					default -> {
						System.out.println(Cores.TEXT_RED_BOLD+"\nTipo de ID Invalido!");
					}
					}
					
					
					
				}
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



