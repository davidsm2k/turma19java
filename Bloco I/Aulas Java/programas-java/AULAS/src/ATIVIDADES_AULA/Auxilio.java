/*
- RECEBEU O AUXILIO ANTES
- N�O PODE TER RECEBIDO BOLSA FAMILIA
- A CADA FILHO MAIS 50 REAIS
- CHEFA DE FAMILIA GANHA O DOBRO
- VALOR BASE 300 REAIS
- AUXILIO EMERGENCIAL
*/

package ATIVIDADES_AULA;

import java.util.Locale;
import java.util.Scanner;

public class Auxilio {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		char opcao;
		int valor = 0;
		int filhos = 0;

		do{
			System.out.println("Voc� � beneficiario do bolsa fam�lia ou outro auxilio?\n (S)Sim (N)N�o\n Resposta: ");
			opcao = leia.next().toUpperCase().charAt(0);
			System.out.println(opcao + "\n");
			if(opcao != 'S' && opcao != 'N') {
				System.out.println("\nDigite S-SIM ou N-N�o");
			}
		}while(opcao != 'S' && opcao != 'N');
		
				
		if (opcao == 'N') {
			System.out.println("Voc� foi beneficiario do ultimo auxilio emergencial?\n (S)Sim (N)N�o\nResposta: ");
			opcao = leia.next().toUpperCase().charAt(0);
			if (opcao == 'N') {
				System.out.println("Voc� n�o tem direito ao auxilio emergencial!");
			} else if (opcao == 'S') {
				System.out.println("Voc� � CHEFA de fam�lia?\n (S)Sim (N)N�o\nResposta: ");
				opcao = leia.next().toUpperCase().charAt(0);
				
				if (opcao == 'N') {
					System.out.println("Voc� tem direito a R$600");
					valor += 600;
				} else {
					System.out.println("Voc� tem direito a R$300");
					valor += 300;
				}
				
				System.out.println("\nQuantos filhos voce tem: ");
				filhos = leia.nextInt();
				
				System.out.println("\nVoc� tem direito a receber mais " + filhos*50);
			}
		} 
		else if (opcao == 'S') {
			System.out.println("Voc� n�o tem direito ao auxilio.");
		}
						
		System.out.println("\nTotal a receber: R$ " + (valor += filhos*50) );
	}
}
