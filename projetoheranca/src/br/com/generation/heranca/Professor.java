package br.com.generation.heranca;
                       //Herdou de pessoa e de funcion�rio!!!
public class Professor extends Funcionario {
	
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	private String disciplina;

}
