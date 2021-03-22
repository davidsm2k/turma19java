programa
{
	inclua biblioteca Texto
	
	funcao inicio()
	{
		cadeia agenda[24][31]
		inteiro dia, hora
		cadeia opcao
		
		faca{
			escreva("Digite o dia do compromisso: ")
			leia(dia)
			dia = dia - 1
			escreva("Digite a hora: ")
			leia(hora)
			escreva("informe o compromisso: ")
			leia(agenda[hora][dia])
			escreva("Continua Sim ou Não S/N: ")
			leia(opcao)

			opcao = Texto.caixa_alta(opcao)
			limpa()
		}enquanto(opcao != "N")

		escreva("AGENDA\n\n")
		para(inteiro d = 0; d < 31; d++){
			para(inteiro h = 0; h < 24; h++){
				se (agenda[h][d] != ""){
					escreva("Agenda dia ", d+1, " às ", h," ",agenda[h][d],"\n")
				}				
			}
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 651; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */