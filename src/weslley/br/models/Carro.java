package weslley.br.models;

public class Carro {
	private String modelo;
	private String marca;
	private Integer ano;
	
	public Carro(String modelo, String marca, Integer ano) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}
	
	public Carro(){
		
	}
	
	public Carro(Integer ano) {
		this.ano = ano;
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
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Carro: \n modelo: " + modelo + "\nmarca: " + marca + "\nano:" + ano + "";
	}
	
	
	
}
