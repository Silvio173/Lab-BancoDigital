
public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente, String agencia, int numeroAgencia) {
		super(cliente, agencia, numeroAgencia);
	}

	@Override
	public String imprimirExtrato() {
		return "Cliente=" + super.getCliente() 
				+ ", Conta Corrente Saldo =" + super.saldo();
		}

	@Override
	public String imprimirDadosConta() {
		return "Cliente=" + super.getCliente() 
		+ ", agencia=" + super.getAgencia() 
		+ ", numeroAgencia=" + super.getNumeroAgencia() 
		+ " Conta Corrente Saldo = " + super.saldo();
	}
}
