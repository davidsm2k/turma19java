/*
4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
*/

package ExerciciosLista5;

import java.util.Scanner;

public class Lista05Exercicio04 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		
		if(numero == 0) {
			System.out.println("Numero NEUTRO.");
		}
		else if((numero%2 == 0)) {
			System.out.printf("O numero %d é PAR ", numero,"\n");
			System.out.printf("Sua Raiz Quadrada é %.1f", Math.sqrt(numero));
		}
		else if((numero%2 == 1)) {
			System.out.printf("O numero %d é IMPAR ", numero,"\n");
			System.out.printf("Elevado ao Quadrado fica %.1f", Math.pow(numero,2));
		}
	}
}