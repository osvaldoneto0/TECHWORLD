package techworld.repository;
import techworld.model.Eletronico;

public interface TechWorldRepository {
	
	
	public void listarTodas();
	public void cadastrar (Eletronico eletronico);
	public void remover (Eletronico eletronico);
}
