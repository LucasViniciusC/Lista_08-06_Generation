
public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionarios funcionario1 = new Funcionarios();

		funcionario1.setNome("Lucas");
		funcionario1.setSobrenome("Cruz");
		funcionario1.setSetor("Expedi��o");
		funcionario1.setFuncao("Conferente");

		System.out.println("Nome do funcion�rio: " + funcionario1.getNome());
		System.out.println("Sobrenome: " + funcionario1.getSobrenome());
		System.out.println("Setor: " + funcionario1.getSetor());
		System.out.println("Fun��o: " + funcionario1.getFuncao());

		funcionario1.ferias();
		funcionario1.mudarSetor("Vendas");

		System.out.println("Nome do funcion�rio: " + funcionario1.getNome());
		System.out.println("Sobrenome: " + funcionario1.getSobrenome());
		System.out.println("Setor: " + funcionario1.getSetor());
		System.out.println("Fun��o: " + funcionario1.getFuncao());
	}

}
