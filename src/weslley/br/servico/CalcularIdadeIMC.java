package weslley.br.servico;

import java.util.Scanner;

import weslley.br.matematica.OperacoesIdadeIMC;

public class CalcularIdadeIMC {

	public static void calcular() {
		Scanner teclado = new Scanner(System.in);
		Boolean deveContinuar = true;

		while (deveContinuar) {
			System.out.println("-----------------------");
			System.out.println("Escolha uma opção: ");
			System.out.println("1 - Descorbrir a sua idade ");
			System.out.println("2 - Calcular seu IMC ");
			System.out.println("-----------------------");

			Integer resposta = teclado.nextInt();

			if (resposta == 1) {
				OperacoesIdadeIMC.idade();
			} else if (resposta == 2) {
				OperacoesIdadeIMC.imc();
			} else {
				System.out.println("Resposta incorreta meu chapa.");
			}
			
			System.out.println("Deseja continuar ou encerrar? ");
			String resposta2 = teclado.next();

			if (resposta2.equalsIgnoreCase("Continuar"))
				deveContinuar = true;
			else {
				deveContinuar = false;
				System.out.println("------------Fim------------");
			}
		}
	}
}
