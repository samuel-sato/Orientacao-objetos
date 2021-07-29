package entities;

public class Util {

	private int aux;
	private int indiceProduto;

	public Util(int aux, int indiceProduto) {
		this.aux = aux;
		this.indiceProduto= indiceProduto;
	}

	public int getAux() {
		return aux;
	}

	public void setAux(int aux) {
		this.aux = aux;
	}
	
	public int getIndiceProduto() {
		return indiceProduto;
	}
	public void setIndiceProduto(int indice) {
		this.indiceProduto = indice;
	}
	
	
}
