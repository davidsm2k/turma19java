//2- Faça um programa que entre com três números e coloque em ordem crescente.

package ExerciciosLista5;

import java.util.Random;

public class Lista05Exercicio02 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int maior = 0;
		int menor = 0;
		int meio = 0;
		
		//Sorteio aleatório sem repetição*****
		do {
			n1 = aleatorio.nextInt(9);
			n2 = aleatorio.nextInt(9);
			n3 = aleatorio.nextInt(9);
		}while(n1 == n2 || n1 == n3 || n2 == n3);
		//************************************
		
		//Achando Maior***********************
		if(n1 > n2) {
			maior = n1;
		}
		else if(n1 < n2) {
			maior = n2;
		}
		if(n3 > maior) {
			maior = n3;
		}
		//************************************
		
		//Achando Menor***********************
		if(n1 < n2) {
			menor = n1;
		}
		else if(n1 > n2) {
			menor = n2;
		}
		if(n3 < menor) {
			menor = n3;
		}	
		//************************************
		
		//Achando Meio************************
		if(n1 < maior && n1 > menor) {
			meio = n1;
		}
		else if(n2 < maior && n2 > menor) {
			meio = n2;
		}
		else if(n3 < maior && n3 > menor) {
			meio = n3;
		}
		//************************************
		
		System.out.printf("N1 = %d\nN2 = %d\nN3 = %d\n\n", n1, n2, n3);
		System.out.printf("%d / %d / %d ", menor, meio, maior);
	}
}
