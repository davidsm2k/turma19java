package ExerciciosLista7;

import java.util.Scanner;

public class TesteCliente {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Cliente cliente1 = new Cliente();
		
		System.out.println("Digite o nome do cliente: ");
		cliente1.setNome(leia.next());
				
		System.out.println("Digite a sua idade: ");
		cliente1.setIdade(leia.nextInt());
		
		System.out.println("Digite o CPF: ");
		cliente1.setCpf(leia.next());
		
		System.out.printf("Nome do Cliente: %s \n", cliente1.getNome());
		System.out.printf("Idade do Cliente: %d \n", cliente1.getIdade());
		System.out.printf("CPF do Cliente: %s \n", cliente1.getCpf());
		
	}
}