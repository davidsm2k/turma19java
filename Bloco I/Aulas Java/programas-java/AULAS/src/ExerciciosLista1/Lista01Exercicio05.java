/*
 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.
*/

package ExerciciosLista1;

import java.util.Scanner;

public class Lista01Exercicio05 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3, media;
		
		System.out.println("Digite a nota 1: ");
		n1 = leia.nextDouble();

		System.out.println("Digite a nota 2: ");
		n2 = leia.nextDouble();
		
		System.out.println("Digite a nota 3: ");
		n3 = leia.nextDouble();
		
		media = (n1 * 0.2) + (n2 * 0.3) + (n3 * 0.5);
		
		System.out.printf("A média do aluno é: %.1f", media);
	}
}
