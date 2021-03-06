package CADASTRO_CLIENTE_LOJA;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pessoa {
	Calendar cal = GregorianCalendar.getInstance();
	
	private final int ANO_ATUAL = cal.get(Calendar.YEAR);
	
	public String nome;
	public int anoNascimento;
	public char genero;
	
	public int calcularIdade() {
		return ANO_ATUAL - anoNascimento;
	}
	
	public int calcularIdade(int anoAtual) {
		return anoAtual - anoNascimento;
	}
	
	public String tratamento() {
		//1 - feminino / 2- masculino / 3 - outros
		String saida = null;
		if(genero == '1') {
			saida = "Sra";
		}else if(genero == '2') {
			saida = "Sr";
		}else if(genero == '3') {
			saida = "Sre";
		}
		
		return saida;
	}
	
	public String trasArtigo() {
		//1 - feminino / 2- masculino / 3 - outros
		String saida = null;
		if(genero == '1') {
			saida = "a";
		}else if(genero == '2') {
			saida = "o";
		}else if(genero == '3') {
			saida = "e";
		}
		
		return saida;
	}
	
	public void mostraIdade() {
		System.out.printf("%s %s %s tem %d anos\n", trasArtigo().toUpperCase(), tratamento(), nome, calcularIdade());
	}
	
}
