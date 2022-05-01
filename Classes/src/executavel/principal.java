package executavel;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.disciplina;

public class principal {
	
	public static void main(String[] args) {
		
		
	
		Aluno aluno1 = new Aluno();		
		aluno1.setNome(JOptionPane.showInputDialog("Informe o nome do aluno")); 
		aluno1.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Informe a idade")));
		aluno1.setNumeroCpf(JOptionPane.showInputDialog("Informe a cpf"));
		
		
		
		for (int i =1; i <=4; i++ ) {
			
			disciplina disco = new disciplina();
			
			disco.setDisciplina(JOptionPane.showInputDialog("Informe a disciplina"));
			disco.setNota(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do aluno")));
			
			aluno1.getDiscs().add(disco);
			
			
		}
		
		
		 JOptionPane.showMessageDialog(null, "O Cpf do aluno "+ aluno1.getNome() + " eh "+  aluno1.getNumeroCpf());
		 JOptionPane.showMessageDialog(null, "Idade do aluno eh "+ aluno1.getIdade());
	     JOptionPane.showMessageDialog(null, "A media do aluno "+ aluno1.getNome() + " eh "+  aluno1.getMediaNota());		     
	     JOptionPane.showMessageDialog(null, "O Aluno foi "+ (aluno1.getAlunoAprovado()? "Aprovado" : "Reprovado"));
	     JOptionPane.showMessageDialog(null, "O Aluno foi "+ aluno1.getAlunoAprovado2());
	   
	   //  System.out.println(aluno1.toString());
	     
  
	     
		
	}

}
