/*
2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
*/

package ExerciciosLista4;

import java.util.Scanner;

public class Lista04Exercicio02 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int lancamento[] = new int[10];
		int soma = 0, maior = 0, numeroOcorrencia = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite o dado para o %dº lançamento: ", i+1);
			lancamento[i] = leia.nextInt();
		}
		
		System.out.println("\n*** OCORRÊNCIA ***\n");
		for(int y = 0; y < 10; y++) {
			System.out.printf("Lançamento %d: %d \n", y+1 ,lancamento[y]);
			soma += lancamento[y];
			if(lancamento[y] > maior) {
				maior = lancamento[y];
			}
		}
		for(int l = 0; l < 10; l++) {
			if(maior == lancamento[l]) {
				numeroOcorrencia++;
			}
		}
		
		System.out.printf("\nMédia das Ocorrências: %d", soma/10);
		System.out.printf("\nQuantidade de Ocorrências do maior valor: %d", numeroOcorrencia);
		System.out.printf("\nPontuação da Maior Ocorrência: %d", maior);
	}
}
