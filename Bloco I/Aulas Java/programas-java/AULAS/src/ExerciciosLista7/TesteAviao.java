package ExerciciosLista7;

import java.util.Locale;
import java.util.Scanner;

public class TesteAviao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner leia = new Scanner(System.in);
		
		Aviao aviao1 = new Aviao();
		
		System.out.println("Digite o numero da passagem: ");
		aviao1.setNumeroPassagem(leia.nextInt());
		
		System.out.println("Digite o peso da bagagem: ");
		aviao1.setPesoBagagem(leia.nextDouble());
		
		System.out.println("Digite o numero da poltrona: ");
		aviao1.setNumeroPoltrona(leia.nextInt());
		
		System.out.printf("Numero Passagem: %d \n", aviao1.getNumeroPassagem());
		System.out.printf("Peso da Bagagem: %.1f Kg \n", aviao1.getPesoBagagem());
		System.out.printf("Numero da Poltrona: %d \n", aviao1.getNumeroPoltrona());
		
	}
}
