/*
2- Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar ele por
tr�s (imprimindo o novo valor) at� que ele seja maior do que 100. Ex.: se o usu�rio
digita 5, deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135.
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