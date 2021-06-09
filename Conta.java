
public class Conta {

	private String nome;
	private String sobrenome;
	private int numConta;
	private double saldo;

	public void sacar(int valorSaque) {
		saldo -= valorSaque;
		System.out.println("Foi sacado " + saldo + " R$");
	}

	public void depositar(int valorDeposito) {
		saldo += valorDeposito;
		System.out.println("Foi depositado " + valorDeposito + " R$");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
