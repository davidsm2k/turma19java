/*
5) A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de ind�strias que s�o 
altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. Se o �ndice 
 para 0,3 as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades, se o �ndice crescer para 
 0,4 as industrias do 1� e 2� grupo s�o intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 
 todos os grupos devem ser notificados a paralisarem suas atividades. Fa�a um sistema que leia o �ndice de 
 polui��o medido e emita a notifica��o adequada aos diferentes grupos de empresas.
*/

//0,3 as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades
//crescer para  0,4 as industrias do 1� e 2� grupo s�o intimadas a suspenderem suas atividades
//se o �ndice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades

package ExerciciosLista2;

import java.util.Scanner;

public class Lista02Exercicio05 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double indicePoluicao;
		
		System.out.println("Digite o Indice de Polui��o: ");
		indicePoluicao = leia.nextDouble();
		
		if(indicePoluicao < 0.30) { //desde 0.00 at� 0.29
			System.out.println("Tudo Ok.\n[Limite aceitavel]");
		}else if(indicePoluicao < 0.40) {//desde 0.30 at� 0.39
			System.out.println("ATEN��O!!!\nIndustrias do 1� GRUPO suspendam suas atividades !");
		}else if(indicePoluicao < 0.50) {//desde 0.40 at� 0.49
			System.out.println("ATEN��O!!!\nIndustrias do 1� GRUPO e 2� GRUPO devem suspendam suas atividades !");
		}else {//desde 0.50 pra cima
			System.out.println("ATEN��O!!!\nIndustrias todos os GRUPOS devem suspendam suas atividades !");
		}
	}
}
