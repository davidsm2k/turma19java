/*
4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.
*/
package ExerciciosLista2;

import java.util.Scanner;

public class Lista02Exercicio04 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um Numero Inteiro: ");
		n = leia.nextInt();
		
		if(n == 0) {
			System.out.println("O numero " + n + " é NEUTRO.");
		}
		else if(n%2 == 0) {
			System.out.print("O numero " + n + " é PAR");
			if(n > 0){
				System.out.print(" e Positivo");
			}
			else {
				System.out.print(" e NEGATIVO.");
			}
		}
		else {
			System.out.print("O numero " + n + " é IMPAR");
			if(n > 0){
				System.out.print(" e Positivo");
			}
			else {
				System.out.print(" e NEGATIVO.");
			}
		}
	}
}