package weslley.br.models;

public class Pessoa {
	
	private String nome;
	private String sobreNome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nomePassado) {
		this.nome = nomePassado;
	}
	
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}


}
