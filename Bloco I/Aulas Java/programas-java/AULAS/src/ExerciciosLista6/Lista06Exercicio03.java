/*
3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
*/
package ExerciciosLista6;

import java.util.Scanner;

public class Lista06Exercicio03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade = 0;
		int menos21 = 0;
		int mais50 = 0;
		char continuar;
		
		while(idade != -99) {
			System.out.print("Informe uma idade: ");
			idade = ler.nextInt();
			
			if(idade < 21) menos21++;
			if(idade > 50) mais50++;
			
			System.out.print("Deseja Continuar S-sim ou N-não?\nResposta: ");
			continuar = ler.next().toUpperCase().charAt(0);
			
			if(continuar == 'N') idade = -99;
			System.out.println("****************************************************");
		}
		System.out.printf("Total de pessoas com menos de 21 anos: %d \n", menos21);
		System.out.printf("Total de pessoas com mais de 50 anos: %d", mais50);
	}
}
