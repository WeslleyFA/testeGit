package weslley.br.models;

public class Jogo {
    private String nome;
    private int faixaEtaria;
    private double preco;

   
    public Jogo(String nome, int faixaEtaria, double preco) {
        this.nome = nome;
        this.faixaEtaria = faixaEtaria;
        this.preco = preco;
    }

 
    public Jogo() {}

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + nome + '\'' +
                ", faixaEtaria=" + faixaEtaria +
                ", preco=" + preco +
                '}';
    }
}