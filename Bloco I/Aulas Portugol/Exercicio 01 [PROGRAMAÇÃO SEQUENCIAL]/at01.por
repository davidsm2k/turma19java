programa
{
	funcao inicio()
	{
		inteiro anos, meses, dias, totalAnos
		
		escreva("Digite quantos anos você tem: ")
		leia(anos)
		limpa()

		escreva("Digite quantos meses você tem: ")
		leia(meses)
		limpa()

		escreva("Digite quantos dias você tem: ")
		leia(dias)
		limpa()

		escreva("Seu total de dias vividos é " + calculo(anos, meses, dias) + " dias.")				
	}
	
	funcao inteiro calculo(inteiro anos, inteiro meses, inteiro dias){
		
		const inteiro _QUANT_ANOS = 365		
		const inteiro _QUANT_MESES = 30

		inteiro totalAnos, totalMeses, resultado

		totalAnos = anos * _QUANT_ANOS
		totalMeses = meses * _QUANT_MESES

		resultado = totalAnos + totalMeses + dias

		retorne resultado
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */