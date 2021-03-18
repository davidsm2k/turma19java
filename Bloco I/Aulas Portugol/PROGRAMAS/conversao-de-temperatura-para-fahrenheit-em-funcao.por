programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		cadeia nome 
		real fahrenheit
		
		escreva("Digite seu nome: ")
		leia(nome)
		limpa()

		escreva("Olá " + nome + " informe a temperatura em °F: ")
		leia(fahrenheit)
		limpa()

		escreva(nome + " a temperatura é " + fahrenheit + " °F")
		escreva("\nApós a conversão para Celsius fica " + conversaoFahrenheit(fahrenheit) + "°C")
	}

	funcao real conversaoFahrenheit(real fahrenheit){

		real celsius
		
		celsius = Mat.arredondar( ((fahrenheit - 32 )*5/9), 2)
		
		retorne celsius
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 49; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */