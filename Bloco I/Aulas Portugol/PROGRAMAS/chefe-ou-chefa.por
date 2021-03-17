programa
{
	
	funcao inicio()
	{
		cadeia nome
		cadeia op
		const real _GRANA = 600.0

		escreva("Digite seu nome: ")
		leia(nome)
		limpa()

		escreva(	"Olá ", nome,
				",\nInforme '1' para CHEFE de Familia ou",
				"\nInforme '2' para CHEFA de Familia:\n")
		leia(op)
		limpa()

		se(op == "2"){
			escreva("Olá ", nome," vc tem direito a receber o dobro assim recebendo R$ ", _GRANA * 2)
		}
		senao se (op == "1"){
			escreva("Olá ", nome," vc tem direito a receber R$ ", _GRANA)		
		}
		senao {
			escreva("Informe uma opção valida digitando 1 ou 2.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 159; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */