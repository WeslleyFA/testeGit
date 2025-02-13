package weslley.br.matematica;

import java.util.Scanner;

public class OperacoesIdadeIMC {

	public static void idade() {
		System.out.println("Digite o ano do seu nascimento: ");
		int numero1 = teclado("Ano");
		int numero2 = 2025;
		System.out.println("A sua idade é: " + (numero2 - numero1));
	}
	
	private static Scanner s = new Scanner(System.in);
	private static int teclado(String rotulo) {
		return s.nextInt();
	}

	private static double tecladoDouble(String rotulo) {
		return s.nextDouble();
	}

	public static void imc() {
		System.out.println("Digite seu peso (Exemplo: 94,300): ");
		double peso = tecladoDouble("1");
		System.out.println("Digite sua altura (Exemplo: 1,90): ");
		double altura = tecladoDouble("2");
		
		double imc = peso / (altura * altura);
		System.out.println("Seu IMC é: " + imc);

	}

}
