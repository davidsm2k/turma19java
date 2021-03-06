package ExerciciosLista8;

import java.util.Locale;
import java.util.Scanner;

public class TesteAnimais {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Digite o nome do cachorro: ");
		nome = leia.next();		
		System.out.println("Digite a idade do cachorro: ");
		idade = leia.nextInt();
		
		Cachorro dog = new Cachorro(nome, idade);
						
		System.out.println("Digite o nome do cavalo: ");
		nome = leia.next();
		System.out.println("Digite a idade do cavalo: ");
		idade = leia.nextInt();
		
		Cavalo horse = new Cavalo(nome, idade);
		
		System.out.println("Digite o nome da pregui?a: ");
		nome = leia.next();
		System.out.println("Digite a idade do pregui?a: ");
		idade = leia.nextInt();
		
		Preguica laziness = new Preguica(nome, idade);
		
		// Imprimindo valores
		System.out.printf("\nNome do cachorro: %s \n", dog.getNome());
		System.out.printf("Idade do cachorro: %d \n", dog.getIdade());
		dog.emitirSom("AU AU AU !\n");
		
		System.out.printf("\nNome do cavalo: %s \n", horse.getNome());
		System.out.printf("Idade do cavalo: %d \n", horse.getIdade());
		horse.emitirSom("Hiin in in !\n");
		
		System.out.printf("\nNome do cavalo: %s \n", laziness.getNome());
		System.out.printf("Idade do cavalo: %d \n", laziness.getIdade());
		laziness.emitirSom("Uaaaaaah !\n");
	}
}
