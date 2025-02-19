package weslley.br.models;

public class Comida {
	
	private String nome;
	private Double peso;
	private String tipo;
	
	public Comida(String nome, Double peso, String tipo) {
		this.nome = nome;
		this.peso = peso;
		this.tipo = tipo;
	}
	
	public Comida() {
		
	}
	public String getNome() {
				
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	

}
