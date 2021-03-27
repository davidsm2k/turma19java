/*
2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são
múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
*/

package ExerciciosLista3;

public class Lista03Exercicio02 {
	public static void main(String[] args) {
		int soma = 0;
		System.out.println("Numeros encontrados: ");
		
		for(int i = 0; i <= 500; i++) {
			if(i % 2 != 0 && i % 3 == 0) {
				soma += i;
				System.out.print(i + " ");
			}
		}
		System.out.print("\nTotal: " + soma);
	}
}
