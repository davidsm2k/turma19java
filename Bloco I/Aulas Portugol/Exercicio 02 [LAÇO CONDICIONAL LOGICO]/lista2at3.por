/*
3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.

*/

programa
{
	
	funcao inicio()
	{
		inteiro n1, n2, n3, n4

		escreva("Informe o numero 1: ")
		leia(n1)

		escreva("Informe o numero 2: ")
		leia(n2)

		escreva("Informe o numero 3: ")
		leia(n3)

		escreva("Informe o numero 4: ")
		leia(n4)

		se((n3*n3) >= 1000){
			escreva("O valor do numero 3 é: ", n3)
			escreva("\nE seu valor quadrado é: ", n3*4)
		}
		senao {
			escreva("Valor 1: ", n1, " seu quadrado é ", n1*n1)
			escreva("\nValor 2: ", n2, " seu quadrado é ", n2*n2)
			escreva("\nValor 3: ", n3, " seu quadrado é ", n3*n3)
			escreva("\nValor 4: ", n4, " seu quadrado é ", n4*n4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 854; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */