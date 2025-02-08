package weslley.br.models;

public class Animal {
	private String nome;
	private String raca;
	private String cor;
	private int idade;

	public Animal(String nome, String raca, String cor, int idade) {
		this.nome = nome;
		this.raca = raca;
		this.cor = cor;
		this.idade = idade;
	}

	public Animal() {

	}

	public Animal(String nome, String raca, String cor) {
		this.nome = nome;
		this.raca = raca;
		this.cor = cor;
	}

	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome + " " + raca;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaça() {
		return raca;
	}

	public void setRaça(String raça) {
		this.raca = raça;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Animal \n[nome= " + nome + "\n, raca=" + raca + "\n, cor=" + cor + "\n, idade=" + idade + "\n]";
	}

}
