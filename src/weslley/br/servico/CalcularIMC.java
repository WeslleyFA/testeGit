package weslley.br.servico;

import java.util.Scanner;
import weslley.br.matematica.OperacoesIMC;

public class CalcularIMC {

	public static void resolucaoCalcular() {
		Scanner teclado = new Scanner(System.in);
		boolean continuar = true;

		while (continuar) {
			System.out.println("Escolha uma opção!");
			System.out.println("Escreva 1 para ver sua idade!");
			System.out.println("Escreva 2 para ver seu IMC!");

			int resposta = teclado.nextInt();

			if (resposta == 1) {
				OperacoesIMC.descobrirIdade();
			} else if (resposta == 2) {
				OperacoesIMC.descobrirImc();
			} else {
				System.out.println("Operação inválida!");
			}

			System.out.println("Deseja refazer o teste ou sair?");
			System.out.println("1 - Refazer");
			System.out.println("2 - Sair");

			int opcao = teclado.nextInt();
			if (opcao == 2) {
				continuar = false;
				System.out.println("Saindo...");
			}
		}

		teclado.close();
	}
}