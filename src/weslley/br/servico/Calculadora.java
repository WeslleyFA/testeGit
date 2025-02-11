package weslley.br.servico;

import java.util.Scanner;

import weslley.br.matematica.OperacoesMatematicas;

public class Calculadora {

	public static void calcular() {
		Scanner teclado = new Scanner(System.in);
		Boolean continuarRespondendo = true;
		
		while(continuarRespondendo) {
			System.out.println("***********************************************");
			System.out.println("* Escola sua operação: ");
			System.out.println("* 1 - Somar ");
			System.out.println("* 2 - Dividir ");
			System.out.println("* 3 - Subtrair ");
			System.out.println("* 4 - Multiplicar ");
			System.out.println("***********************************************");
			
			
			Integer opcaoSelecionada = teclado.nextInt();
			
			if(opcaoSelecionada == 1 ) {
				OperacoesMatematicas.somar();
			} else if(opcaoSelecionada == 2 ) {
				OperacoesMatematicas.dividir();
			}else if(opcaoSelecionada == 3 ) {
				OperacoesMatematicas.subtrair();
			}else if(opcaoSelecionada == 4 ) {
				OperacoesMatematicas.mult();
			} else {
				System.out.println("Voce viajou amigo >:( ");
			}
			
			System.out.println("Continuar ? (s/n)");
			String resp = teclado.next();
			
			if(resp.equalsIgnoreCase("s") || resp.equalsIgnoreCase("sim") )
				continuarRespondendo = true;
			else {
				continuarRespondendo = false;
				System.out.println("******************** FINALIZADO*****************");
			}
		}	
	}
}
