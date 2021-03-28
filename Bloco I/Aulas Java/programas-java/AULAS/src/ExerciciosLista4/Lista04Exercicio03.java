/*
3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
*/

package ExerciciosLista4;

import java.util.Random;

public class Lista04Exercicio03 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		int n1[][] = new int[4][6];
		int n2[][] = new int[4][6];
		int m1[][] = new int[4][6];
		int m2[][] = new int[4][6];
		int numero, diferenca;
		
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				numero = aleatorio.nextInt(9);
				n1[l][c] = numero;
				numero = aleatorio.nextInt(9);
				n2[l][c] = numero;
			}
		}
		
		System.out.println("\n*** MATRIZ N1 ***\n");
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.print(n1[l][c] + " | ");
			}
			System.out.println(" ");
		}
		
		System.out.println("\n*** MATRIZ N2 ***\n");
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.print(n2[l][c] + " | ");
			}
			System.out.println(" ");
		}
		
		System.out.println("\n*** MATRIZ SOMA ***\n");
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				m1[l][c] = n1[l][c] + n2[l][c];
				System.out.print(m1[l][c] + " | ");
			}
			System.out.println(" ");
		}
		
		System.out.println("\n*** MATRIZ DIFERENÇA ***\n");
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				m2[l][c] = n1[l][c] - n2[l][c];
				if(m2[l][c] < 0){// converter numero negativo para positivo
					m2[l][c] *= -1;
				}
				System.out.print(m1[l][c] + " | ");
			}
			System.out.println(" ");
		}
	}
}
