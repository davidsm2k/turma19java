/*
2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por
três (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário
digita 5, deveremos observar na tela a seguinte sequência: 5 15 45 135.
*/

package ExerciciosLista3;

import java.util.Scanner;

public class Lista03Exercicio04 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um numero: ");
		numero = leia.nextInt();
		
		System.out.print(numero + " ");
		while(numero <= 100) {
			numero *= 3;
			System.out.print(numero + " ");
		}
	}
}