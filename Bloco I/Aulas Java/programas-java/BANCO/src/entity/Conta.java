package entity;

public class Conta {
	public int numero;
	public String cpf;
	public boolean ativa;
	public double saldo;
	
	public void debito(double valor) {
		saldo -= valor;
	}
	
	public void credito(double valor) {
		saldo += valor;
	}
}
