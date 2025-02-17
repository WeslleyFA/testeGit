package weslley.br;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
<<<<<<< HEAD
	
		ExercicioLoop.Loop();
=======

		for (int sapo = 0; sapo < 2; sapo++) {

			System.out.println("digite um nuemro :");
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			System.out.println("o numero é :" + n);

		}

		int i = 0;
		String valor = "sapo";
		Scanner s = new Scanner(System.in);

		while (valor.equals("sapo")) {

			System.out.println("altera o valor do sapo:");
			valor = s.next();

		}
>>>>>>> aabdb6116af10273acb113a8c685272bb70a6600
		
		Integer mes =  6;
		
		switch(mes) {
		case 1:
			System.out.println("janeiro");
			System.out.println("Oi");
			break;
		case 2:
			System.out.println("faveiro");
			break;
		
		case 3:
		System.out.println("março");
		break;
		
		case 4:
			System.out.println("abr");
			break;
			
		case 5:
			System.out.println("mai");
			break;
			
		case 6:
			System.out.println("jun");
			break;
			
		case 7:
			System.out.println("jul");
			break;
			
		case 8:
			System.out.println("ago");
			break;
			
		case 9:
			System.out.println("set");
			break;
			
		case 10:
			System.out.println("out");
			break;
			
		case 11:
			System.out.println("nov");
			break;
			
		case 12:
			System.out.println("dez");
			break;
		}

	}

}
