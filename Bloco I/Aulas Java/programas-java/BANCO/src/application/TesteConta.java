package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Conta;

public class TesteConta {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Conta contaDavid = new Conta();
		
		System.out.print("Digite o numero da conta: ");
		contaDavid.numero = leia.nextInt();
		
		System.out.println("Digite o cpf da conta: ");
		contaDavid.cpf = leia.next();
		
		System.out.print("Digite o valor: ");
		int valor = leia.nextInt();
		
		System.out.println("Opera??o de 1-credito ou 2-credito?");
		char opcao = leia.next().charAt(0);
		if(opcao == '1') {
			contaDavid.credito(valor);
		}else {
			contaDavid.debito(valor);
		}
		
		System.out.printf("CPF: %s \n", contaDavid.cpf);
		System.out.printf("Numero: %d \n", contaDavid.numero);
		System.out.printf("Saldo: %.2f ", contaDavid.saldo);
	}
}
