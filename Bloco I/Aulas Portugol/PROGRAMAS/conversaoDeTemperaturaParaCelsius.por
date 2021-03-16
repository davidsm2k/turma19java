programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		cadeia nome 
		real celsius, fahrenheit
		
		escreva("Digite seu nome: ")
		leia(nome)
		limpa()

		escreva("Olá " + nome + " informe a temperatura em °C: ")
		leia(celsius)
		limpa()

		fahrenheit = (celsius * 1.8) + 32

		escreva(nome + " a temperatura é " + celsius + " °C\nApós a conversão para Fahrenheit fica " + Matematica.arredondar(fahrenheit,2) + "°F")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 418; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */