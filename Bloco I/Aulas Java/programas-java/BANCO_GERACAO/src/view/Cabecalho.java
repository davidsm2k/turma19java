package view;

public class Cabecalho extends Menu {
	public static String Cabecalho(String tipoConta, int numeroConta, String cpf) {
		String texto = "Bem vinde ao Banco " + NOME_BANCO + "\n"
				+ SLOGAN
				+ "\n\nTIPO DE CONTA: " + tipoConta
				+ "\n\nCONTA N�: " + numeroConta
				+ "\nCPF: " + cpf;
		
		return texto;
	}
}
