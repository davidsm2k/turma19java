/*
1) Jo�o, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho. 
Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de S�o Paulo 
(50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que 
leia a vari�vel P (peso de tomates) e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) 
e na vari�vel M o valor da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
*/
// Peso regular do tomate pelo estado 50 quilos
// Multa por exceder o peso R$ 4,00 por quilo
// verifique se h� excesso
// vari�vel P (peso de tomates) | vari�vel E (Excesso) | vari�vel M o valor da multa 

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
			System.out.println("ATEN��O!!\nVoc� excedeu "+ ex +" quilos do permitido que � 50 quilos\n");
			System.out.printf("O valor da multa que ser� aplicado � de R$ %.2f", m);
		}else {
			System.out.println("O peso informado est� dentro do padr�o.");
			System.out.println("Excesso: "+ ex +" quilos");
			System.out.printf("Multa: R$ %.2f", m);			
		}
	}
}
