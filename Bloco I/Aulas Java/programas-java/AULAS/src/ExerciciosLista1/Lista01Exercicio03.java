/*
3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
1 hora = 60 min = 1 minuto = 60 segundos = 3600 segundos
*/

package ExerciciosLista1;

import java.util.Scanner;

public class Lista01Exercicio03 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double tempoDuracao, horas, minutos, segundos;
		
		System.out.println("Digite o tempo de duração do evento em segundos: ");
		tempoDuracao = leia.nextDouble();
		
		horas = tempoDuracao / 3600;
		minutos = (tempoDuracao % 3600) / 60;
		segundos = (tempoDuracao % 3600) % 60;
		
		System.out.printf("Hora[s]: %.0f\nMinuto[s]: %.0f\nSegundo[s]: %.0f", horas, minutos, segundos);
	}
}
