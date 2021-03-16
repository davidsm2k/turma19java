programa
{
	funcao inicio()
		
		
	{
		inteiro tempoInfo, horas, minutos, segundos
				
		escreva("Digite quantos dias de vida você tem: ")
		leia(tempoInfo)
		limpa()
				
		horas = tempoInfo/60
		minutos = (tempoInfo % 60) / 60
		segundos = (tempoInfo % 60) % 60

		escreva("Hora[s]: ", horas)
		escreva("\nMinuto[s]: ", minutos)
		escreva("\nSegundo[s]: ", segundos)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 170; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */