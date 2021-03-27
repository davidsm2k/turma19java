/*
2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas 
de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas 
exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. 
A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.
*/
//variáveis C e N

package ExerciciosLista2;

import java.util.Scanner;

public class Lista02Exercicio02 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		final double SALARIO_HORA = 10.0;
		final double SALARIO_HORA_EXCEDIDA = 20.0;
		final double LIMITE_HORA = 50.0;
		int c;
		double n, salario, e = 0.0;
		
		System.out.println("Digite o código do funcionario: ");
		c = leia.nextInt();
		
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		n = leia.nextDouble();
		
		if(n < LIMITE_HORA) {
			salario = SALARIO_HORA * n;
			System.out.printf("Salario Total: R$ %.2f", salario);
		} else {
			e = (n - LIMITE_HORA) * SALARIO_HORA_EXCEDIDA;
			salario = (( n - (n - LIMITE_HORA)) * SALARIO_HORA) + e;
			
			System.out.printf("Salario Total: R$ %.2f", salario);
			System.out.printf("\nSalario Excedido: R$ %.2f", e);
		}
	}
}