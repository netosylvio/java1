package classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	

	String nome;
	int idade; 
	String numeroCpf;


	//  criando o objeto disc que é da classee disciplina
  private disciplina disc =  new disciplina ();
  
  
  //criando um lista de objetos
  private List<disciplina> discs = new ArrayList<disciplina>();
 
  
	
	
	//metodo que retorna a media
	public double getMediaNota() {
	
		double soma = 0;
		for (disciplina disc : discs) {
			soma += disc.getNota();
		}
		return soma / discs.size();
		
	}
	//metodo se o aluno foi aprovado
	public boolean getAlunoAprovado () {
	  double media = this.getMediaNota();
	  if (media >= 10) {
	    return true ; 
	  } else {
		  return false;
	  }
	}
	
	
	public String getAlunoAprovado2 () {
		  double media = this.getMediaNota();
		  if (media >= 10) {
		    return "Aprovado!!!" ; 
		  } else {
			  return "Reprovado!!!";
		  }
		}
	
	
	  //set and get da lista 
	  public void setDiscs(List<disciplina> discs) {
		this.discs = discs;
	}
	  
	  public List<disciplina> getDiscs() {
		return discs;
	}
	  
	  //set and get do objeto
	 public void setDisc(disciplina disc) {
	this.disc = disc;
	}
	public disciplina getDisc() {
		return disc;
	}

	
// daqui para baixo setter and getters
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

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	}
	
	

	

