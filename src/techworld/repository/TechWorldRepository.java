package techworld.repository;
import techworld.model.Eletronico;

public interface TechWorldRepository {
	
	
	
	public void cadastrar (Eletronico eletronico);
	public void remover (int id);
	public void atualizar (Eletronico eletronico);
	public void listarTodos();
}
