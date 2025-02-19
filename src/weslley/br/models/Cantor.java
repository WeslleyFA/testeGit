package weslley.br.models;

public class Cantor {
 
	private Integer idade;
	private String estiloMusical;
	private String nome;
	private String instrumento;
	private Boolean vivo;
	
	 public Cantor(){
	 }
	
	public Cantor(Integer idade, String estiloMusical, String nome, String instrumento, Boolean vivo) {
		this.idade = idade;
		this.estiloMusical = estiloMusical;
		this.nome = nome;
		this.instrumento = instrumento;
		this.vivo = vivo;
	}
	public Integer getIdade() {
		return idade;
		
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getEstiloMusical() {
		return estiloMusical;
	}
	public void setEstiloMusical(String estiloMusical) {
		this.estiloMusical = estiloMusical;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getInstrumento() {
		return instrumento;
	}
	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}
	public Boolean getVivo() {
		return vivo;
	}
	public void setVivo(Boolean vivo) {
		this.vivo = vivo;
	}

	@Override
	public String toString() {
		return "Cantor [idade=" + idade + ", estiloMusical=" + estiloMusical + ", nome=" + nome + ", instrumento="
				+ instrumento + ", vivo=" + vivo + "]";
	}
	
	
	
}
