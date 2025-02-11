package weslley.br.matematica;

import java.util.Scanner;

public class OperacoesMatematicas {

	public static void somar() {
		System.out.println("******SOMAR*********");
		int numero1 = capturaTeclado("1");
		int numero2 = capturaTeclado("2"); 
		System.out.println("O resultado é "+ (numero1 + numero2));
	}
	
	public static void dividir() {
		System.out.println("******DIV*********");
		int numero1 = capturaTeclado("1");
		int numero2 = capturaTeclado("2"); 
		System.out.println("O resultado é "+ numero1 / numero2);
	}
	
	public static void subtrair() {
		System.out.println("******SUB*********");
		int numero1 = capturaTeclado("1");
		int numero2 = capturaTeclado("2"); 
		System.out.println("O resultado é "+ (numero1 - numero2));
	}
	
	public static void mult() {	
		System.out.println("******MULT*********");
		int numero1 = capturaTeclado("1");
		int numero2 = capturaTeclado("2"); 
		System.out.println("O resultado é "+ numero1 * numero2);
	}
	
	private static Integer capturaTeclado(String rotulo) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um numero " + rotulo +":" );
		return s.nextInt();
	}
}
