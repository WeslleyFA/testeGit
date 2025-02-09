package weslley.br;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import weslley.br.models.Animal;

public class ResolucaoWeslley {
	public static void resolucaoEsperada() {
		System.out.println("*************************");
		
		Boolean cadastrarDenovo = true;
		List<Animal> animaisCadastrados = new ArrayList<>();
		
		while(cadastrarDenovo) {
			Scanner scaneiaTeclado = new Scanner(System.in);
			Animal animal = new Animal();
			
			System.out.println("Digite o nome do seu Animal: ");
			animal.setNome(scaneiaTeclado.next());
			
			System.out.println("Digite a raça do seu Animal: ");
			animal.setRaça(scaneiaTeclado.next());
			
			System.out.println("Digite a cor do seu Animal: ");
			animal.setCor(scaneiaTeclado.next());
			
			System.out.println("Digite a idade do seu Animal: ");
			animal.setIdade(scaneiaTeclado.nextInt());
			
			animaisCadastrados.add(animal);
			
			System.out.println("Seseja cadastrar outro animal: (S/N) ");
			String resposta = scaneiaTeclado.next();
			
			if(resposta.equals("s") || resposta.equals("S"))
				cadastrarDenovo = true;
			else if (resposta.equals("n") || resposta.equals("N"))
				cadastrarDenovo = false;
			else {
				System.out.println("Sua resposta foi inválida, deveria ser apenas a letra \"s\" ou \"n\", por conta disso, vou encarar como um não ;( \n");
				cadastrarDenovo = false;
			}		
		}
		
		System.out.println("Segue a lista dos animais cadastrados por vc :D \n");
		for(Animal animal: animaisCadastrados) {
			System.out.println(animal.toString());
			System.out.println("-----------");
		}
		System.out.println("*************** Fim do Programa****************");
		
	}
}
