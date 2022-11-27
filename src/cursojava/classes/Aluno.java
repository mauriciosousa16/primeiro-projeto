package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*classe aluno*/
public class Aluno {
	
	//atrubito
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatruculado;
	
	private List<Discplina> disciplinas = new ArrayList<Discplina>();
	

	public List<Discplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Discplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
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
	
	/*Metod que retorna  amedia do aluno*/
	public double getMediaNota() {
		double somaTotal = 0.0;
		for (Discplina discplina : disciplinas) {
			somaTotal += discplina.getNota();
		}
		return somaTotal / disciplinas.size();
	}
	
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		
		if(media >=70) {
			return true;
		}else {
			return false;
		}
	
		
	}
	
	public String  getAlunoAprovado2() {
		double media = this.getMediaNota();
		
		if(media >=50) {
			if(media >=70) {
				return "Aprovado";
			}else {
				return "Recuperação";
			}
		}else {
			return " Reprovado";
		}
			
		}
			
		
	

	@Override
	public int hashCode() {
		return Objects.hash(dataMatricula, dataNascimento, idade, nome, nomeEscola, nomeMae, nomePai, numeroCpf,
				registroGeral, serieMatruculado);
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
		return Objects.equals(dataMatricula, other.dataMatricula)
				&& Objects.equals(dataNascimento, other.dataNascimento) && idade == other.idade
				&& Objects.equals(nome, other.nome) && Objects.equals(nomeEscola, other.nomeEscola)
				&& Objects.equals(nomeMae, other.nomeMae) && Objects.equals(nomePai, other.nomePai)
				&& Objects.equals(numeroCpf, other.numeroCpf) && Objects.equals(registroGeral, other.registroGeral)
				&& Objects.equals(serieMatruculado, other.serieMatruculado);
	}

	
	
	

}
