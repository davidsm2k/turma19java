programa
{
	funcao inicio()
		
		
	{
		inteiro diasInfo, anos, meses, dias
				
		escreva("Digite quantos dias de vida você tem: ")
		leia(diasInfo)
		limpa()
		
		/* Exemplo 01
		anos = diasInfo/365
		meses = (diasInfo - ( anos * 365 )) / 30
		dias = (diasInfo - ( anos * 365)) - (meses * 30)

		escreva("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias")
		*/

		
		anos = diasInfo/365
		meses = (diasInfo % 365) / 30
		dias = (diasInfo % 365) % 30

		escreva("Anos[s]: ", anos)
		escreva("\nMes[es]: ", meses)
		escreva("\nDia[s]: ", dias)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 177; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */