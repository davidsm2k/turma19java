package ATIVIDADES_AULA;

import java.util.Scanner;

public class InversaoValores {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		
		System.out.println("***ANTES DA INVERS�O****");
		System.out.printf("Valor de A: %d\nValor de B: %d\n\n", a, b);
		
		//Usando 3 variaveis
		//c = a;
		//a = b;
		//b = c;
		
		//Usando 2 variaveis
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("***DEPOIS DA INVERS�O***");
		System.out.printf("Valor de A: %d\nValor de B: %d", a, b);
	}
}
