/*
5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são 
altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice 
 para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o índice crescer para 
 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5 
 todos os grupos devem ser notificados a paralisarem suas atividades. Faça um sistema que leia o índice de 
 poluição medido e emita a notificação adequada aos diferentes grupos de empresas.
*/

//0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades
//crescer para  0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades
//se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades

programa
{	
	funcao inicio()
	{
		real indicePoluicao

		escreva("Digite o Indice de Poluição: ")
		leia(indicePoluicao)


		se(indicePoluicao < 0.30){ //desde 0.00 até 0.29
			escreva("Tudo Ok.\n[Limite aceitavel]")
		}
		senao se(indicePoluicao < 0.40){//desde 0.30 até 0.39
			escreva("ATENÇÃO!!!\nIndustrias do 1º GRUPO suspendam suas atividades !")
		}
		senao se(indicePoluicao < 0.50){//desde 0.40 até 0.49
			escreva("ATENÇÃO!!!\nIndustrias do 1º GRUPO e 2º GRUPO devem suspendam suas atividades !")
		}
		senao {//desde 0.50 pra cima
			escreva("ATENÇÃO!!!\nIndustrias todos os GRUPOS devem suspendam suas atividades !")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 901; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */