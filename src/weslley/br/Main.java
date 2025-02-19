package weslley.br;

import loopDeNumeros.LoopDeNumerosImparesEPares;
import loopDeNumeros.LoopTabuada;
import weslley.br.models.Cantor;
import weslley.br.models.Jogo; 

public class Main {
    public static void main(String[] args) {

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