package techworld.model;

public class Notebook extends Eletronico {
	
	private String modeloDoTeclado;

	public Notebook( int id,String modelo, String marca, float valor, String cor, int tipo,String modeloDoTeclado) {
		super(tipo, modelo, marca, valor, cor, tipo);
		this.modeloDoTeclado = modeloDoTeclado;
			}

	public String getModeloDoTeclado() {
		return modeloDoTeclado;
	}

	public void setModeloDoTeclado(String modeloDoTeclado) {
		this.modeloDoTeclado = modeloDoTeclado;
	}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("O modelo do teclado: " + this.modeloDoTeclado);
	}
}
