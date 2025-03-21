package lista_1_EX_1;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);

		int localizador;
		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		boolean encontrado = false;
		System.out.println("Digite um número para localizá-lo no vetor: ");
		localizador = lerScanner.nextInt();

		for (int i = 0; i < vetorInteiros.length; i++) {
			if (localizador == vetorInteiros[i]) {
				System.out.println("O número " + localizador + " está localizado na posição " + i + " do vetor!");
				encontrado = true;
				break;
			}
		}
		if (encontrado != true) {
			System.out.println("O número " + localizador + " não foi encontrado no vetor!");
		}

	}

}
