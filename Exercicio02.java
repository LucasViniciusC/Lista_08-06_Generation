
public class Exercicio02 {

	public static void main(String[] args) {
	

		Aviao aviao1 = new Aviao();
		
		aviao1.setNome("A380");
		aviao1.setModelo("AirBus");
		aviao1.setAnoFabricacao(2007);
		aviao1.setTanque(320);
		aviao1.setVelocidade(0);
		
		System.out.println("Nome: " + aviao1.getNome());
		System.out.println("Modelo: " + aviao1.getModelo());
		System.out.println("Ano fabricação: " + aviao1.getAnoFabricacao());
		System.out.println("Tamanho do Tanque: " + aviao1.getTanque());
		System.out.println("Velocidade Atual" + aviao1.getVelocidade()+"\n");
		
		aviao1.Decolar();
		aviao1.Acelerar(50);
		aviao1.Reduzir(15);
		aviao1.Pousar();
	}

}
