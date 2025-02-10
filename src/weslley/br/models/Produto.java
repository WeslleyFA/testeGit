package weslley.br.models;

public class Produto {

	private String nome;
	private Double valor;
	private long quantidade;

	public Produto(String nome, Double valor, long quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public Produto() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(long quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto: " + nome + " \n Valor: " + valor + "\n Quantidade " + quantidade + "\n Valor Total: " + valor * quantidade; 
				
		
	}

}
