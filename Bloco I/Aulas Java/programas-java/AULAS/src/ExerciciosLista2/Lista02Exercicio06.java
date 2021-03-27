/*
6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
*/

package ExerciciosLista2;

import java.util.Scanner;

public class Lista02Exercicio06 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a idade do nadador: ");
		idade = leia.nextInt();
		
		if(idade < 5){
			System.out.print("Categoria: Nenem volte para o berço.");
		}
		else if(idade <= 7){
			System.out.print("Categoria: Infantil A");
		}
		else if(idade <= 11){
			System.out.print("Categoria: Infantil B");
		}
		else if(idade <= 13){
			System.out.print("Categoria: Juvenil A");
		}
		else if(idade <= 17){
			System.out.print("Categoria: Juvenil A");
		}
		else {
			System.out.print("Categoria: Adulto");
		}		
	}
}