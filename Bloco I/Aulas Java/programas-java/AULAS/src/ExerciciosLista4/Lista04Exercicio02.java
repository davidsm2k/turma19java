/*
2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.
*/

package ExerciciosLista4;

import java.util.Scanner;

public class Lista04Exercicio02 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int lancamento[] = new int[10];
		int soma = 0, maior = 0, numeroOcorrencia = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite o dado para o %d� lan�amento: ", i+1);
			lancamento[i] = leia.nextInt();
		}
		
		System.out.println("\n*** OCORR�NCIA ***\n");
		for(int y = 0; y < 10; y++) {
			System.out.printf("Lan�amento %d: %d \n", y+1 ,lancamento[y]);
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
		
		System.out.printf("\nM�dia das Ocorr�ncias: %d", soma/10);
		System.out.printf("\nQuantidade de Ocorr�ncias do maior valor: %d", numeroOcorrencia);
		System.out.printf("\nPontua��o da Maior Ocorr�ncia: %d", maior);
	}
}
