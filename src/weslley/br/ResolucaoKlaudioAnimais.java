package weslley.br;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import weslley.br.models.Animal;

public class ResolucaoKlaudioAnimais {
	
	public static void resultadoKlaudioAnimais() {
		Animal animal = new Animal();
		Scanner teclado = new Scanner(System.in);
		String resposta;
		Boolean continuarCadastrando = true;
		List<Animal> animais = new ArrayList<>();

		while (continuarCadastrando) {

			System.out.println("Escreva o nome do seu animal:");
			animal.setNome(teclado.next());

			System.out.println("Escreva a raça do seu animal:");
			animal.setRaça(teclado.next());

			System.out.println("Escreva a cor do seu animal:");
			animal.setCor(teclado.next());

			System.out.println("Escreva a idade do seu animal:");
			animal.setIdade(teclado.nextInt());

			animais.add(animal);

			System.out.println("Você deseja continuar cadastrando? (s/n)");
			resposta = teclado.next();

			if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("Sim")) {
				continuarCadastrando = true;

			} else if (resposta.equalsIgnoreCase("n") || resposta.equalsIgnoreCase("Não")) {
				continuarCadastrando = false;

			} else {
				System.out.println("Sua resposta está incorreta.\nProjeto encerrado, aqui está o cadastro.");
				continuarCadastrando = false;
			}

		}

		for (Animal animalSelecionado : animais) {
			System.out.println(animalSelecionado);
		}
	}

}
