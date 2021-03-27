/*
4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.
*/

programa
{
	
	funcao inicio()
	{
		inteiro n

		escreva("Digite um numero inteiro: ")
		leia(n)

		se(n == 0){
			escreva("O numero ", n," é NEUTRO.")
		}
		senao se(n%2 == 0){
			escreva("O numero ", n," é PAR")
			se(n > 0){
				escreva(" e POSITIVO.")
			}
			senao {
				escreva(" e NEGATIVO")
			}
		}
		senao {
			escreva("O numero ", n," é IMPAR")
			se(n > 0){
				escreva(" e POSITIVO.")
			}
			senao {
				escreva(" e NEGATIVO")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 292; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */