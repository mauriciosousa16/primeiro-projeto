package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cursojava.constantes.StatusAluno;

/*classe aluno*/
public class Aluno  extends Pessoa{
	
	//atrubito
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatruculado;
	
	
	/*lista de Disciplinas*/
	private List<Discplina> disciplinas = new ArrayList<Discplina>();
	

	public List<Discplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Discplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatruculado() {
		return serieMatruculado;
	}

	public void setSerieMatruculado(String serieMatruculado) {
		this.serieMatruculado = serieMatruculado;
	}
	
	
	/*contrutor*/
	public Aluno() {
		
	}
	
	/*Metodo que retorna  amedia do aluno*/
	public double getMediaNota() {
		double somaTotal = 0.0;
		for (Discplina discplina : disciplinas) {
			somaTotal += discplina.getNota();
		}
		return somaTotal / disciplinas.size();
	}
	// metodo simples para saber se o Aluno esta Aprovado ou não com boolean
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		
		if(media >=70) {
			return true;
		}else {
			return false;
		}
	
		
	}
	// metodo para saber se o Aluno esta Aprovado ou não
	public String  getAlunoAprovado2() {
		double media = this.getMediaNota();
		
		if(media >=50) {
			if(media >=70) {
				return StatusAluno.APROVADO;
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {
			return StatusAluno.REPROVADO;
		}
			
		}

	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatruculado="
				+ serieMatruculado + ", disciplinas=" + disciplinas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataMatricula, disciplinas, nomeEscola, serieMatruculado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataMatricula, other.dataMatricula) && Objects.equals(disciplinas, other.disciplinas)
				&& Objects.equals(nomeEscola, other.nomeEscola)
				&& Objects.equals(serieMatruculado, other.serieMatruculado);
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
