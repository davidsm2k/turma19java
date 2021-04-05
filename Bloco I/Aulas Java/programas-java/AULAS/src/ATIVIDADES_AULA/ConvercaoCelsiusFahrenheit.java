package ATIVIDADES_AULA;

import java.util.Scanner;

public class ConvercaoCelsiusFahrenheit {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double c, f;
		
		System.out.println("Digite a temperatura em °C: ");
		c = leia.nextDouble();
				
		//(Celsius °C × 9/5) + 32 = Fahrenheit
		f = (c * 1.8) + 32;
		
		System.out.printf("A temperatura em Fahrenheit é %.1f °F", f);
		
	}
}
