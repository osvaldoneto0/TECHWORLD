package techworld.controller;
import java.util.ArrayList;

import techworld.model.Eletronico;
import techworld.repository.TechWorldRepository;
public class TechWorldController implements TechWorldRepository {
	
	private ArrayList<Eletronico> listaEletronicos = new ArrayList<Eletronico>();
	int id = 0 ;
	


	@Override
	public void cadastrar(Eletronico eletronico) {
		listaEletronicos.add(eletronico);
		System.out.println("O produto " + eletronico.getModelo() + " Foi cadastrado com sucesso! ");
		
	}

	@Override
	public void remover (int id) {
		var eletronico = buscarNaCollection(id);
		if (eletronico != null) {
			if(listaEletronicos.remove(eletronico) == true)
				System.out.println("Produto eletronico " + id + " Removido com sucesso!");
		}else 
			System.out.println("Produto eletronico " + id + " não foi encontrado ");
		
		
		
	}   
	{
		
	}
	@Override
	public void atualizar(Eletronico eletronico) {
		var buscaEletronico = buscarNaCollection(eletronico.getId());
		if (buscaEletronico!= null) {
			listaEletronicos.set(listaEletronicos.indexOf(buscaEletronico),eletronico);
				System.out.println("Produto eletronico " + eletronico.getId() + " foi atualizado com sucesso!");
		}else 
			System.out.println("Produto eletronico " + eletronico.getId() + " não foi encontrado");
		
		
	}
	@Override
	public void listarTodos() {
		for (var eletronico : listaEletronicos) {
			eletronico.visualizar();
		}
		
	} 
		 
		
		public int gerarId() {
			return ++ id;
		}
		public Eletronico buscarNaCollection(int id) {
			for (var eletronico : listaEletronicos) {
				if (eletronico.getId() == id)
					return eletronico;
				
			}
			return null;
		}
	}


