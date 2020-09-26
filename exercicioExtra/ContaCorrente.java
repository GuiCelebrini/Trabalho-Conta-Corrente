package exercicioExtra;

public class ContaCorrente {
	
	protected double saldo;

	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valorDeposito) {
		
		this.saldo += valorDeposito;
		
	}
	
	public void sacar(double valorSacado) {
		double taxaDeOperacao = valorSacado * 0.05;
		this.saldo -= (valorSacado+taxaDeOperacao);
	}
	

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	

}
