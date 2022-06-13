package br.com.generation.heranca;
                         //Fiz isso aqui pra gerar a Herança. o Funcionário HERDA atributos de pessoas.
public class Funcionario extends Pessoa {
	
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
