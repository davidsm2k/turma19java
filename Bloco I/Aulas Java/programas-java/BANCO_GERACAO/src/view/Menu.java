package view;

import javax.swing.JOptionPane;

public class Menu {
	
	public final static String NOME_BANCO = "GERAÇÃO";
	public final static String SLOGAN = "UM BANCO PARA TODES";
	
	public static void main(String[] args) {
		int opcoes;
		do {
			try {
			opcoes = Integer.parseInt(JOptionPane.showInputDialog(null, descricaoMenu(), "MENU BANCO GERAÇÃO" , JOptionPane.INFORMATION_MESSAGE));
			}catch(Exception e) {
				opcoes = 0;
			}
			switch(opcoes) {
				case 1:
					JOptionPane.showMessageDialog(null,"Escolheu a opção 1", "Acesso Autorizado", JOptionPane.ERROR_MESSAGE);
					break;
				case 2:
					JOptionPane.showMessageDialog(null,"Escolheu a opção 2", "Acesso Autorizado", JOptionPane.ERROR_MESSAGE);
					break;
				case 3:
					JOptionPane.showMessageDialog(null,"Escolheu a opção 3", "Acesso Autorizado", JOptionPane.ERROR_MESSAGE);
					break;
				case 4:
					JOptionPane.showMessageDialog(null,"Escolheu a opção 4", "Acesso Autorizado", JOptionPane.ERROR_MESSAGE);
					break;
				case 5:
					JOptionPane.showMessageDialog(null,"Escolheu a opção 5", "Acesso Autorizado", JOptionPane.ERROR_MESSAGE);
					break;
				case 6:
					JOptionPane.showMessageDialog(null,"Escolheu a opção 6", "Acesso Autorizado", JOptionPane.ERROR_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null,"Você não escolheu uma opção entre 1 e 6.", "Acesso Negado", JOptionPane.ERROR_MESSAGE);
			}
		}while(opcoes < 1 || opcoes > 6);
	}
	
	private static String descricaoMenu() {
		String texto = "Bem vinde ao Banco " + NOME_BANCO + "\n"
						+ SLOGAN + "\n"
						+ "\n1 - CONTA POUPANÇA"
						+ "\n2 - CONTA CORRENTE"
						+ "\n3 - CONTA ESPECIAL"
						+ "\n4 - CONTA EMPRESA"
						+ "\n5 - CONTA ESTUDANTIL"
						+ "\n6 - SAIR"
						+ "\n\nDigite o código da opção selecionada: ";
		return texto;
	}
}
