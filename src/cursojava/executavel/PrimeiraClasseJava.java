package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Discplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
         
		/*lista de alunos*/
		List<Aluno> alunos = new ArrayList<Aluno>();
        
		//varendo uma lista de alunos pela quantidade 
		for (int qtd = 1; qtd <= 2; qtd++) {
			String nome = JOptionPane.showInputDialog("Nome do Aluno ?" + qtd);
			String idade = JOptionPane.showInputDialog("Idade do Aluno ?");
			String cpf = JOptionPane.showInputDialog("CPF do Aluno ?");

			Aluno aluno = new Aluno();// objeto aluno1 aqui sera o pedro

			aluno.setNome(nome);
			aluno.setIdade(Integer.valueOf(idade));
			aluno.setNumeroCpf(cpf);
            //vareendo a lista de disciplinas por posições
			for (int pos = 1; pos <= 2; pos++) {
				Discplina discplina = new Discplina();
				String nomeDisciplina = JOptionPane.showInputDialog("nome da disciplina " + pos);
				String nomeNota = JOptionPane.showInputDialog("nota " + pos);

				discplina.setDiscplina(nomeDisciplina);
				discplina.setNota(Double.valueOf(nomeNota));

				aluno.getDisciplinas().add(discplina);

			}
             // removendo disciplinas 
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

			if (escolha == 0) {

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qula disicplina 1,2,3, ou 4 ?");
					aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar Removendo ?");
				}

			}
			alunos.add(aluno);
		}
		
		// removendo aluno da lista 
		/*for (Aluno aluno : alunos) {
			if (aluno.getNome().equalsIgnoreCase("lucas")) {
				alunos.remove(aluno);
				//break;
			} else {
				System.out.println("nome do aluno : " + aluno.getNome());
				System.out.println("idade :" + aluno.getIdade());
				System.out.println("cpf : " + aluno.getNumeroCpf());
				System.out.println("media do Aluno : " + aluno.getMediaNota());
				System.out.println("Aluno esta : " + aluno.getAlunoAprovado2());
				System.out.println("======================================================");
			}

		}
		
		// vareendo lista de alunos que sobraram da lista
		for (Aluno aluno : alunos) {
			System.out.println("Alunos que sobraram na lista");
			System.out.println(aluno.getNome());
			System.out.println("Suas Materias São:");
			for(Discplina discplina : aluno.getDisciplinas()) {
				System.out.println(discplina.getDiscplina());
			}
		}*/
		
		// percoreendo lista por posições
		for(int pos = 0; pos < alunos.size(); pos++) {
			Aluno aluno = alunos.get(pos);
			//subistituindo aluno dentro da lista
			if(aluno.getNome().equalsIgnoreCase("mauricio")) {
			Aluno trocar = new Aluno();
			trocar.setNome("isluc");
			Discplina discplina = new Discplina();
			discplina.setDiscplina("java web");
			discplina.setNota(89);
			discplina.setDiscplina("poo");
			discplina.setNota(78);
			
			trocar.getDisciplinas().add(discplina);
			
			alunos.set(pos, trocar);//trocando o aluno
			aluno = alunos.get(pos);
			}
			
			System.out.println("nome do aluno : " + aluno.getNome());
			System.out.println("idade :" + aluno.getIdade());
			System.out.println("cpf : " + aluno.getNumeroCpf());
			System.out.println("media do Aluno : " + aluno.getMediaNota());
			System.out.println("Aluno esta : " + aluno.getAlunoAprovado2());
			System.out.println("======================================================");
			
			for(Discplina disc : aluno.getDisciplinas()) {
				System.out.println("Materia : " + disc.getDiscplina() + " nota : " + disc.getNota());
			}
		}

	}

}
