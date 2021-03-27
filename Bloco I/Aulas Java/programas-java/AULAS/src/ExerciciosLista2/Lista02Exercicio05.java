/*
5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são 
altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice 
 para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o índice crescer para 
 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5 
 todos os grupos devem ser notificados a paralisarem suas atividades. Faça um sistema que leia o índice de 
 poluição medido e emita a notificação adequada aos diferentes grupos de empresas.
*/

//0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades
//crescer para  0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades
//se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades

package ExerciciosLista2;

import java.util.Scanner;

public class Lista02Exercicio05 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double indicePoluicao;
		
		System.out.println("Digite o Indice de Poluição: ");
		indicePoluicao = leia.nextDouble();
		
		if(indicePoluicao < 0.30) { //desde 0.00 até 0.29
			System.out.println("Tudo Ok.\n[Limite aceitavel]");
		}else if(indicePoluicao < 0.40) {//desde 0.30 até 0.39
			System.out.println("ATENÇÃO!!!\nIndustrias do 1º GRUPO suspendam suas atividades !");
		}else if(indicePoluicao < 0.50) {//desde 0.40 até 0.49
			System.out.println("ATENÇÃO!!!\nIndustrias do 1º GRUPO e 2º GRUPO devem suspendam suas atividades !");
		}else {//desde 0.50 pra cima
			System.out.println("ATENÇÃO!!!\nIndustrias todos os GRUPOS devem suspendam suas atividades !");
		}
	}
}
