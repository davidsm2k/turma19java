/*
1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo 
(50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que 
leia a variável P (peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) 
e na variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
*/
// Peso regular do tomate pelo estado 50 quilos
// Multa por exceder o peso R$ 4,00 por quilo
// verifique se há excesso
// variável P (peso de tomates) | variável E (Excesso) | variável M o valor da multa 

programa
{
	
	funcao inicio()
	{
		const real _MAX_KG = 50.0
		const real _MULTA_KG = 4.0
		real p = 0.0, ex = 0.0, m = 0.0

		escreva("Digite o peso: ")
		leia(p)

		se(p > _MAX_KG){
			ex = p - _MAX_KG
			m = ex * _MULTA_KG
			escreva("ATENÇÃO!!\nVocê excedeu ", ex ," quilos do permitido que é 50 quilos\n")
			escreva("O valor da multa que será aplicado é de R$ ", m)
		}
		senao {
			escreva("O peso informado está dentro do padrão.\n")
			escreva("Excesso: ", ex, " quilos\n")
			escreva("Multa: R$ ", m)
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1261; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */