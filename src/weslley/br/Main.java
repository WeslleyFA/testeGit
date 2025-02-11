package weslley.br;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import weslley.br.models.Pokemon;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String resposta = null;
		Boolean cadastrarPokemon = true;
		List<Pokemon> pokemonCadastrado = new ArrayList<>();

		while (cadastrarPokemon) {

			Pokemon pokemon = new Pokemon();

			System.out.println("Escreva o nome do seu pokemon: ");

			try {
				pokemon.setNome(teclado.next());
			} catch (Exception e) {
				System.out.println("O Nome do pokemon é inválido, digite novamente: ");
				Scanner scannerTry = new Scanner(System.in);
				pokemon.setNome(scannerTry.next());
			}
			System.out.println("Escreva qual o tipo do seu pokemon: ");

			try {
				pokemon.setTipo(teclado.next());
			} catch (Exception e) {
				System.out.println("O tipo do pokemon é inválido, digite novamente: ");
				Scanner scannerTry = new Scanner(System.in);
				pokemon.setTipo(scannerTry.next());
			}
			System.out.println("Escreva quantos pokemons desta espécie deseja cadastrar: ");

			try {
				pokemon.setQuantidade(teclado.nextInt());
			} catch (Exception e) {
				System.out.println("A quantidade de pokemons que deseja cadastrar é inválida, digite novamente: ");
				Scanner scannerTry = new Scanner(System.in);
				pokemon.setQuantidade(scannerTry.nextInt());
				teclado = new Scanner(System.in);
			}

			System.out.println("Escreva o nome do treinador deste pokemon: ");

			try {
				pokemon.setNomeDoTreinador(teclado.next());
			} catch (Exception e) {
				System.out.println("O nome do treinador que deseja cadastrar é inválido, digite novamente: ");
				Scanner scannerTry = new Scanner(System.in);
				pokemon.setNomeDoTreinador(scannerTry.next());

			}
			pokemonCadastrado.add(pokemon);

			System.out.println("Deseja cadastrar mais pokemons? (Sim/Não)");
			resposta = teclado.next();

			if (resposta.equalsIgnoreCase("Não") || resposta.equalsIgnoreCase("N")
					|| resposta.equalsIgnoreCase("Nao")) {
				cadastrarPokemon = false;

			}

			if (resposta.equalsIgnoreCase("Sim") || resposta.equalsIgnoreCase("S")) {
				cadastrarPokemon = true;

			}

		}

		System.out.println("Deseja ver os pokemons cadastrados? (Sim/Não)");
		resposta = teclado.next();

		if (resposta.equalsIgnoreCase("Sim") || resposta.equalsIgnoreCase("s")) {

			System.out.println("Pokemons cadastrados:");
			for (Pokemon pokemon : pokemonCadastrado) {
				System.out.println(pokemon);

			}
		}

		System.out.println("Deseja ver a quantidade pokemon totais?");
		resposta = teclado.next();

		if (resposta.equalsIgnoreCase("Sim") || resposta.equalsIgnoreCase("s")) {

			Integer quantidade = 0;
			for (Pokemon pokemon : pokemonCadastrado) {
				quantidade = quantidade + pokemon.getQuantidade();

			}

			System.out.println("A quantidade é: " + quantidade);

		}

	}

}
