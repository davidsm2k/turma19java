/*
 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
*/
package ExerciciosLista1;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double valorCarro, dis, imp, valorFinal;
		
		System.out.println("Digite o custo de fabrica do carro: ");
		valorCarro = leia.nextDouble();
		
		dis = valorCarro * 0.28;
		imp = valorCarro * 0.45;

		valorFinal = valorCarro + dis + imp;
		
		System.out.printf("Valor do Carro: R$ %.2f "
						+ "\nValor do Distribuidor: R$ %.2f"
						+ "\nValor Imposto: R$ %.2f"
						+ "\nCusto ao Consumidor: R$ %.2f"
						,valorCarro,dis,imp,valorFinal);		
	}
}
