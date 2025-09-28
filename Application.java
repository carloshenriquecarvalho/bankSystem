package projetosolo;

import java.util.ArrayList;
import java.util.Iterator;

public class Application {
	public static void main(String[] args) {

		ContaCorrente contaCorrente1 = new ContaCorrente("Carlos Henrique", 854.34, 700);
		ContaCorrente contaCorrente2 = new ContaCorrente("Melissa", 12.74, 200);
		ContaCorrente contaCorrente3 = new ContaCorrente("Vanderleia", 1200, 3390);
		ContaCorrente contaCorrente4 = new ContaCorrente("Joaquim", 1980.23, 23000);
		ContaCorrente contaCorrente5 = new ContaCorrente("Marcos Fagundes", 6545, 8567);
		ContaCorrente contaCorrente6 = new ContaCorrente("Felipe Mafra", 15938, 21989);

		ArrayList<ContaCorrente> arrayListContasAbertas = new ArrayList<>();

		arrayListContasAbertas.add(contaCorrente1);
		arrayListContasAbertas.add(contaCorrente2);
		arrayListContasAbertas.add(contaCorrente3);
		arrayListContasAbertas.add(contaCorrente4);
		arrayListContasAbertas.add(contaCorrente5);
		arrayListContasAbertas.add(contaCorrente6);
		
		arrayListContasAbertas.set(0, contaCorrente6);

		Iterator<ContaCorrente> iteratorContaCorrente = arrayListContasAbertas.iterator();

		while (iteratorContaCorrente.hasNext()) {
			ContaCorrente conta = iteratorContaCorrente.next();

			System.out.printf("Titular da conta: %s%nSaldo em conta: %.2f%nLimite do cheque especial: %.2f %n%n",
					conta.getTitular(), conta.getSaldo(), conta.getLimiteChequeEspecial());

		}

	}
}
