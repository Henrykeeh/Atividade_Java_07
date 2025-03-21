package lista_1_EX_2;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);
		int somaInteiros = 0, tamanhoVetor = 0;
		float mediaInteiros = 0;
		int vetorPares[] = new int[10];
		int vetorInteiros[] = new int[10];

		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println("Digite o " + (i + 1) + " valor do vetor: ");
			vetorInteiros[i] = lerScanner.nextInt();
			somaInteiros = somaInteiros + vetorInteiros[i];
			tamanhoVetor = tamanhoVetor +1;
			if (vetorInteiros[i] % 2 == 0) {
				vetorPares[i] = vetorInteiros[i];
			} 
		}
		mediaInteiros = (float) somaInteiros / tamanhoVetor;
		System.out.println("Os números nos índices ímpares do vetor são: ");
		System.out.println(vetorInteiros[1]+ "  "+ vetorInteiros[3] + "  "+ vetorInteiros[5] + "  "+ vetorInteiros[7]+ "  " + vetorInteiros[9]);

		
		System.out.println("Os números pares do vetor são: ");
		
		for(int i = 0; i < vetorPares.length; i++) {
			if (vetorPares[i] != 0) {
				System.out.print(vetorPares[i] + "  ");
			}
			
		}
		
		System.out.println("\nA Soma de todos os elementos do vetor é: "+ somaInteiros);
		System.out.printf("A média dos elementos do vetor é: %.2f", mediaInteiros);
	}

}
