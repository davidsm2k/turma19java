/*
1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo 
(50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que 
leia a variável P (peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) 
e na variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
*/
// Peso regular do tomate pelo estado 50 quilos
// Multa por exceder o peso R$ 4,00 por quilo
// verifique se há excesso
// variável P (peso de tomates) | variável E (Excesso) | variável M o valor da multa 

package ExerciciosLista2;

import java.util.Scanner;

public class Lista02Exercicio01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		final double MAX_KG = 50.0;
		final double MULTA_KG = 4.0;
		
		double p = 0.0, ex = 0.0, m = 0.0;
		
		System.out.println("Digite o peso: ");
		p = leia.nextDouble();
		
		if(p > MAX_KG) {
			ex = p - MAX_KG;
			m = ex * MULTA_KG;
			System.out.println("ATENÇÃO!!\nVocê excedeu "+ ex +" quilos do permitido que é 50 quilos\n");
			System.out.printf("O valor da multa que será aplicado é de R$ %.2f", m);
		}else {
			System.out.println("O peso informado está dentro do padrão.");
			System.out.println("Excesso: "+ ex +" quilos");
			System.out.printf("Multa: R$ %.2f", m);			
		}
	}
}
