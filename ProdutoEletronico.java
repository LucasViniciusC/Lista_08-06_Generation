
public class ProdutoEletronico {
	private String nomeProduto;
	private String categoria;
	private int qtdProduto;

	public void AdicionarEstoque(int quantidade) {
		qtdProduto += quantidade;
		System.out.println(quantidade + " Produtos adicionados no estoque, restam: " + qtdProduto);
	}

	public void RetirarEstoque(int quantidade) {
		qtdProduto -= quantidade;
		System.out.println(quantidade + " Produtos retirados do estoque, restam: " + qtdProduto);
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getQtdProduto() {
		return qtdProduto;
	}

	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
}
