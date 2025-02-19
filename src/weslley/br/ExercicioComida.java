package weslley.br;

import weslley.br.models.Comida;

public class ExercicioComida {

    public static void main(String[] args) {
        
        Comida comida = new Comida("Lasanha", 490.00, "Salgado");
        System.out.println("====================");
        System.out.println(comida);

        Comida pizza = new Comida();
        pizza.setNome("Pizza");
        pizza.setPeso(500.00);
        pizza.setTipo("Salgado");
        System.out.println(pizza);

        Comida acai = new Comida("Açai", 500.00, "Doce");
        System.out.println(acai);
    }
}
