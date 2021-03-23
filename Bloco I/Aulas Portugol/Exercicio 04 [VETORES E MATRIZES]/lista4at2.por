/*
2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
*/
programa
{
	
	funcao inicio()
	{
		inteiro lancamento[10], soma = 0, maior = 0, numeroOcorrencia = 0

		para(inteiro i = 0; i < 10; i++){
			escreva("Digite o dado para o ",i+1,"º lançamento: ")
			leia(lancamento[i])
			limpa()
		}

		escreva("*** OCORRÊNCIAS ***\n\n")
		para(inteiro y = 0; y < 10; y++){
			escreva("Lançamento ",y+1,": ",lancamento[y],"\n")
			soma += lancamento[y]
			se(lancamento[y] > maior){
				maior = lancamento[y]
			}
		}

		para(inteiro l = 0; l < 10; l++){
			se(maior == lancamento[l]){
				numeroOcorrencia++
			}
		}

		escreva("\nMédia das Ocorrências: ", soma/10)
		escreva("\nQuantidade de Ocorrências do maior valor: ", numeroOcorrencia)
		escreva("\nPontuação da Maior Ocorrência: ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 938; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */