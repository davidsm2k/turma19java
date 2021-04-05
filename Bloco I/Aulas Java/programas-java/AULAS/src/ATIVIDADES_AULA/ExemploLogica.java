package ATIVIDADES_AULA;
import java.util.Locale;
import java.util.Scanner;

public class ExemploLogica {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);//Passar o padrao USA no código do começo ao fim (tipo de moeda/teclado/decimais)
		Scanner leia = new Scanner(System.in);
		
		int numero; //numero inteiro
		String nome; //cadeia de caracteres (String é uma classe)
		boolean vivo;//verdadeiro ou falso - true or false
		char escolha; //sim ou não
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		
		ParImpar(numero);
		
		System.out.println("Fim do Programa !!!");
		
	}
	
	public static void ParImpar(int numero) {
		if( (numero%2 == 0) && (numero >= 0) ) {
			System.out.println("Numero Par");
			EscreveLinha();
		}
		else if( (numero%2 == 1) && (numero > 0) ) {
			System.out.println("Numero Impar");
			EscreveLinha();
		}
	}
	
	public static void EscreveLinha() {
		System.out.println("-------------------------------------------");
	}
}
