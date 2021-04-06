/*
6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE) 
*/
package ExerciciosLista6;

import java.util.Scanner;

public class Lista06Exercicio06 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double numero = 0;
		double totalNumeros = 0;
		int contador = 0;

		System.out.println("*** PROGRAMA INICIADO *** (Para finaliza-lo digite 0)\n");
		do {
			System.out.print("Digite um numero: ");
			numero = leia.nextDouble();
			
			if( (numero % 3) == 0) {
				totalNumeros += numero;
				contador++;
			}
			
		} while (numero != 0);
		PulaLinha();
		System.out.printf("Média dos numeros digitados multiplos de 3: %.1f\n\n", (totalNumeros/contador));
		System.out.print("*** PROGRAMA FINALIZADO ***");
	}

	private static void PulaLinha() {
		System.out.println("************************\n");
	}
}