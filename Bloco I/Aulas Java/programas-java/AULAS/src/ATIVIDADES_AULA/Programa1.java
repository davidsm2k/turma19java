package ATIVIDADES_AULA;

import javax.swing.JOptionPane;

public class Programa1 {
	public static void main(String[] args) {
		int valor1, valor2;
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1: "));
				
		JOptionPane.showMessageDialog(null, "A soma de " + valor1 + " com "+ valor2 + " é: " + soma(valor1, valor2));
		
		System.out.println("Valor 1: " + valor1);
		System.out.println("Valor 2: " + valor2);
		linha();
		System.out.println("Soma: " + soma(valor1, valor2));
		
	}
	
	public static void linha() {
		System.out.println("\n----------\n");
	}
	
	public static int soma(int v1, int v2) {
		
		int soma = v1 + v2;
		
		return soma;
	}
}
