package ExerciciosLista7;

import java.util.Locale;
import java.util.Scanner;

public class TesteProdutoEletronico {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner leia = new Scanner(System.in);
		
		ProdutoEletronico produto1 = new ProdutoEletronico();
		
		System.out.println("Digite o nome do produto: ");
		produto1.setNomeProduto(leia.next());
		System.out.println("Digite a marca: ");
		produto1.setMarca(leia.next());
		System.out.println("Digite o pre?o: ");
		produto1.setPreco(leia.nextDouble());
		
		System.out.printf("Produto: %s \n", produto1.getNomeProduto());
		System.out.printf("Marca: %s \n", produto1.getMarca());
		System.out.printf("Pre?o R$ %.2f \n", produto1.getPreco());
	}
}
