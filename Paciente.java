
public class Paciente {

	private String nome;
	private String procedimento;
	private int registroHospitalar;

	public void internar() {
		System.out.println("Infelizmente o paciente " + nome + " ,será internado\n");
	}

	public void darAlta() {
		System.out.println("O paciente " + nome + " tera alta :) \n");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}

	public int getRegistroHospitalar() {
		return registroHospitalar;
	}

	public void setRegistroHospitalar(int registroHospitalar) {
		this.registroHospitalar = registroHospitalar;
	}

}
