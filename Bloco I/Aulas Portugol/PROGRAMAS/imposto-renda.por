programa
{
	inclua biblioteca Texto
	
	funcao inicio()
	{	// até 1200 ISENTO
		// maior 1200 até 2500 paga 12%
		// maior 2500 para 25%
		
		real salarioBruto, salarioLiquido, imposto
		cadeia nome, tratamento
		
		escreva("Digite seu nome: ")
		leia(nome)

		escreva("Como voce deseja ser tratado: 1- Sr 2- Sra 3- Sre: ")
		leia(tratamento)
		
		se(tratamento == "3"){ //Perguntando salario
			escreva("Olá Sre ", nome,", por favor informe seu salário: ")
			leia(salarioBruto)

			se(salarioBruto <= 1200){
				escreva(nome," o Sre tem o salario de R$ ", salarioBruto ," e está isente do imposto de renda")
			}
			senao se(salarioBruto <= 2500){
				imposto = salarioBruto * 0.12
				salarioLiquido = salarioBruto - imposto
				
				escreva(nome," o Sre ira pagar 12% de IR R$ ", imposto ," seu salario liquido é R$ ", salarioLiquido)
			}
			senao se(salarioBruto > 2500){
				imposto = salarioBruto * 0.25
				salarioLiquido = salarioBruto - imposto
				
				escreva(nome," o Sre ira pagar 25% de IR R$ ", imposto ," seu salario liquido é R$ ", salarioLiquido)
			}
			
		}
		senao se(tratamento == "2"){ //Perguntando salario
			escreva("Olá Sra ", nome,", por favor informe seu salário: ")
			leia(salarioBruto)

			se(salarioBruto <= 1200){
				escreva(nome," o Sra tem o salario de R$ ", salarioBruto ," e está isenta do imposto de renda")
			}
			senao se(salarioBruto <= 2500){
				imposto = salarioBruto * 0.12
				salarioLiquido = salarioBruto - imposto
				
				escreva(nome," o Sra ira pagar 12% de IR R$ ", imposto ," seu salario liquido é R$ ", salarioLiquido)
			}
			senao se(salarioBruto > 2500){
				imposto = salarioBruto * 0.25
				salarioLiquido = salarioBruto - imposto
				
				escreva(nome," o Sra ira pagar 25% de IR R$ ", imposto ," seu salario liquido é R$ ", salarioLiquido)
			}
		}
		senao se(tratamento == "1"){ //Perguntando salario
			escreva("Olá Sr ", nome,", por favor informe seu salário: ")
			leia(salarioBruto)

			se(salarioBruto <= 1200){
				escreva(nome," o Sr tem o salario de R$ ", salarioBruto ," e está isento do imposto de renda")
			}
			senao se(salarioBruto <= 2500){
				imposto = salarioBruto * 0.12
				salarioLiquido = salarioBruto - imposto
				
				escreva(nome," o Sr ira pagar 12% de IR R$ ", imposto ," seu salario liquido é R$ ", salarioLiquido)
			}
			senao se(salarioBruto > 2500){
				imposto = salarioBruto * 0.25
				salarioLiquido = salarioBruto - imposto
				
				escreva(nome," o Sr ira pagar 25% de IR R$ ", imposto ," seu salario liquido é R$ ", salarioLiquido)
			}
		}
		senao { // Info Inválida
			escreva("Informação inválida !!\nPor favor informe o tratamento com '1' para Sr, '2' para Sra ou '3' para Sre.")
		}
		
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1330; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */