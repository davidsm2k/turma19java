package view;

import javax.swing.JOptionPane;

public class Menu {
	
	public final static String NOME_BANCO = "GERA��O";
	public final static String SLOGAN = "UM BANCO PARA TODES";
	
	public static void main(String[] args) {
		int opcoes;
		do {
			try {
			opcoes = Integer.parseInt(JOptionPane.showInputDialog(null, descricaoMenu(), "MENU BANCO GERA��O" , JOptionPane.INFORMATION_MESSAGE));
			}catch(Exception e) {
				opcoes = 0;
			}
			switch(opcoes) {
				case 1:
					JOptionPane.showMessageDialog(null,"Escolheu a op��o 1", "Acesso Autorizado", JOptionPane.ERROR_MESSAGE);
					break;
				case 2:
					JOptionPane.showMessageDialog(null,"Escolheu a op��o 2", "Acesso Autorizado", JOptionPane.ERROR_MESSAGE);
					break;
				case 3:
					JOptionPane.showMessageDialog(null,"Escolheu a op��o 3", "Acesso Autorizado", JOptionPane.ERROR_MESSAGE);
					break;
				case 4:
					JOptionPane.showMessageDialog(null,"Escolheu a op��o 4", "Acesso Autorizado", JOptionPane.ERROR_MESSAGE);
					break;
				case 5:
					JOptionPane.showMessageDialog(null,"Escolheu a op��o 5", "Acesso Autorizado", JOptionPane.ERROR_MESSAGE);
					break;
				case 6:
					JOptionPane.showMessageDialog(null,"Escolheu a op��o 6", "Acesso Autorizado", JOptionPane.ERROR_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null,"Voc� n�o escolheu uma op��o entre 1 e 6.", "Acesso Negado", JOptionPane.ERROR_MESSAGE);
			}
		}while(opcoes < 1 || opcoes > 6);
	}
	
	private static String descricaoMenu() {
		String texto = "Bem vinde ao Banco " + NOME_BANCO + "\n"
						+ SLOGAN + "\n"
						+ "\n1 - CONTA POUPAN�A"
						+ "\n2 - CONTA CORRENTE"
						+ "\n3 - CONTA ESPECIAL"
						+ "\n4 - CONTA EMPRESA"
						+ "\n5 - CONTA ESTUDANTIL"
						+ "\n6 - SAIR"
						+ "\n\nDigite o c�digo da op��o selecionada: ";
		return texto;
	}
}
