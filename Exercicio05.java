
public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		patinete patinete1  = new patinete();
		
		
		patinete1.setCor("Roxo");
		patinete1.setQuantidadeRodas(4);
		
		System.out.println("O patinete é da a cor: " + patinete1.getCor());
		System.out.println("O patinete tem " + patinete1.getQuantidadeRodas()+ " Rodas\n");
		
		patinete1.andar();
		patinete1.parar();
	}

}
