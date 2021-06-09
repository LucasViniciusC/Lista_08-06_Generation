
public class Aviao {
	
	private String modelo;
	private String nome;
	private int anoFabricacao;
	private int tanque;
	private int velocidade;
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getTanque() {
		return tanque;
	}

	public void setTanque(int tanque) {
		this.tanque = tanque;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public void Decolar(){
		System.out.println("Avião decolou");
	}
	
	public void Pousar() {
		System.out.println("Avião pousou");
	}
	
	public void Acelerar(int aceleracao){
		velocidade += aceleracao;
		System.out.println("Acelerando o avião, velocidade atual é de: " + velocidade);
	}
	
	public void Reduzir(int reduzir) {
		velocidade -= reduzir;
		System.out.println("Reduzindo a velocidade atual é de: " + velocidade);
	}
}
