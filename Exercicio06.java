import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int operacao;
		Conta conta1 = new Conta();

		conta1.setNumConta(1111);
		conta1.setSaldo(200.00);

		System.out.println("Informe o seu nome: ");
		conta1.setNome(entrada.nextLine());

		System.out.println("Informe o seu sobrenome: ");
		conta1.setSobrenome(entrada.nextLine());

		System.out.println(conta1.getNome());
		System.out.println("Conta: " + conta1.getNumConta());
		System.out.println("Saldo " + conta1.getSaldo());

		System.out.println("===== Digite uma opção (1)Depoitar - (2)Sacar - (3)Extrato =====");
		operacao = entrada.nextInt();

		if (operacao == 1) {
			System.out.println("Informe o valor do deposito: ");
			conta1.depositar(entrada.nextInt());
		}
		
		if(operacao == 2) {
			System.out.println("Informe o valor a ser sacado: ");
			conta1.sacar(entrada.nextInt());
		}
		
		if(operacao < 3) {
			
			System.out.println("===== Digite uma opção (1)Depoitar - (2)Sacar - (3)Extrato =====");
			operacao = entrada.nextInt();
		}
		
		if(operacao == 3) {
			System.out.println("====EXTRATO====\n");
			System.out.println("Conta: " + conta1.getNumConta());
			System.out.println("Saldo: " + conta1.getSaldo());
		}
		
		entrada.close();
	}

}
