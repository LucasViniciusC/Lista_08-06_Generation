
public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProdutoEletronico controle = new ProdutoEletronico();
		
		controle.setNomeProduto("Controle PS4");
		controle.setCategoria("Consoles e Games");
		controle.setQtdProduto(20);
		
		System.out.println("Produto: " + controle.getNomeProduto());
		System.out.println("Categoria: " + controle.getCategoria());
		System.out.println("Qunatidade em estoque: " + controle.getQtdProduto());
		
		controle.AdicionarEstoque(5);
		controle.RetirarEstoque(5);
		
		
	}

}
