package executavel;

import javax.swing.JOptionPane;

import classes.Aluno;

public class principal {
	
	public static void main(String[] args) {
		
		
		/* instanciando um objeto do tipo aluno*/
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno("Maria"); /*Construtor passando um parametro*/
		Aluno aluno5 = new Aluno("Jose", 30); /*construtor passando dois paramentros*/
		
		//aluno1.setNome("joakhggkghghghkgjo"); 
		//System.out.println("aluno1= "+aluno1.getNome());
		
		
		aluno1.setNome(JOptionPane.showInputDialog("Informe o nome do aluno")); 
	//	JOptionPane.showMessageDialog(null, "Nome do aluno eh "+ aluno1.getNome());
		aluno1.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1 do aluno")));
	//	JOptionPane.showMessageDialog(null, "Nome do aluno eh "+ aluno1.getNota1());
		aluno1.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2 do aluno")));
		aluno1.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3 do aluno")));
		aluno1.setNota4(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 4 do aluno")));

	     JOptionPane.showMessageDialog(null, "A media do aluno "+ aluno1.getNome() + " eh "+  aluno1.getMediaNota());
	     
	     JOptionPane.showMessageDialog(null, "O Aluno foi "+ (aluno1.getAlunoAprovado()? "Aprovado" : "Reprovado"));
	     JOptionPane.showMessageDialog(null, "O Aluno foi "+ aluno1.getAlunoAprovado2());

		
	}

}
