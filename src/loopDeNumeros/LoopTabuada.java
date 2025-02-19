package loopDeNumeros;

import java.util.Scanner;

public class LoopTabuada {
	public static void Main() {

		int valor;
		int multiplicador = 0 ; 
		int total = 0; 

		Scanner digitador = new Scanner(System.in);
	    System.out.println("Escreva o número: ");
	   
	    valor = digitador.nextInt(); 
	    
	    for (int i = 0; i < 10; i ++ ) {
	    	total = valor * ++multiplicador;
	    	System.out.println(valor + "x" + multiplicador + "=" + total);
	    }
	}
}
//feito com Klaudio
//arthur