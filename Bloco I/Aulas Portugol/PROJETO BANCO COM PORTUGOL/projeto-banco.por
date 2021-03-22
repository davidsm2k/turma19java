programa
{
	inclua biblioteca Texto
	inclua biblioteca Util
	const cadeia _NOME_BANCO = "DGR-TJ"
	const cadeia _SLOGAN = "'VAMO QUE VAMO - VAI DA BOM'"
	cadeia tipo	
	logico ativa
	inteiro opcoes = 0
		
	funcao inicio()
	{		
		inteiro numeroConta
		cadeia cpf	
		real saldo = 0.0	

		escreva("Digite o numero da conta: ")
		leia(numeroConta)
		limpa()

		escreva("Digite o seu CPF: ")
		leia(cpf)
		limpa()
		
		menu(numeroConta, cpf, saldo)		
	}
	
	funcao menu(inteiro numeroConta, cadeia cpf, real saldo)
	{
		faca{
			escreva("Bem vinde ao Banco ", _NOME_BANCO,"\n")
			escreva(_SLOGAN,"\n")
		
			escreva("\n1 - CONTA POUPANÇA")
			escreva("\n2 - CONTA CORRENTE")
			escreva("\n3 - CONTA ESPECIAL")
			escreva("\n4 - CONTA EMPRESA")
			escreva("\n5 - CONTA ESTUDANTIL")
			escreva("\n6 - SAIR")
					
			escreva("\n\nDigite o código da opção selecionada: ")
			leia(opcoes)
			limpa()

			se(opcoes < 1 ou opcoes > 6){
				escreva("Você não escolheu uma opção entre 1 e 6.")
				Util.aguarde(2000)
				limpa()
			}
			senao se(opcoes == 5){
				contaEstudantil(numeroConta, cpf, saldo)
			}
			senao se(opcoes == 6){
				escreva("Até logo,\nObrigado por acessar o nosso sistema !\n")
				Util.aguarde(2000)
				limpa()
				escreva("FIM !")
			}
		}
		enquanto(opcoes < 1 ou opcoes > 6)
	}
	
	funcao cabecalho(cadeia tipoConta, inteiro numeroConta, cadeia cpf)
	{
		escreva("Banco ", _NOME_BANCO)
		escreva("\nSLOGAN: ", _SLOGAN)		
		escreva("\n\nCONTA ", tipoConta)
		escreva("\n\nCONTA Nº: ", numeroConta)
		escreva("\nCPF: ", cpf)
	}

	funcao real debito(real saldo, real valor){
		saldo -= valor

		retorne saldo
	}
	funcao real credito(real saldo, real valor){
		saldo += valor

		retorne saldo
	}
	
	funcao contaEstudantil(inteiro numeroConta, cadeia cpf, real saldo)
	{
		cadeia tipoMov, continuar
		real limiteEstudantil = 5000.00
		real valorMov
		
		tipo = "ESTUDANTIL"
		
		cabecalho(tipo, numeroConta, cpf)
		// Movimentação da Conta ********************************************************
		para(inteiro i = 1; i<= 10; i++){
			faca{
				escreva("\nMovimento: ", i,"\n")
				escreva("\nSaldo Atual: R$ ", saldo)
	
				//Verificando Debito ou Credito ********************************************
				faca{
					escreva("\nMovimento: D - Débito ou C - Crédito ou V - Voltar: ")
					leia(tipoMov)
					tipoMov = Texto.caixa_alta(tipoMov)
					
					se(tipoMov == "D" ou tipoMov == "C" ou tipoMov == "V" ){}
					senao{ escreva("\nOpção inválida digite D - Débito ou C - Crédito") }
					
				}enquanto(tipoMov != "D" e tipoMov != "C" e tipoMov != "V")
				//**************************************************************************

				se (tipoMov == "V"){
					limpa()
					menu(numeroConta, cpf, saldo)
				}
				
				escreva("\nValor Movimento: R$ ")
				leia(valorMov)
	
				se(tipoMov == "D" e (debito(saldo, valorMov) < 0)){
					escreva("Operação Interrompida\n")
					escreva("Conta ficou negativa.\n\n")
					escreva("Saldo se efetuar a operação: ", debito(saldo, valorMov),"\n")
					Util.aguarde(3000)
					limpa()
				}
			}enquanto(tipoMov == "D" e (debito(saldo, valorMov) < 0))
						
			// Verificando Opcao Continuar **************************************************
			faca{
				escreva("\nContinuar S/N: ")
				leia(continuar)
	
				continuar = Texto.caixa_alta(continuar)
				
				se(continuar == "S" ou continuar == "N"){}
				senao{ escreva("\nOpção inválida digite S-Sim ou N-Não") }
				
			}enquanto(continuar != "S" e continuar != "N")
			//********************************************************************************
			se(continuar == "N"){ i = 11 }
			senao {
				se(tipoMov == "D"){
					saldo = debito(saldo, valorMov)
				}
				senao{
					saldo = credito(saldo, valorMov)
				}
			}
		}// Final Movimentação da Conta *****************************************************
		
		Util.aguarde(2000)
		limpa()
		
		//Usar Credito Estudantil ************************************************************
		escreva("Crédito Estudantil Disponivel: ", limiteEstudantil)
		
		// Verificando Opcao Continuar **************************************************
			faca{
				escreva("\nDeseja utilizar o Crédito Estudantil ?\nUsar S/N: ")
				leia(continuar)
	
				continuar = Texto.caixa_alta(continuar)
				
				se(continuar == "S" ou continuar == "N"){}
				senao{ escreva("\nOpção inválida digite S-Sim ou N-Não") }
				
			}enquanto(continuar != "S" e continuar != "N")
		//********************************************************************************
		se(continuar == "N"){}
		senao{
			faca{
				escreva("\nValor Movimento: R$ ")
				leia(valorMov)	
				se(valorMov > limiteEstudantil){
					escreva("\nSolicitação maior que o Crédito Estudantil Permitido !\n")
					Util.aguarde(2000)
					limpa()
					escreva("Limite de Crédito Estudantil Disponivel: ", limiteEstudantil, "\n")
				}
			}enquanto(valorMov > limiteEstudantil)		
				limiteEstudantil -= valorMov
				saldo += valorMov
				Util.aguarde(2000)
				escreva("\n\nSaldo Atual: ", saldo)
		}		
		//Final Credito Estudantil ***********************************************************
		Util.aguarde(2000)
		limpa()
		
		menu(numeroConta, cpf, saldo)
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2686; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */