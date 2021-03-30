package model;

public class Conta {
	public final String NOME_BANCO = "GERAÇÃO";
	public final String SLOGAN = "UM BANCO PARA TODES";
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativa;

	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public boolean isAtiva() {
		return ativa;
	}


	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}


	public String getNOME_BANCO() {
		return NOME_BANCO;
	}


	public String getSLOGAN() {
		return SLOGAN;
	}


	public Conta() {
	}


	public double debito(double saldo, double valor) {
		this.saldo -= valor;
		return saldo;
	}

	public double credito(double saldo, double valor) {
		this.saldo += valor;
		return saldo;
	}

}
