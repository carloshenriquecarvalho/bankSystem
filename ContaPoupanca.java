package projetosolo;

public class ContaPoupanca extends ContaBancaria{
	
	private double taxaDeJuros;
	
	public ContaPoupanca(String titular, double saldo, double taxaDeJuros) {
		super(titular, saldo);
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public void setTaxaDeJurus(double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}
	
	public void gerarRendimento() {
		if (taxaDeJuros > 0) {
			setSaldo(getSaldo() + (getSaldo() * getTaxaDeJuros()));
		} else {
			System.out.println("Erro: juros com valor invalido.");
		}
		
	}
	
	@Override
	public void sacar(double valor) {
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
		} else {
			System.out.println("Erro: saldo insuficiente. Operacao negada.");
		}
	}
}
