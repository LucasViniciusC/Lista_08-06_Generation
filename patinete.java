
public class patinete {
	private String cor;
	private int quantidadeRodas;
	
	
	public void andar(){
		System.out.println("Andando com o patinete");
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}

	public void setQuantidadeRodas(int quantidadeRodas) {
		this.quantidadeRodas = quantidadeRodas;
	}

	public void parar() {
		System.out.println("Parando de andar com o patinente");
	}
}
