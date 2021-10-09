package metodos.sem.retorno;

public class Conta {

	int numeroConta;
	String titular;
	Double saldo;
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
}
