package techworld.model;

public class Celular extends Eletronico {
	
	private int entradaDeChip;

	public Celular(int id,String modelo, String marca, float valor, String cor, int tipo,int entradaDeChip) {
		super(entradaDeChip, modelo, marca, valor, cor, tipo);
		this.entradaDeChip = entradaDeChip;
	}

	public int getEntradaDeChip() {
		return entradaDeChip;
	}

	public void setEntradaDeChip(int entradaDeChip) {
		this.entradaDeChip = entradaDeChip;
	}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("O Celular poussui " + this.entradaDeChip + " Entradas de chipe");
	}

}
