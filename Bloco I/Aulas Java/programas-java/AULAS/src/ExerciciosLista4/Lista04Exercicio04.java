/*
4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
*/

package ExerciciosLista4;

import java.util.Random;

public class Lista04Exercicio04 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		int matriz[][] = new int[3][3];
		int totalDiagonal = 0;
		int numero;
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				numero = aleatorio.nextInt(9);
				matriz[linha][coluna] = numero;
				if(linha == coluna){
					totalDiagonal = totalDiagonal + matriz[linha][coluna];
				}
			}
		}
		
		System.out.println("\n*** FORMA DE MATRIZ ***\n");
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++){
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println(" ");
		}
		System.out.print("\nTotal da Diagonal: " + totalDiagonal);
	}
}