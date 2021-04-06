// 4 pessoas - nome - vetor
// 4 nota [inteiro entre 1-10] - vetor
// nome - nota - ate 5 > ainda não/acima de de 5 > muito bem

package ATIVIDADES_AULA;

import java.util.Scanner;

public class NotasUsandoVetor {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String alunos[] = new String[4];
		Double notas[] = new Double[4];
		
		for(int i = 0; i < alunos.length; i++) {
			System.out.println("**********************************");
			System.out.printf("Digite o nome da %dº pessoa: ", i+1);
			alunos[i] = ler.next();
			
			System.out.printf("Digite a nota de %s: ", alunos[i]);
			notas[i] = ler.nextDouble();			
		}
		
		System.out.println("\n*** RESULTADOS ****");
		for(int j = 0; j < notas.length; j++) {
			if(notas[j] <= 5) {
				System.out.printf("Nome: %s / Nota: %.2f -> Ainda Não :(\n", alunos[j], notas[j]);
			}else {
				System.out.printf("Nome: %s / Nota: %.2f -> Muito Bem !!\n", alunos[j], notas[j]);
			}
		}
	}
}