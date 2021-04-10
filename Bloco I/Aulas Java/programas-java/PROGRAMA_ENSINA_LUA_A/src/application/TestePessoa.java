package application;

import java.util.Scanner;

import entity.Pessoa;

public class TestePessoa {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Pessoa pessoa1 = new Pessoa();
		
		System.out.println("QUAL SEU NOME ?");
		pessoa1.setNome(leia.nextLine());
		
		System.out.printf("NOME: %s ", pessoa1.getNome());
	}
}
