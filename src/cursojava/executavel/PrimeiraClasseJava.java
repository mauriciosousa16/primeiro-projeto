package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Discplina;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
	List<Aluno> alunos = new ArrayList<Aluno>();
	
	for(int qtd = 1;qtd <=2; qtd++) {
		String nome = JOptionPane.showInputDialog("Nome do Aluno ?" + qtd);
		String idade = JOptionPane.showInputDialog("Idade do Aluno ?");
		String cpf = JOptionPane.showInputDialog("CPF do Aluno ?");
		
			Aluno aluno = new Aluno();// objeto aluno1  aqui sera o pedro
			
			aluno.setNome(nome);
			aluno.setIdade(Integer.valueOf(idade));
			aluno.setNumeroCpf(cpf);
			
			
			for(int pos = 1; pos <=4; pos++) {
				Discplina discplina = new Discplina();
				String nomeDisciplina = JOptionPane.showInputDialog("nome da disciplina " + pos);
				String nomeNota = JOptionPane.showInputDialog("nota " + pos);
				
				discplina.setDiscplina(nomeDisciplina);
				discplina.setNota(Double.valueOf(nomeNota));
				
				aluno.getDisciplinas().add(discplina);
				
				
			}
			
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
			if(escolha == 0) {
				String disciplinaRemover = JOptionPane.showInputDialog("Qula disicplina 1,2,3, ou 4 ?");
				aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()-1);
				
			}
			System.out.println("nome do aluno : "+ aluno.getNome());
			System.out.println("idade :" + aluno.getIdade());
			System.out.println("cpf : " + aluno.getNumeroCpf());
			System.out.println("media do Aluno : " + aluno.getMediaNota());
			System.out.println("Aluno esta : " + aluno.getAlunoAprovado2());
			
			
	}
	
		
		
		
		
		
		
		
	
		
	
		
		
		
		
		
	}

}
