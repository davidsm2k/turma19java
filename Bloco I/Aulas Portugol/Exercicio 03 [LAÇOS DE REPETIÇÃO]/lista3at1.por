/*
1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.
*/

programa
{
	inclua biblioteca Matematica 
	
	funcao inicio()
	{
		const inteiro _HABITANTES = 2
		
		real media, salario, calcSalario = 0.0, salarioAnt = 0.0, salarioMaior = 0.0, percetualSalario = 0.0
		inteiro filhos, calcFilhos = 0
		
		para(inteiro i = 1; i <= _HABITANTES; i++ ){ // Pegando as informações
			
			escreva("Digite o salario do ", i,"º habitante: ")
			leia(salario)
			calcSalario += salario
			
			//maior salário*******************
			salarioAnt = salario
			se(salarioAnt > salarioMaior){
				salarioMaior = salarioAnt
			}
			//********************************
			
			// percentual de pessoas com salário até R$100,00
			se(salario <= 100.0){
				percetualSalario++
			}			
			//***********************************************
			
			escreva("Digite quantos filhos o ", i, "º habitante tem: ")
			leia(filhos)
			calcFilhos += filhos
			limpa()
		}

		escreva("Media de Salarios: ", calcSalario/_HABITANTES)
		escreva("\nMedia de Filhos: ", calcFilhos/_HABITANTES)
		escreva("\nO salario maior é: ", salarioMaior)
		escreva("\nPessoas com salário até R$100,00: ", Matematica.arredondar((percetualSalario/_HABITANTES) * 100,2), "% dos habitantes.\n")		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 531; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */