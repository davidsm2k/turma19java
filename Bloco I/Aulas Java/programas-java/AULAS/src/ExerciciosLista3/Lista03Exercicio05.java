/*
1- Faça um programa que mostre uma contagem na tela de 233 a 456, só que
contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
*/

package ExerciciosLista3;

public class Lista03Exercicio05 {
	public static void main(String[] args) {
		int n = 233;
		
		do {
			if(n > 300 && n < 400) {
				System.out.print(n + " + 3 = ");
				n += 3;
				System.out.println(n);
			}else {
				System.out.print(n + " + 5 = ");
				n += 5;
				System.out.println(n);
			}
		}while(n < 456);
	}
}