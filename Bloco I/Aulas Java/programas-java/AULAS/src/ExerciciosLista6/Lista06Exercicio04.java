/*
4- Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
- o n�mero de pessoas calmas;
- o n�mero de mulheres nervosas;
- o n�mero de homens agressivos;
- o n�mero de outros calmos;
- o n�mero de pessoas nervosas com mais de 40 anos;
- o n�mero de pessoas calmas com menos de 18 anos.
*/
package ExerciciosLista6;

import java.util.Scanner;

public class Lista06Exercicio04 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		final int LIMITE = 6;
		
		int idade;
		char sexo;
		char opcao;
		char continua;
		int contador = 1;
		int pessoasCalmas = 0;
		int mulheresNervosas = 0;
		int homensAgressivos = 0;
		int outrosCalmos = 0;
		int pessoasNervosasMais40Anos = 0;
		int pessoasCalmasMenos18Anos = 0;
		
		System.out.print("Voc� deseja fazer a pesquisa S-sim ou N-n�o ?\nResposta:");
		continua = leia.next().toUpperCase().charAt(0);
		
		while(continua == 'S' && contador <= LIMITE) {
			
			System.out.print("Informe sua idade: ");
			idade = leia.nextInt();
			
			System.out.print("Digite 1-feminino / 2-masculino / 3-Outros: ");
			sexo = leia.next().charAt(0);
			
			System.out.print("Digite:\n1 - se a pessoa � calma; \n2 - se a pessoa � nervosa; \n3 - se a pessoa � agressiva.\nResposta: ");
			opcao =  leia.next().charAt(0);
						
			if(contador != LIMITE) {
				System.out.print("Voc� deseja fazer uma nova pesquisa S-sim ou N-n�o ?\nResposta:");
				continua = leia.next().toUpperCase().charAt(0);
			}
			
			if(opcao == '1') pessoasCalmas++;
			if(sexo == '1' && opcao =='2') mulheresNervosas++;
			if(sexo == '2' && opcao =='3') homensAgressivos++;
			if(sexo == '3' && opcao =='1') outrosCalmos++;
			if(opcao =='2'&& idade >= 40) pessoasNervosasMais40Anos++;
			if(opcao =='1'&& idade < 18) pessoasCalmasMenos18Anos++;
			
			contador++;
		}
		
		System.out.println("O n�mero de pessoas calmas: " + pessoasCalmas);
		System.out.println("O n�mero de mulheres nervosas: " + mulheresNervosas);
		System.out.println("O n�mero de homens agressivos: " + homensAgressivos);
		System.out.println("O n�mero de outros calmos: " + outrosCalmos);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos: " + pessoasNervosasMais40Anos);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos: " + pessoasCalmasMenos18Anos);
	}
}
