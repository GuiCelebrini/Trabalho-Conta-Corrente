package exercicioExtra;

public class ClienteEspecial extends ContaCorrente {


	public ClienteEspecial(double saldo) {
		super(saldo);
	}

	@Override
	public void sacar(double valorSacado) {
		double taxaDeOperacao = valorSacado * 0.01;
		this.saldo -= (valorSacado+taxaDeOperacao);
	}

}
