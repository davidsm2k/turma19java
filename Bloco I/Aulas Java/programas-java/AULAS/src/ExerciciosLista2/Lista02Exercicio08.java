/*
8) Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100, 
caso contrário imprimi-la com o valor zero.
*/

package ExerciciosLista2;

import java.util.Scanner;

public class Lista02Exercicio08 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double n;
		
		System.out.println("Digite um valor: ");
		n = leia.nextDouble();
		
		if(n > 100) {
			System.out.println("O valor informado foi " + n);
		}else {
			n = 0.0;
			System.out.println("Valor é menor a 100.0 sendo assim ele se torna " + n);
		}
	}
}
