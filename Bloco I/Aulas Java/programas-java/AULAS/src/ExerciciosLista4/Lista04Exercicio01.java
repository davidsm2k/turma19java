/*
1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
*/

package ExerciciosLista4;

import java.util.Scanner;

public class Lista04Exercicio01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int pontuacoes[] = new int[5];
		int maior = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Digite o valor da %dº pontução: ", i+1);
			pontuacoes[i] = leia.nextInt();
		}
		
		System.out.println("\n*** LISTA DE PONTOS ***\n");
		for(int j = 0; j < 5; j++) {
			System.out.printf("Pontuação nº %d: %d \n", j+1, pontuacoes[j]);
			if(pontuacoes[j] > maior) {
				maior = pontuacoes[j];
			}
		}
		System.out.printf("\nA pontuação maior é %d", maior);
	}
}
