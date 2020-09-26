package exercicioExtra;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaCorrente minhaConta = new ContaCorrente(5000);
		ClienteEspecial novaConta = new ClienteEspecial(5000);
		
		minhaConta.depositar(1000);
		minhaConta.sacar(100);
		System.out.println(minhaConta.getSaldo());
		
		novaConta.depositar(1000);
		novaConta.sacar(100);
		System.out.println(novaConta.getSaldo());
		
		

	}

}
