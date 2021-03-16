programa
{	
	funcao inicio()
	{
		cadeia nome
		inteiro anoNasc, idade, anoAtual
		
		escreva("Digite seu nome: ")
		leia(nome)
		limpa()

		escreva("Oi " + nome + " digite seu ano de nascimento: ")
		leia(anoNasc)
		limpa()

		escreva(nome + " digite seu ano atual: ")
		leia(anoAtual)
		limpa()

		idade = anoAtual - anoNasc

		escreva(nome + " sua idade aproximada é " + idade)	 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 265; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */