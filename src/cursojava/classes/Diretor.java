package cursojava.classes;
import java.util.Objects;

import cursojava.classes.Pessoa;

public class Diretor extends Pessoa {
	
	private String cargo;
	private String formacaoAcademica;
	private String registroEscolar;
	private String tempoExeriencia;
	
	public Diretor() {
		// TODO Auto-generated constructor stub
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getFormacaoAcademica() {
		return formacaoAcademica;
	}

	public void setFormacaoAcademica(String formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}

	public String getRegistroEscolar() {
		return registroEscolar;
	}

	public void setRegistroEscolar(String registroEscolar) {
		this.registroEscolar = registroEscolar;
	}

	public String getTempoExeriencia() {
		return tempoExeriencia;
	}

	public void setTempoExeriencia(String tempoExeriencia) {
		this.tempoExeriencia = tempoExeriencia;
	}

	@Override
	public String toString() {
		return "Diretor [cargo=" + cargo + ", formacaoAcademica=" + formacaoAcademica + ", registroEscolar="
				+ registroEscolar + ", tempoExeriencia=" + tempoExeriencia + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cargo, formacaoAcademica, registroEscolar, tempoExeriencia);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diretor other = (Diretor) obj;
		return Objects.equals(cargo, other.cargo) && Objects.equals(formacaoAcademica, other.formacaoAcademica)
				&& Objects.equals(registroEscolar, other.registroEscolar)
				&& Objects.equals(tempoExeriencia, other.tempoExeriencia);
	}
	
	@Override
	public boolean PessoaMairoIdade() {
		// TODO Auto-generated method stub
		return super.PessoaMairoIdade();
	}
	@Override
	public String msgMairoIdade() {
		// TODO Auto-generated method stub
		return super.msgMairoIdade();
	}

}
