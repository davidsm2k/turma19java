/*
1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.
*/

package ExerciciosLista3;

import java.util.Scanner;

public class Lista03Exercicio01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		final int HABITANTES = 3;
		
		double salario, calcSalario = 0.0, salarioAnt = 0.0, salarioMaior = 0.0, percentualSalario = 0.0;
		byte filhos, calcFilhos = 0;
		
		for(int i = 1; i <= HABITANTES; i++) {// Pegando as Informações
			System.out.println("Digite o salario do " + i + "° habitante: ");
			salario = leia.nextDouble();
			calcSalario += salario;
			
			//maior salário*******************
			salarioAnt = salario;
			if(salarioAnt > salarioMaior){
				salarioMaior = salarioAnt;
			}
			//********************************
			
			// percentual de pessoas com salário até R$100,00
			if(salario <= 100.0){
				percentualSalario++;
			}			
			//***********************************************
			
			System.out.println("Digite quantos filhos o "+ i +"º habitante tem: ");
			filhos = leia.nextByte();
			calcFilhos += filhos;
		}
		
		System.out.println("Media de Salarios: " + calcSalario/HABITANTES);
		System.out.println("Media de Filhos: "+ calcFilhos/HABITANTES);
		System.out.println("O salario maior é: "+ salarioMaior);
		System.out.printf("\nPessoas com salário até R$100,00: %.1f %% dos habitantes.", ((percentualSalario/HABITANTES) * 100));
	}
}