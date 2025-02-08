package weslley.br;

import weslley.br.models.Animal;
import weslley.br.models.Cachorro;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		List<Animal> animaisList = new ArrayList<>();

		Animal toto = new Animal("Toto", "Viralata", "Caramelo", 3);
		animaisList.add(toto);

		Animal tubarao = new Animal("Tubarão", "Viralata", "Branco com manchas pretas", 6);
		animaisList.add(tubarao);

		Animal chico = new Animal("Chico", "Viralata", "Preto", 10);
		animaisList.add(chico);

		Animal loro = new Animal("Loro", 20);
		animaisList.add(loro);

		Cachorro cachorro = new Cachorro("Joao", "Poodle", "Branco", 10);

		cachorro.getNome();

		for (Animal animal : animaisList) {
			System.out.println(animal.toString());
		}	
	}
	
}
