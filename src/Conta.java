
public abstract class Conta implements Iconta{

	private Cliente cliente;
	private String agencia; 
	private int numeroAgencia;
	private double saldo = 0;

	public Conta(Cliente cliente, String agencia, int numeroAgencia) {
		this.cliente = cliente;
		this.agencia = agencia;
		this.numeroAgencia = numeroAgencia;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor; 
		
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
		
	} 
	@Override
	public void tranferencia(double valor, Conta conta) {
		this.sacar(valor);
		conta.depositar(valor);
	}
	public Double saldo() {
		return this.saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public String getAgencia() {
		return agencia;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}
}
