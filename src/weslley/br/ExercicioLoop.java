package weslley.br;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioLoop {
	public static void loop() {

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 1) {
				System.out.println(i);

			}
		}
		
		System.out.println("----------------");
		List<String> meses = new ArrayList<>();
		
        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");
        meses.add("Julho");
        meses.add("Agosto");
        meses.add("Setembro");
        meses.add("Outubro");
        meses.add("Novembro");
        meses.add("Dezembro");

        for (String mes : meses) {
            System.out.println(mes);

		}
		System.out.println("----------------");

		for (int i = 2; i <= 100; i++) {
			boolean ehPrimo = true;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					ehPrimo = false;
				}
			}
			if (ehPrimo) {
				System.out.println(i);
			}
		}

		System.out.println("----------------");

		int valorUsuario;
		int multiplicador = 0;
		int total = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero para ver a tabuada: ");
		valorUsuario = teclado.nextInt();

		for (int i = 0; i < 10; i++) {
			total = valorUsuario * ++multiplicador;
			System.out.println(valorUsuario + " x " + multiplicador + " = " + total);
		}

	}
}
