/*
 1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias. 
 */

package ExerciciosLista1;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int anos , meses, dias, totalAnos;
		
		System.out.println("Digite quantos anos voc� tem: ");
		anos = leia.nextInt();
		

		System.out.println("Digite quantos meses voc� tem: ");
		meses = leia.nextInt();
		

		System.out.println("Digite quantos dias voc� tem: ");
		dias = leia.nextInt();
		
		System.out.printf("Voc� tem %d dias de vida ", calculo(anos, meses, dias));
	}
	
	public static int calculo(int anos, int meses, int dias) {
		int totalAnos, totalMeses, resultado; 
		
		final int QUANT_ANOS = 365;
		final int QUANT_MESES = 30;
				
		totalAnos = anos * QUANT_ANOS;
		totalMeses = meses * QUANT_MESES;

		resultado = totalAnos + totalMeses + dias;

		
		return resultado;
	}
	
}
