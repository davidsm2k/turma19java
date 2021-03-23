/*
1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
*/
programa
{
	
	funcao inicio()
	{
		inteiro pontuacoes[5]
		inteiro maior = 0

		para(inteiro i = 0; i < 5; i++){
			escreva("Digite o valor da ",i+1,"º pontuação: ")
			leia(pontuacoes[i])
			limpa()
		}

		escreva("*** LISTA DE PONTOS ***\n\n")
		para(inteiro j = 0; j < 5; j++){
			escreva("Pontuação nº ", j+1,": ",pontuacoes[j],"\n")
			se(pontuacoes[j] > maior){
				maior = pontuacoes[j]
			}
		}
		escreva("\nA pontuação maior é ", maior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 412; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */