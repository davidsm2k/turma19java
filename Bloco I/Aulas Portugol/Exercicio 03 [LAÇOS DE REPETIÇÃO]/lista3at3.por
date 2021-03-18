/*
1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.
*/
programa
{
	
	funcao inicio()
	{
		inteiro numero = 0, soma = 0, media = 0, lido = 0

		enquanto(numero >= 0){			
			escreva("Numeros informados: ", lido, "\n")
			escreva("Digite um numero positivo: ")
			leia(numero)
			limpa()
			
			soma += numero
			lido++
		}

		media = soma/lido
		
		escreva("A soma dos valores é: ", soma)
		escreva("\nA media deles é: ", media)
		escreva("\nForam lidos: ", lido, " numeros inteiros.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 450; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */