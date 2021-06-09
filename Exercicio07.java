
public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paciente paciente1 = new Paciente();
		
		paciente1.setNome("Lucas");
		paciente1.setProcedimento("Cirúrgico");
		paciente1.setRegistroHospitalar(5880);
		
		
		System.out.println("Paciente: " + paciente1.getNome());
		System.out.println("Procedimento " + paciente1.getProcedimento());
		System.out.println("Registro Hospitalar: " + paciente1.getRegistroHospitalar() + "\n");
		
		paciente1.internar();
		paciente1.darAlta();
	}

}
