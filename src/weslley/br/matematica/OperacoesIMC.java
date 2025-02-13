package weslley.br.matematica;

import java.util.Scanner;

public class OperacoesIMC {
	// ele vai mostrar um menu com duas opções, uma vai ser//
	// 1 - Descubra sua idade//
	// 2 - Descubra seu IMC//

	public static void descobrirIdade() {
		System.out.println("Qual a seu ano de nascimento?");
		int idade = teclado("ano");
		int anoAtual = 2025;
		System.out.println("A sua idade é: " + (anoAtual - idade));

	}

	private static Scanner s = new Scanner(System.in);

	private static int teclado(String rotulo) {
		return s.nextInt();
	}

	public static void descobrirImc() {
		System.out.println("Qual seu peso?");
		double peso = tecladoDouble("1");
		System.out.println("Qual a sua altura?");
		double altura = tecladoDouble("2");

		double descobrirImc = peso / (altura * altura);

		System.out.println("Seu IMC é: " + descobrirImc);
	}

	private static Scanner d = new Scanner(System.in);

	private static double tecladoDouble(String rotulo) {
		return d.nextDouble();
	}
}
