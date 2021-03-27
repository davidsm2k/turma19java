/*
2- Faça um programa que pegue um número do teclado e calcule a soma de todos os
números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
1+2+3+4+5+6+7=28.
*/

package ExerciciosLista3;

import java.util.Scanner;

public class Lista03Exercicio06 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, contador = 1, result = 0;
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		
		do {
			result = result + contador;
			
			contador++;
			System.out.println(result + " ");
		}while(contador <= numero);
		
		System.out.println("Total: " + result);
	}
}
