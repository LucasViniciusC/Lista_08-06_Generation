
public class Funcionarios {

	private String nome;
	private String sobrenome;
	private String setor;
	private String funcao;

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

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	private double salario;

	public void ferias() {
		System.out.println(nome + " " + sobrenome + ", Irá entrar de férias.");
	}

	public void mudarSetor(String novoSetor) {
		setor = novoSetor;
		System.out.println(nome + " " + sobrenome + " Está no setor de: " + setor);
	}
}
