package loopDeNumeros;

public class LoopDeMesDoAno {
    public static void main(String[] args) {
        String[] meses = { 
            "janeiro", "fevereiro", "março", "abril", "maio", "junho",
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };
        
        
        for(int i = 0; i<meses.length; i++) {
        	System.out.println(meses[i]);    //pesquisei esse length no chat gpt pois estava errado tanto a string e o sistem out print precisava do array
        }
    }
}

//arthur