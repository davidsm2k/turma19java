/*
6. Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula

que efetua tal cálculo é: 
 */

package ExerciciosLista1;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double x1,y1, x2, y2, totalSoma, d;
		
		System.out.println("Digite o ponto x1: ");
		x1 = leia.nextDouble();
		
		System.out.println("Digite o ponto y1: ");
		y1 = leia.nextDouble();
		
		System.out.println("Digite o ponto x2: ");
		x2 = leia.nextDouble();
		
		System.out.println("Digite o ponto y2: ");
		y2 = leia.nextDouble();
		
		totalSoma = (Math.pow((x2)-(x1), 2.0)) + (Math.pow((y2)-(y1), 2.0));
		
		d = Math.sqrt(totalSoma);
		
		System.out.printf("Resultado: %.2f", d);
	}
}
