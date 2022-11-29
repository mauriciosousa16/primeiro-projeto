package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Discplina;
import cursojava.classes.Secretario;

public class TesteClassesFilhas {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("login");
		String senha = JOptionPane.showInputDialog("senha");

		if (login.equalsIgnoreCase("test") && senha.equalsIgnoreCase("123")) {

			for (int qnt = 1; qnt <= 2; qnt++) {
				List<Aluno> alunos = new ArrayList<Aluno>();

				String nome = JOptionPane.showInputDialog("nome" + qnt);
				String idade = JOptionPane.showInputDialog("idade");
				
				Aluno aluno = new Aluno();
				aluno.setNome(nome);
				aluno.setIdade(Integer.valueOf(idade));
				alunos.add(aluno);
				
				for(int pos = 1; pos <= 4; pos++) {
					List<Discplina> disciplinas = new ArrayList<Discplina>();
					
					String discip = JOptionPane.showInputDialog("Disciplina " + pos);
					String nota = JOptionPane.showInputDialog("Nota " + pos );
					
					Discplina disciplina = new Discplina();
					disciplina.setDiscplina(discip);
					disciplina.setNota(Double.valueOf(nota));
					disciplinas.add(disciplina);
					
					
				}
				
				
				
				
				System.out.println("*******************************************");
				System.out.println("nome :" + aluno.getNome());
				System.out.println("idade :" + aluno.getIdade());
				System.out.println("media : " + aluno.getMediaNota());
				System.out.println("media : "+ aluno.getAlunoAprovado2());
				System.out.println(aluno.msgMairoIdade());
				
				
			}
			
				String nomeSecretario = JOptionPane.showInputDialog("nome ");
				String idadeSecretario = JOptionPane.showInputDialog("idade ");
				String cargo = JOptionPane.showInputDialog("Cargo");
				
				Secretario secretario = new Secretario();
				secretario.setNome(nomeSecretario);
				secretario.setIdade(Integer.valueOf(idadeSecretario));
				secretario.setCargo(cargo);
				
				
				String nomeDiretor = JOptionPane.showInputDialog("nome ");
				String idadeDiretor = JOptionPane.showInputDialog("idade ");
				String cargoDiretor = JOptionPane.showInputDialog("Cargo");
				
				Diretor diretor = new Diretor();
				diretor.setNome(nomeDiretor);
				diretor.setIdade(Integer.valueOf(idadeDiretor));
				diretor.setCargo(cargoDiretor);
				
				
				System.out.println("*******************************************");
				System.out.println("nome : " + secretario.getNome());
				System.out.println("idade :" + secretario.getIdade());
				System.out.println("cargo :" + secretario.getCargo());
				System.out.println(secretario.msgMairoIdade());
				
				System.out.println("*******************************************");
				System.out.println("nome :" + diretor.getNome());
				System.out.println("idade :" + diretor.getIdade() );
				System.out.println("cargo : " + diretor.getCargo());
				System.out.println(diretor.msgMairoIdade());
				
				
				
			

			
			
			

		} else {
			JOptionPane.showMessageDialog(null, "login ou senha estão incorretos");
		}
		
		
		
	}

}
