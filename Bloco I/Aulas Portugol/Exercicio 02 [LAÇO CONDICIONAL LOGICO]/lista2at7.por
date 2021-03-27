/*
7) Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
*/

programa
{
	
	funcao inicio()
	{
		inteiro l1, l2, l3

		escreva("Digite um valor positivo para os lados de um triangulo\nLado 1: ")
		leia(l1)

		escreva("Lado 2: ")
		leia(l2)

		escreva("Lado 3: ")
		leia(l3)

		se(l1 > 0 e l2 > 0 e l3 > 0){
			escreva("A area do triangulo é: ", l1 + l2 + l3)
		}
		senao {
			escreva("[OPERAÇÃO INVÁLIDO] - Um dos valores ou todos não são positivos.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 340; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {l1, 11, 10, 2}-{l2, 11, 14, 2}-{l3, 11, 18, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */