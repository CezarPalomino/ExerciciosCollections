package br.com.generation.ExercicioCollection;

public class Produto {

	private String nome;
	private String lote;
	private int quantidade;
	
	public Produto(String nome, String lote, int quantidade) {
		super();
		this.nome = nome;
		this.lote = lote;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Copo [nome: " + nome + ", lote: " + lote + ", quantidade: " + "]";
	}
}
