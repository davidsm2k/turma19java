programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		real valorCarro, dis, imp, valorFinal

		escreva("Digite o custo de fabrica do carro: ")
		leia(valorCarro)
		limpa()
		
		dis = valorCarro * 0.28
		imp = valorCarro * 0.45

		valorFinal = valorCarro + dis + imp

		escreva("Valor do Carro: ", valorCarro
				,"\nValor do Distribuidor: ", Mat.arredondar(dis, 2)
				,"\nValor do Imposto: ", Mat.arredondar(imp, 2)
				,"\nCusto ao Consumidor: ", Mat.arredondar(valorFinal, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 503; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */