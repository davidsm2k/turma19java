programa
{
	funcao inicio()
		
		
	{
		inteiro tempoInfo, horas, minutos, segundos
				
		escreva("Digite o tempo de duração do evento em segundos: ")
		leia(tempoInfo)
		limpa()
				
		horas = tempoInfo/3600
		minutos = (tempoInfo % 3600) / 60
		segundos = (tempoInfo % 3600) % 60

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
 * @POSICAO-CURSOR = 281; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */