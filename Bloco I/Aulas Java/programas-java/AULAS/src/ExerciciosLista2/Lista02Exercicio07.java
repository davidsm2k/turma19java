/*
7) Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos
(positivos maiores que zero). Em caso afirmativo, calcular a �rea do tri�ngulo.
*/

package ExerciciosLista2;

import java.util.Scanner;

public class Lista02Exercicio07 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int l1, l2, l3;
		
		System.out.print("Digite um valor positivo para os lados de um triangulo\nLado 1: ");
		l1 = leia.nextInt();
		
		System.out.print("Lado 2: ");
		l2 = leia.nextInt();
		
		System.out.print("Lado 3: ");
		l3 = leia.nextInt();
		
		if(l1 > 0 && l2 > 0 && l3 > 0) {
			System.out.println("A area do triangulo �: " + (l1 + l2 + l3));
		}
		else {
			System.out.println("[OPERA��O INV�LIDO] - Um dos valores ou todos n�o s�o positivos.");
		}
	}
}
