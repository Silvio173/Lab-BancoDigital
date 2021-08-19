
public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente, String agencia, int numeroAgencia) {
		super(cliente, agencia, numeroAgencia);
	}
	@Override
	public String imprimirExtrato() {
		return "Cliente=" + super.getCliente() 
				+ ", Conta Poupanca Saldo =" + super.saldo();
		}

	@Override
	public String imprimirDadosConta() {
		return "Cliente=" + super.getCliente() 
		+ ", agencia=" + super.getAgencia() 
		+ ", numeroAgencia=" + super.getNumeroAgencia() 
		+ " Conta Poupanca Saldo = " + super.saldo();
	}

}
