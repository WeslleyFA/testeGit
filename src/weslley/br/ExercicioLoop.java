package weslley.br;

public class ExercicioLoop {
	public static void Loop() {

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 1) {
				System.out.println(i);

			}
		}
		System.out.println("----------------");
		String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };

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
		
		
	}
}
