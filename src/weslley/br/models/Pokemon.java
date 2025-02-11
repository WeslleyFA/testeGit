package weslley.br.models;

public class Pokemon {

	private String nome;
	private String tipo;
	private int quantidade;
	private String nomeDoTreinador;

	public Pokemon(String nome, String tipo, int quantidade, String nomeDotreinador) {
		this.nome = nome;
		this.tipo = tipo;
		this.quantidade = quantidade;
		this.nomeDoTreinador = nomeDotreinador;

	}

	public Pokemon() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNomeDoTreinador() {
		return nomeDoTreinador;
	}

	public void setNomeDoTreinador(String nomeDoTreinador) {
		this.nomeDoTreinador = nomeDoTreinador;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nTipo: " + tipo + "\nQuantidade: " + quantidade + "\nNome do Treinador: "
				+ nomeDoTreinador + "\nTreinador e pokemon : " + nome + " " + nomeDoTreinador;
	}

}
