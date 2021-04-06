//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

package ExerciciosLista6;

import java.util.Scanner;

public class Lista06Exercicio02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int par = 0, impar = 0, numeros = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite o valor do %d numero: ", i+1);
			numeros = ler.nextInt();
			
			if(numeros == 0) {}
			else if((numeros%2) == 0) {
				par++;
			}else {
				impar++;
			}
		}
	
		System.out.printf("QUANTIDADE PARES: %d", par);
		System.out.printf("\nQUANTIDADE IMPARES: %d", impar);
	}
}