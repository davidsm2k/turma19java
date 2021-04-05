package ATIVIDADES_AULA;

import java.util.Scanner;

public class ImpostoRenda {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double salarioBruto, salarioLiquido, imposto;
		String nome, tratamento;
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		
		System.out.println("Como voce deseja ser tratado: 1- Sr 2- Sra 3- Sre: ");
		tratamento = leia.next();
		
		if(tratamento.equals("3")){ //Perguntando salario
			System.out.println("Ol� Sre " + nome + ", por favor informe seu sal�rio: ");
			salarioBruto = leia.nextDouble();

			if(salarioBruto <= 1500){
				System.out.println(nome + " o Sre tem o salario de R$ " + salarioBruto + " e est� isente do imposto de renda");
			}
			else if(salarioBruto <= 2500){
				imposto = salarioBruto * 0.12;
				salarioLiquido = salarioBruto - imposto;
				
				System.out.println(nome + " o Sre ira pagar 12% de IR R$ " + imposto  +" seu salario liquido � R$ " + salarioLiquido);
			}
			else if(salarioBruto > 2500){
				imposto = salarioBruto * 0.25;
				salarioLiquido = salarioBruto - imposto;
				
				System.out.println(nome + " o Sre ira pagar 25% de IR R$ " + imposto + " seu salario liquido � R$ " + salarioLiquido);
			}
			
		}
		else if(tratamento.equals("2")){ //Perguntando salario
			System.out.println("Ol� Sra " + nome + ", por favor informe seu sal�rio: ");
			salarioBruto = leia.nextDouble();

			if(salarioBruto <= 1500){
				System.out.println(nome + " o Sra tem o salario de R$ " + salarioBruto  +" e est� isenta do imposto de renda");
			}
			else if(salarioBruto <= 2500){
				imposto = salarioBruto * 0.12;
				salarioLiquido = salarioBruto - imposto;
				
				System.out.println(nome + " o Sra ira pagar 12% de IR R$ " + imposto + " seu salario liquido � R$ " + salarioLiquido);
			}
			else if(salarioBruto > 2500){
				imposto = salarioBruto * 0.25;
				salarioLiquido = salarioBruto - imposto;
				
				System.out.println(nome + " o Sra ira pagar 25% de IR R$ " + imposto + " seu salario liquido � R$ "+ salarioLiquido);
			}
		}
		else if(tratamento.equals("1")){ //Perguntando salario
			System.out.println("Ol� Sr " + nome +", por favor informe seu sal�rio: ");
			salarioBruto = leia.nextDouble();

			if(salarioBruto <= 1500){
				System.out.println(nome + " o Sr tem o salario de R$ " + salarioBruto + " e est� isento do imposto de renda");
			}
			else if(salarioBruto <= 2500){
				imposto = salarioBruto * 0.12;
				salarioLiquido = salarioBruto - imposto;
				
				System.out.println(nome + " o Sr ira pagar 12% de IR R$ "+ imposto +" seu salario liquido � R$ "+ salarioLiquido);
			}
			else if(salarioBruto > 2500){
				imposto = salarioBruto * 0.25;
				salarioLiquido = salarioBruto - imposto;
				
				System.out.println(nome + " o Sr ira pagar 25% de IR R$ "+ imposto +" seu salario liquido � R$ "+ salarioLiquido);
			}
		}
		else { // Info Inv�lida
			System.out.println("Informa��o inv�lida !!\nPor favor informe o tratamento com '1' para Sr, '2' para Sra ou '3' para Sre.");
		}
	}
}