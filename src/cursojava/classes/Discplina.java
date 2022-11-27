package cursojava.classes;

import java.util.Objects;

public class Discplina {
	
	private String discplina;
	private double nota;
	
	
	
	public String getDiscplina() {
		return discplina;
	}
	public void setDiscplina(String discplina) {
		this.discplina = discplina;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	@Override
	public int hashCode() {
		return Objects.hash(discplina, nota);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Discplina other = (Discplina) obj;
		return Objects.equals(discplina, other.discplina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	
	

}
