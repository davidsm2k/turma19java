/*
5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
*/
package ExerciciosLista6;

import java.util.Scanner;

public class Lista06Exercicio05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int totalNumeros = 0;
		
		System.out.println("*** PROGRAMA INICIADO *** (Para finaliza-lo digite 0)\n");
		do {
			System.out.print("Digite um numero: ");
			numero = entrada.nextInt();
			
			totalNumeros+= numero;
		}while(numero != 0);
		PulaLinha();
		System.out.printf("Soma dos numeros digitados: %d\n\n", totalNumeros);
		
		System.out.print("*** PROGRAMA FINALIZADO ***");
	}
	
	private static void PulaLinha() {
		System.out.println("************************\n");
	}
}