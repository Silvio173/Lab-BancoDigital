
public interface Iconta {
	void depositar(double valor);
	void sacar(double valor);
	void tranferencia(double valor,Conta conta);
	String imprimirDadosConta();
	String  imprimirExtrato();
	
}
