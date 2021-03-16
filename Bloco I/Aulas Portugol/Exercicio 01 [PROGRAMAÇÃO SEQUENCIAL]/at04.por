programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		inteiro a, b, c, d, r, s

		escreva("Digite o valor A: ")
		leia(a)
		limpa()

		escreva("Digite o valor B: ")
		leia(b)
		limpa()

		escreva("Digite o valor C: ")
		leia(c)
		limpa()

		r = Mat.potencia(a + b, 2)

		s = Mat.potencia(b + c, 2)

		d = (r + s) / 2

		escreva("R => ", r)
		escreva("\nS => ", s)
		escreva("\nO resultado de D = R + S / 2 é: ", d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 400; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */