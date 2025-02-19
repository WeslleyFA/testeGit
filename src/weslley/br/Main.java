package weslley.br;

<<<<<<< HEAD
import loopDeNumeros.LoopDeNumerosImparesEPares;
import loopDeNumeros.LoopTabuada;
import weslley.br.models.Cantor;
import weslley.br.models.Jogo; 
=======
import java.util.Scanner;

import weslley.br.models.Comida;
>>>>>>> b4efa5dc30a313426e715bce20aab0ea744b8029

public class Main {
    public static void main(String[] args) {

<<<<<<< HEAD
     Cantor cantor = new Cantor(50, "POP", "Michael Jackson", "Nenhum", false);
     System.out.println(cantor);
         	
     
     Cantor cantor2 = new Cantor();
     cantor2.setNome("Hanna Montana");
     cantor2.setIdade(14);
     cantor2.setEstiloMusical("POP");
     cantor2.setInstrumento("Vocal");
     cantor2.setVivo(true);
     
     System.out.println(cantor2);
     
     
     Cantor cantor3 = new Cantor (54, "MPB","Chico Boarque","VIOLAO", true);
     System.out.println(cantor3);
    }
}
=======
	public static void main(String[] args) {

		Comida comida = new Comida("Lasanha", 490.00, "Salgado");

		System.out.println("====================");

		Comida pizza = new Comida();

		pizza.setNome("Pizza");
		pizza.setPeso(500.00);
		pizza.setTipo("Salgado");
		System.out.println(pizza);

		Comida acai = new Comida("Açai", 500.00, "Doce");
		
		

	}
}
>>>>>>> b4efa5dc30a313426e715bce20aab0ea744b8029
