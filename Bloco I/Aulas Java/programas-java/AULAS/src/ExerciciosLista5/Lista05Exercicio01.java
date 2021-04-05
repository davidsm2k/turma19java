// 1- Faça um programa que receba três inteiros e diga qual deles é o maior.

package ExerciciosLista5;

import java.util.Random;

public class Lista05Exercicio01 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		int n1 = aleatorio.nextInt(9);
		int n2 = aleatorio.nextInt(9);
		int n3 = aleatorio.nextInt(9);
		int maior = 0;
		
		if(n1 > n2) {
			maior = n1;
		}
		else {
			maior = n2;
		}		
		if(n3 > maior) {
			maior = n3;
		}
		
		System.out.printf("N1 = %d\nN2 = %d\nN3 = %d\n", n1, n2, n3);
		System.out.printf("Numero maior: %d", maior);		
	}
}
