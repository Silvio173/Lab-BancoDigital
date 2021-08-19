import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com seu nome = ");
		String nome = sc.next(); 
		System.out.print("Entre com sua idade = ");
		int idade = sc.nextInt(); 
		
		Cliente cliente1 = new Cliente(nome, idade);
		
		Conta cc = new ContaCorrente(cliente1, "Alphaville", 122);
		
		Conta cp = new ContaPoupanca(cliente1, "Alphaville", 122);
		
		System.out.println(cc.imprimirDadosConta());
		System.out.println(cp.imprimirDadosConta());
		System.out.println();
		
		System.out.print("Digite o valor do deposito = ");
		double valor = sc.nextDouble();
		
		System.out.println("== No dia XX realizou deposito C/C de = " + valor);
		cc.depositar(valor);
		System.out.println(cc.imprimirExtrato());
		System.out.println();
		
		System.out.print("Digite o valor para tranferir para poupanca = ");
		valor = sc.nextDouble();
		
		System.out.println("== No dia XX realizou transferenia para poupanca de =" + valor);
		cc.tranferencia(valor, cp);
		System.out.println(cc.imprimirExtrato());
		System.out.println(cp.imprimirExtrato());
	}

}
