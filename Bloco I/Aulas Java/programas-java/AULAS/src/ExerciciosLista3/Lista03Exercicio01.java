/*
1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o sal?rio e n?mero de filhos. A prefeitura deseja saber:??
a) m?dia do sal?rio da popula??o;
b) m?dia do n?mero de filhos;
c) maior sal?rio;
d) percentual de pessoas com sal?rio at? R$100,00.
*/

package ExerciciosLista3;

import java.util.Scanner;

public class Lista03Exercicio01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		final int HABITANTES = 3;
		
		double salario, calcSalario = 0.0, salarioAnt = 0.0, salarioMaior = 0.0, percentualSalario = 0.0;
		byte filhos, calcFilhos = 0;
		
		for(int i = 1; i <= HABITANTES; i++) {// Pegando as Informa??es
			System.out.println("Digite o salario do " + i + "? habitante: ");
			salario = leia.nextDouble();
			calcSalario += salario;
			
			//maior sal?rio*******************
			salarioAnt = salario;
			if(salarioAnt > salarioMaior){
				salarioMaior = salarioAnt;
			}
			//********************************
			
			// percentual de pessoas com sal?rio at? R$100,00
			if(salario <= 100.0){
				percentualSalario++;
			}			
			//***********************************************
			
			System.out.println("Digite quantos filhos o "+ i +"? habitante tem: ");
			filhos = leia.nextByte();
			calcFilhos += filhos;
		}
		
		System.out.printf("\nMedia de Salarios: %.2f", calcSalario/HABITANTES);
		System.out.printf("\nMedia de Filhos: %.2f", calcFilhos/HABITANTES);
		System.out.printf("\nO salario maior %.2f ?: ", salarioMaior);
		System.out.printf("\nPessoas com sal?rio at? R$100,00: %.1f %% dos habitantes.", ((percentualSalario/HABITANTES) * 100));
	}
}