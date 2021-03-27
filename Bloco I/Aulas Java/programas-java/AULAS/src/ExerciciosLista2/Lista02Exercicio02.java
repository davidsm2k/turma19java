/*
2) Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de horas trabalhadas 
de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. Quando o n�mero de horas 
exceder a 50 calcule o excesso de pagamento armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. 
A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio excedente.
*/
//vari�veis C e N

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
		
		System.out.println("Digite o c�digo do funcionario: ");
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