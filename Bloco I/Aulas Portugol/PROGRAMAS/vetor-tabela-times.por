programa
{
	inclua biblioteca Util
	inclua biblioteca Texto
	
	funcao inicio()
	{
		cadeia tipoPontos
		inteiro pontos[4]
		cadeia times[] = {"PALMEIRAS","SANTOS","SPFC","CORINTHIANS"}

		// G-Ganhou 3 p, E-Empatou 1p, P-Perdeu 0p

		para(inteiro rodada = 0; rodada < 4; rodada++){
			limpa()
			escreva("RODADA ", rodada+1, "\n\n")
			para(inteiro x = 0; x < 4; x++){
				faca{
					escreva("Time ", times[x] ,"\n")
					escreva("Informe G-Ganhou, E-Empatou e P-Perdeu: ")
					leia(tipoPontos)
					escreva("\n")
					
					tipoPontos = Texto.caixa_alta(tipoPontos)
					
					se(tipoPontos == "G"){
						pontos[x] += 3
					}
					senao se(tipoPontos == "E"){
						pontos[x] += 1
					}
					senao se(tipoPontos == "P"){
						pontos[x] += 0
					}
					senao {
						escreva("\n\n *** INFORMAÇÃO INVALIDA !! ***")
						Util.aguarde(1000)
						escreva("\nDigite G-Ganhou, E-Empatou e P-Perdeu")
						Util.aguarde(2000)
						limpa()
						escreva("RODADA ", rodada+1, "\n\n")
					}
				}enquanto(tipoPontos != "G" e tipoPontos != "E" e tipoPontos != "P")
			}		
		}

		escreva("RESULTADOS: \n\n")
		para(inteiro x = 0; x < 4; x++){
			escreva("O time ", times[x], " tem ", pontos[x], " pontos.\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 986; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */