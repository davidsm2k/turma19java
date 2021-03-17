/*
2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas 
de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas 
exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. 
A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.
*/
//variáveis C e N


programa
{
	
	funcao inicio()
	{
		const real _SALARIO_HORA = 10.00
		const real _SALARIO_HORA_EXCEDIDA = 20.00
		inteiro c
		real n, salario, E = 0.0

		escreva("Digite o código do funcionario: ")
		leia(c)

		escreva("Digite o quantidade de horas trabalhadas: ")
		leia(n)

		se(n < 50.0){
			salario = _SALARIO_HORA * n
			escreva("Salario Total: R$ ", salario)
		}
		senao {
			E = (n - 50) * _SALARIO_HORA_EXCEDIDA
			salario = (( n - (n - 50)) * _SALARIO_HORA) + E

			escreva("Salario Total: R$ ", salario)
			escreva("\nSalario Excedido: R$ ", E)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 909; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */