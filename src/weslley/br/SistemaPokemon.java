package weslley.br;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import weslley.br.models.Pokemon;

public class SistemaPokemon {
	
	Scanner teclado = new Scanner(System.in);
	
	public static void sistemaPokemon(){
		
		Scanner teclado = new Scanner(System.in);
		String resposta = null;
		Boolean cadastrarPokemon = true;
		List<Pokemon> pokemonsCadastrados = new ArrayList<>();

		while (cadastrarPokemon) {
			Pokemon pokemon = cadastrarPokemon(teclado);
			
			pokemonsCadastrados.add(pokemon);

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
		
		visualizaPokemon(pokemonsCadastrados, teclado);
		verQtdsPokemons(teclado, pokemonsCadastrados);
		
	}
	
	private static void verQtdsPokemons(Scanner teclado, List<Pokemon> pokemons) {
		System.out.println("Deseja ver a quantidade pokemon totais?");
		String resposta = teclado.next();

		if (resposta.equalsIgnoreCase("Sim") || resposta.equalsIgnoreCase("s")) {

			Integer quantidade = 0;
			for (Pokemon pokemon : pokemons) {
				quantidade = quantidade + pokemon.getQuantidade();

			}

			System.out.println("A quantidade é: " + quantidade);

		}
	}
	
	private static Pokemon cadastrarPokemon(Scanner teclado ) {
		Pokemon pokemon = new Pokemon();

		System.out.println("Escreva o nome do seu pokemon: ");

		try {
			pokemon.setNome(teclado.next());
		} catch (Exception e) {
			trataErro(pokemon, "O nome do pokemon que deseja cadastrar é inválido, digite novamente: ", teclado);
		}
		System.out.println("Escreva qual o tipo do seu pokemon: ");

		try {
			pokemon.setTipo(teclado.next());
		} catch (Exception e) {
			trataErro(pokemon, "O tipo que deseja cadastrar é inválido, digite novamente: ", teclado);
		}
		System.out.println("Escreva quantos pokemons desta espécie deseja cadastrar: ");

		try {
			pokemon.setQuantidade(teclado.nextInt());
		} catch (Exception e) {
			trataErro(pokemon, "A qtd que deseja cadastrar é inválido, digite novamente: ", teclado);
		}

		System.out.println("Escreva o nome do treinador deste pokemon: ");

		try {
			pokemon.setNomeDoTreinador(teclado.next());
		} catch (Exception e) {
			trataErro(pokemon, "O nome do treinador que deseja cadastrar é inválido, digite novamente: ", teclado);
		}
		
		return pokemon;
		
	}
	
	private static void visualizaPokemon(List<Pokemon> pokemons, Scanner teclado) {
		System.out.println("Deseja ver os pokemons cadastrados? (Sim/Não)");
		String resposta = teclado.next();

		if (resposta.equalsIgnoreCase("Sim") || resposta.equalsIgnoreCase("s")) {
			for (Pokemon p : pokemons) {
				System.out.println(p);
			}
		}
	}
	
	private static void trataErro(Pokemon pokemon, String msg, Scanner teclado) {
		System.out.println(msg);
		Scanner scannerTry = new Scanner(System.in);
		pokemon.setNomeDoTreinador(scannerTry.next());
		teclado = new Scanner(System.in);
	}

}
