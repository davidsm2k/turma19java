/*
1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
*/

package ExerciciosLista4;

import java.util.Scanner;

public class Lista04Exercicio01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int pontuacoes[] = new int[5];
		int maior = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Digite o valor da %d� pontu��o: ", i+1);
			pontuacoes[i] = leia.nextInt();
		}
		
		System.out.println("\n*** LISTA DE PONTOS ***\n");
		for(int j = 0; j < 5; j++) {
			System.out.printf("Pontua��o n� %d: %d \n", j+1, pontuacoes[j]);
			if(pontuacoes[j] > maior) {
				maior = pontuacoes[j];
			}
		}
		System.out.printf("\nA pontua��o maior � %d", maior);
	}
}
