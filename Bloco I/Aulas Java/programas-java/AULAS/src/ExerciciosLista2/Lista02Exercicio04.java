/*
4) Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se este
n�mero � par ou �mpar, e se � positivo ou negativo.
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
			System.out.println("O numero " + n + " � NEUTRO.");
		}
		else if(n%2 == 0) {
			System.out.print("O numero " + n + " � PAR");
			if(n > 0){
				System.out.print(" e Positivo");
			}
			else {
				System.out.print(" e NEGATIVO.");
			}
		}
		else {
			System.out.print("O numero " + n + " � IMPAR");
			if(n > 0){
				System.out.print(" e Positivo");
			}
			else {
				System.out.print(" e NEGATIVO.");
			}
		}
	}
}