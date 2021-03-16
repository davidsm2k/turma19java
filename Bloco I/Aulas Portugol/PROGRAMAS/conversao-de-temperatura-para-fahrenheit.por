programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		cadeia nome 
		real celsius, fahrenheit
		
		escreva("Digite seu nome: ")
		leia(nome)
		limpa()

		escreva("Olá " + nome + " informe a temperatura em °F: ")
		leia(fahrenheit)
		limpa()

		celsius = Mat.arredondar( ((fahrenheit - 32 )*5/9), 2)

		escreva(nome + " a temperatura é " + fahrenheit + " °F\nApós a conversão para Celsius fica " + celsius + "°C")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */