package entities;

public class Estoque {
	
	private String nome;
	private String descricao;
	private double valor;
	private double porcentagemLucro;
	private int quantidadeEstoque;
	
	public Estoque(String nome, String descricao, double valor, double porcentagemLucro, int quantidadeEstoque) {
		super();
		this.nome = nome.toUpperCase();
		this.descricao = descricao;
		this.valor = valor;
		this.porcentagemLucro = porcentagemLucro;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getPorcentagemLucro() {
		return porcentagemLucro;
	}

	public void setPorcentagemLucro(double porcentagemLucro) {
		this.porcentagemLucro = porcentagemLucro;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque -= quantidadeEstoque;
	}
	
	
}
