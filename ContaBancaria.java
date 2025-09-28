package projetosolo;

public abstract class ContaBancaria implements Sacar {

	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		this.saldo = saldo;
		this.titular = titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

}
