
public class Cliente {

	private String nome;
	private String sobrenome;
	private String localidade;
	private int idade;
	
	public void Comprar() {
		System.out.println(nome + " Está comprando um produto!");
	}
	public void Provar() {
		System.out.println(nome + " Está provando algo!");
	}
	public void Andando() {
		System.out.println(nome + " Está andando pela loja!");
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
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
