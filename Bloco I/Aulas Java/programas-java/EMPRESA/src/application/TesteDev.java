package application;

import java.util.Locale;

import entity.Funcionario;
import entity.Terceiro;

public class TesteDev {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Funcionario funcionario1 = new Funcionario("1234", "Jos?");
		Funcionario funcionario2 = new Funcionario("5678", "Maria", 48, 30);
		Terceiro terceiro1 = new Terceiro("9031", "Pedro", 50);
		Terceiro terceiro2 = new Terceiro("2587", "Ed", 72, 40, 50);
		
		System.out.printf("Funcionario 1 \n Matricula: %s \n Nome: %s \n\n", funcionario1.getMatricula(), funcionario1.getNome());
		System.out.printf("Funcionario 2 \n Matricula: %s \n Nome: %s\n Hora Trabalhada: %d\n Salario por hora: R$ %.2f\n", funcionario2.getMatricula(), funcionario2.getNome(), funcionario2.getHorasTrabalhadas(), funcionario2.getValorHora());
		System.out.printf(" Salario a receber: %.2f\n\n", funcionario2.salario());
		
		System.out.printf("Terceiro 1 \n Matricula: %s \n Nome: %s \n\n", terceiro1.getMatricula(), terceiro1.getNome());
		System.out.printf("Terceiro 2 \n Matricula: %s \n Nome: %s\n Hora Trabalhada: %d\n Salario por hora: R$ %.2f\n Adicional: R$ %.2f\n", terceiro2.getMatricula(), terceiro2.getNome(), terceiro2.getHorasTrabalhadas(), terceiro2.getValorHora(), terceiro2.getAdicional());
		System.out.printf(" Salario a receber (Com  adicional): %.2f\n\n", terceiro2.salario());
	}
}
