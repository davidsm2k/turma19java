/*
7. Um sistema de equações lineares do tipo:

, pode ser resolvido segundo mostrado abaixo :

 

Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y. 
*/

package ExerciciosLista1;

import java.util.Scanner;

public class Lista01Exercicio07 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = leia.nextDouble();
		
		System.out.println("Digite o valor de D: ");
		d = leia.nextDouble();
		
		System.out.println("Digite o valor de E: ");
		e = leia.nextDouble();
		
		System.out.println("Digite o valor de F: ");
		f = leia.nextDouble();
		
		x = ( (c+e) - (b+f) ) / ( (a+e) - (b+d) );
		y = ( (a+f) - (c+d) ) / ( (a+e) - (b+d) );
		
		System.out.printf("O valor de X é %.2f", x);
		System.out.printf("\nO valor de Y é %.2f", y);
	}
}