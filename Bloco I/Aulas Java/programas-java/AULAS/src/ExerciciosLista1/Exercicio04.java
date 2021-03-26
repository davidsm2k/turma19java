package ExerciciosLista1;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, d, r, s;

		System.out.println("Digite o valor A: ");
		a = leia.nextInt();

		System.out.println("Digite o valor B: ");
		b = leia.nextInt();

		System.out.println("Digite o valor C: ");
		c = leia.nextInt();

		r = (int) Math.pow(a + b, 2);

		s = (int) Math.pow(b + c, 2);

		d = (r + s) / 2;

		System.out.printf("R => %d", r);
		System.out.printf("\nS => %d", s);
		System.out.printf("\nO resultado de D = R + S / 2 é: %d", d);
	}
}