package br.com.generation.heranca;
                       //Herdou de pessoa e de funcionário!!!
public class Professor extends Funcionario {
	
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	private String disciplina;

}
