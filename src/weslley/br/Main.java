package weslley.br;

import weslley.br.models.Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa klaudio = new Pessoa();

		klaudio.setNome("Klaudio saddsdsd");
		klaudio.setIdade(20);
		klaudio.setSobreNome("Chan");

		System.out.println(klaudio.getNome());

	}

}