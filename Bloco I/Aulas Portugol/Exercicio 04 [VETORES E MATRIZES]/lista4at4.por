/*
4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
*/
programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro matriz[3][3]
		inteiro totalDiagonal = 0
		inteiro numero 

		para(inteiro linha = 0; linha < 3; linha++){
			para(inteiro coluna = 0; coluna < 3; coluna++){
				numero = Util.sorteia(1, 9)
				matriz[linha][coluna] = numero
				se(linha == coluna){
					totalDiagonal = totalDiagonal + matriz[linha][coluna]
				}
			}
		}

		escreva("\n*** FORMA DE MATRIZ ***\n\n")
		para(inteiro linha = 0; linha < 3; linha++){
			para(inteiro coluna = 0; coluna < 3; coluna++){
				escreva(matriz[linha][coluna], " ")
			}
			escreva("\n")
		}
		escreva("\nTotal da Diagonal: ", totalDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 640; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */