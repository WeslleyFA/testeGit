package weslley.br;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import weslley.br.models.Produto;

public class ResolucaoKlaudioProduto {
	public static void iniciarResolucao() {

		String resposta;
		Boolean cadastrarProduto = true;
		List<Produto> produtosAdicionados = new ArrayList<>();
		Scanner scannerTeclado = new Scanner(System.in);

		while (cadastrarProduto) {
			Produto produto = new Produto();

			System.out.println("Nome do produto que deseja cadastrar:");

			try {
				produto.setNome(scannerTeclado.next());
			} catch (Exception e) {
				System.out.println("O Nome do produto é inválido, digite novamente: ");
				Scanner scannerTry = new Scanner(System.in);
				produto.setNome(scannerTry.next());
			}
			System.out.println("Valor do produto que deseja cadastrar:");

			try {
				produto.setValor(scannerTeclado.nextDouble());
			} catch (Exception e) {
				System.out.println("O valor digitado é inválido, digite novamnete: ");
				Scanner scannerTry = new Scanner(System.in);
				produto.setValor(scannerTry.nextDouble());
			}

			System.out.println("Qual a quantidade de produto que deseja cadastrar:");

			try {
				produto.setQuantidade(scannerTeclado.nextInt());
			} catch (InputMismatchException e) {
				System.out.println("Valor digitado é inválido, digite novamente: ");
				Scanner scannerTry = new Scanner(System.in);
				produto.setQuantidade(scannerTry.nextInt());
			}

			produtosAdicionados.add(produto);

			System.out.println("Deseja ver a lista? (Sim/Não)");
			resposta = scannerTeclado.next();

			if (resposta.equalsIgnoreCase("Sim") || resposta.equalsIgnoreCase("S")) {
				cadastrarProduto = false;

			} else if ((resposta.equalsIgnoreCase("Não") || resposta.equalsIgnoreCase("N")))
				cadastrarProduto = true;

		}

		System.out.println("Cadastro concluido.");

		System.out.println("\nLsita de Produtos Cadastrados");

		for (Produto produtoSelecionado : produtosAdicionados) {
			System.out.println(produtoSelecionado.toString());
		}

	}
	
	

}
