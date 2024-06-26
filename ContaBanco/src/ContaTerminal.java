import java.util.Scanner;

public class ContaTerminal {
	
	static int conta;
	static String agencia;
	static String nomeCliente;
	static float saldo;
	
	static Scanner input = new Scanner(System.in);
	
	public static void print(String text) {
		System.out.print(text);
	}
	
	public static void main(String[] args) {
		print("CONTA TERMINAL");
		print("\n");
		print("Informe o numero da conta: ");
		conta = input.nextInt();
		input.nextLine();
		print("Informe o numero da agencia: ");
		agencia = input.nextLine();
		print("Informe o nome do cliente: ");
		nomeCliente = input.nextLine();
		print("Informe o saldo da conta: ");
		saldo = input.nextFloat();
		print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
				+ "sua agencia e " + agencia + ", conta " + conta + " e seu saldo de "
				+ saldo + " já esta disponivel para saque.");
				
	}

}
