/*
2 - CADASTRO BASE CLIENTES LOJA

NOME, ANO DE  NASCIMENTO, GENERO
MOSTRA A IDADE DA PESSOA CADASTRADA
CADASTRA OUTRA PESSOA E COMPARAR PRA SABE QUEM ? MAIS VELHO, MAIS NOVO OU TEM A MESMA IDADE
NOME, ANO NASCIMENTO, IDADE, ? MAIS NOVO[A]/VELHO[A]
*/
package CADASTRO_CLIENTE_LOJA;

import java.util.Scanner;

public class CadastroClienteLoja {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int maiorIdade = 0;
		int menorIdade;
		int mesmaIdade;
		
		Pessoa cli1 = new Pessoa();
		Pessoa cli2 = new Pessoa();
		
		//Cliente 1 *******************************************
		System.out.printf("Digite o seu nome: ");
		cli1.nome = leia.next();		
		System.out.printf("%s digite o ano de nascimento: ", cli1.nome);
		cli1.anoNascimento = leia.nextInt();		
		System.out.print("Digite seu genero 1-Feminino / 2-Masculino / 3-Outros: ");
		cli1.genero = leia.next().charAt(0);
		//*****************************************************
		
		//Cliente 2 *******************************************
		System.out.printf("\nDigite o seu nome: ");
		cli2.nome = leia.next();		
		System.out.printf("%s digite o ano de nascimento: ", cli2.nome);
		cli2.anoNascimento = leia.nextInt();		
		System.out.print("Digite seu genero 1-Feminino / 2-Masculino / 3-Outros: ");
		cli2.genero = leia.next().charAt(0);
		//*****************************************************
		
		//Mostrando idades *************************************
		//System.out.printf("\n%s %s %s tem %d anos\n", cli1.trasArtigo().toUpperCase(), cli1.tratamento(), cli1.nome, cli1.calcularIdade());
		//System.out.printf("%s %s %s tem %d anos\n\n", cli2.trasArtigo().toUpperCase(), cli2.tratamento() , cli2.nome, cli2.calcularIdade());
		System.out.println();
		cli1.mostraIdade();
		cli2.mostraIdade();
		//*****************************************************
				
		//Mostrando idade maior *******************************
		if(cli1.calcularIdade() > cli2.calcularIdade()) {
			System.out.printf("\n%s %s %s ? a pessoa mais velha", cli1.trasArtigo().toUpperCase(), cli1.tratamento(), cli1.nome, cli1.calcularIdade());
		}
		else {
			System.out.printf("\n%s %s %s ? a pessoa mais velha", cli2.trasArtigo().toUpperCase(), cli2.tratamento(), cli2.nome, cli2.calcularIdade());
		}
		//*****************************************************
	}
}
