package techworld.model;

public abstract class Eletronico {
   
	private String modelo;
	private String marca;
	private float valor;
	private String cor;
	private int tipo;

	 public Eletronico(String modelo, String marca, float valor, String cor, int tipo) {
		this.modelo = modelo;
		this.marca = marca;
		this.valor = valor;
		this.cor = cor;
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public float getValor() {
		return valor;
	}




	public void setValor(float valor) {
		this.valor = valor;
	}




	public String getCor() {
		return cor;
	}




	public void setCor(String cor) {
		this.cor = cor;
	}




	public int getTipo() {
		return tipo;
	}




	public void setTipo(int tipo) {
		this.tipo = tipo;
	}




	public void visualizar() { 
		 String tipo = "";

    switch(this.tipo) {
    case 1:
        tipo = "Celular";
        break;
    case 2:
        tipo = "Notbook";
        break;
    }
    System.out.print("""
            ******************
            PRODUTO CADASTRADO        
            ******************
            """);
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Marca: "+ this.marca);
    System.out.println("Valor - R$: "+ this.valor);
    System.out.println("Cor: " + this.cor);
    System.out.println("Tipo:" + tipo);
	 }
}
	

