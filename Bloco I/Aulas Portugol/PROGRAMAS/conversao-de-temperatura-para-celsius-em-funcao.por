programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		cadeia nome 
		real celsius
		
		escreva("Digite seu nome: ")
		leia(nome)
		limpa()

		escreva("Olá " + nome + " informe a temperatura em °C: ")
		leia(celsius)
		limpa()

		escreva(nome + " a temperatura é " + celsius + " °C")
		escreva("\nApós a conversão para Fahrenheit fica " + convercaoCelsius(celsius) + "°F")
	}

	funcao real convercaoCelsius(real celsius){

		real fahrenheit

		fahrenheit = (celsius * 1.8) + 32
		
		retorne Mat.arredondar(fahrenheit, 2)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 444; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */