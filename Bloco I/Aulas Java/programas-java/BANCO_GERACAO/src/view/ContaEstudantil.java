package view;

import java.util.Scanner;

import model.Conta;

public class ContaEstudantil {
	static Scanner leia = new Scanner(System.in);
	
	static double limiteEstudantil = 5000.0;
	
	public static void ContaEstudantil() {
		
		Conta ContaEstudantil = new Conta();
		
		String tipoConta, cpf, cabecalho;
		int numeroConta, tipoMov = 0, continuar = 0;
		double valorMov = 0.0;
 		
		ContaEstudantil.setTipoConta("ESTUDANTIL");
		tipoConta = ContaEstudantil.getTipoConta();
		
		System.out.println("Digite o numero da Conta: ");
		ContaEstudantil.setNumero(leia.nextInt());
		numeroConta = ContaEstudantil.getNumero();
		
		System.out.println("Digite o seu CPF: ");
		ContaEstudantil.setCpf(leia.next());
		cpf = ContaEstudantil.getCpf();
		
		cabecalho = Cabecalho.Cabecalho(tipoConta, numeroConta, cpf);
		
		//MOVIMENTAÇÃO NA CONTA ******************************************************************************
		for(int i = 1; i <= 5; i++) {
			do {
				pulaLinha();
				System.out.println(cabecalho);
				System.out.println("\nSaldo Atual: R$ " + ContaEstudantil.getSaldo() + "\n");
				
				System.out.println("\nMovimento: " + i + "\n");
				
				// Verificando Debito ou Crédito *************************************************************
				do {
					
					System.out.println("Movimento: 1-Débito / 2-Crédito / 3-Voltar: ");
					tipoMov = leia.nextInt();
										
					if(tipoMov == 1 || tipoMov == 2 || tipoMov == 3) {}
					else System.out.println("\nOpção inválida digite 1-Débito / 2-Crédito / 3- Voltar");
					
				}while(tipoMov != 1 && tipoMov != 2 && tipoMov != 3);
				// Fim Verificando Debito ou Crédito *********************************************************

				if(tipoMov == 3) break;
				
				System.out.println("\nValor Movimento: ");
				valorMov = leia.nextDouble();
				
				if(tipoMov == 1 && (ContaEstudantil.getSaldo() - valorMov) < 0) {
					System.out.println("Operação Interrompida\n"
									+ "Conta ficou negativa.\n\n"
									+ "Saldo se efetuar a operação: " + (ContaEstudantil.getSaldo() - valorMov) + "\n");
					CreditoEstudantil(ContaEstudantil, valorMov);
					// Delay ********************************
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					// Final Delay **************************
				}
			}while(tipoMov == 1 && (ContaEstudantil.getSaldo() - valorMov) < 0);
			
			if(tipoMov == 3) break;
			
			// Verificando Opcao Continuar **************************************
			do {
				System.out.println("\nContinuar 1-Sim / 2-Não: ");
				continuar = leia.nextInt();
				
				if(continuar == 1 || continuar == 2){}
				else System.out.println("\nOpção inválida digite o nº 1-Sim ou 2-Não");
				
			}while(continuar != 1 && continuar != 2);
			// Fim Verificando Opcao Continuar **********************************
			
			if(continuar == 2) break;
			else {
				if(tipoMov == 1) {
					if(ContaEstudantil.getSaldo() >= 0) {
						ContaEstudantil.debito(valorMov);
						System.out.println("\nSaldo após utilizar limite e pagar a divida: \n"
								+ "R$ " + ContaEstudantil.getSaldo());
					}
				}
				else {
					ContaEstudantil.credito(valorMov);
				}
			}
		}
		//FIM DA MOVIMENTAÇÃO NA CONTA ************************************************************************
		if(tipoMov == 3) Menu.main(null);
		pulaLinha();
		if(limiteEstudantil > 0) {
			CreditoEstudantil(ContaEstudantil, valorMov);
			Menu.main(null);
		}
		else {
			Menu.main(null);
		}
	}
	
	public static void CreditoEstudantil(Conta ContaEstudantil, double valorMov) {
		pulaLinha();
		
		int continuar = 0;
		
		//Inicio Crédito Estudantil ***********************************************
		System.out.println("Crédito Estudantil Disponivel R$ " + limiteEstudantil);
		if(limiteEstudantil <= 0) {
			System.out.println("\n\nFALIDO !!! Seu limite acabou :'(");
		}
		else{
			// Verificando Opcao Continuar **************************************************
			do {
				System.out.println("\nDeseja Utilizar o Crédito Estudantil ?\nUsar 1-Sim / 2-Não");
				continuar = leia.nextInt();
				
				if(continuar == 1 || continuar == 2) {}
				else{System.out.println("\nOpção Inválida digite 1-Sim / 2-Não");}
			}while(continuar != 1 && continuar != 2);			
			// Fim Verificacao Opcao Continuar **********************************************
			if(continuar == 2) System.out.println("\nVocê escolheu não utilizar o crédito.");
			else {
				do {
					System.out.println("\nValor Solicitado: R$ ");
					valorMov = leia.nextDouble();
					if(valorMov > limiteEstudantil) {
						System.out.println("\nSolicitação maior que o Crédito Estudantil Disponivel !\n");
						// Delay ********************************
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						// Final Delay **************************
						System.out.println("Limite de Crédito Estudantil Disponivel: " + limiteEstudantil + "\n");
					}
				}while(valorMov > limiteEstudantil);
				// Realizando Movimentação ***************************
				limiteEstudantil -= valorMov;
				ContaEstudantil.credito(valorMov);
				// Delay ********************************
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// Final Delay **************************
				System.out.println("\n\nSaldo atual após Crédito Estudantil Solicitado R$ " + ContaEstudantil.getSaldo() + "\n");
				// Delay ********************************
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// Final Delay **************************
				System.out.println("Crédito Estudantil Disponivel: R$ " + limiteEstudantil);				
				
				// Fim da Movimentação *******************************
			}
		}
		//Final Crédito Estudantil ************************************************
		pulaLinha();
	}
	
	public static void pulaLinha() {
		System.out.println("**************************************************************");
	}
}