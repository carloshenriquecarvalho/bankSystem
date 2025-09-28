package projetosolo;

public class ContaCorrente extends ContaBancaria {

	private double limiteChequeEspecial;
	
	public ContaCorrente(String titular, double saldo, double limiteChequeEspecial) {
		super(titular, saldo);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	@Override
	public void sacar(double valor) {
		if (valor <= (getSaldo() + getLimiteChequeEspecial())) {
			setSaldo(getSaldo() - valor);
		} else {
			System.out.println("Erro: saldo insuficiente. Operacao negada.");
		}
	}
}
