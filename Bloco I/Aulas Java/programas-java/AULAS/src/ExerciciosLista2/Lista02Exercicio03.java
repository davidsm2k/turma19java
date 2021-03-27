/*
3) Desenvolva um sistema em que:
 Leia 4 (quatro) números;
 Calcule o quadrado de cada um;
 Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
 Caso contrário, imprima os valores lidos e seus respectivos quadrados.

*/
package ExerciciosLista2;

import java.util.Scanner;

public class Lista02Exercicio03 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3, n4;
		
		System.out.println("informe o numero 1: ");
		n1 = leia.nextInt();
		
		System.out.println("informe o numero 2: ");
		n2 = leia.nextInt();
		
		System.out.println("informe o numero 3: ");
		n3 = leia.nextInt();
		
		System.out.println("informe o numero 4: ");
		n4 = leia.nextInt();
		
		if((n3*n3) >= 1000) {
			System.out.println("O valor do numero 3 é: " + n3);
			System.out.println("\nE seu valor quadrado é: " + n3*n3);
		}else {
			System.out.println("Valor 1: "+ n1 +" seu quadrado é " + n1*n1);
			System.out.println("\nValor 2: "+ n2 +" seu quadrado é " + n2*n2);
			System.out.println("\nValor 3: "+ n3 +" seu quadrado é " + n3*n3);
			System.out.println("\nValor 4: "+ n4 +" seu quadrado é " + n4*n4);
		}
	}
}
