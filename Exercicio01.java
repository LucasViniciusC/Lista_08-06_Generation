
public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente();
			
		cliente1.setNome("Lucas");
		cliente1.setSobrenome("Cruz");
		cliente1.setLocalidade("São Paulo");
		cliente1.setIdade(22);
		
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getSobrenome());
		System.out.println(cliente1.getLocalidade());
		System.out.println(cliente1.getIdade());
		
		
		cliente1.Comprar();
		cliente1.Provar();
		cliente1.Andando();
	}

}
