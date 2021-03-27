/*
1- Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e
apresente no final o total do somat�rio, a m�dia e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usu�rio fornecer um valor
negativo.
*/

package ExerciciosLista3;

import java.util.Scanner;

public class Lista03Exercicio03 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero = 0, soma = 0, media = 0, lido = 0;
		
		while(numero >= 0) {
			System.out.printf("Numeros informados: %d \n", lido);
			System.out.print("Digite um numero positivo: \n");
			numero = leia.nextInt();
			
			soma += numero;
			lido++;
		}
		
		media = soma/lido;
		
		System.out.printf("\nA soma dos valores �: %d \n", soma);
		System.out.printf("\nA m�dia deles �: %d", media);
		System.out.printf("\nForam lidos: %d numeros inteiros.", lido);
	}
}