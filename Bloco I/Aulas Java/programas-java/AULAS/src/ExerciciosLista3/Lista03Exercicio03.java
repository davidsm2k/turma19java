/*
1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
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
		
		System.out.printf("\nA soma dos valores é: %d \n", soma);
		System.out.printf("\nA média deles é: %d", media);
		System.out.printf("\nForam lidos: %d numeros inteiros.", lido);
	}
}