package br.com.generation.heranca;

//import java.util.Scanner;

public class testatodos {
	
	public static void main(String[] args) {
		
		//Scanner entrada = new Scanner(System.in);
		
		Professor prof1 = new Professor();//construindo objeto professor. o objeto é o prof1, baseado na classe Professor
		
		System.out.println("Nome do professor: ");
		//prof1.setNome(entrada.next());
		prof1.setIdade(25);
		prof1.setEndereço("Rua das Nações, 255 - SP");
		
		prof1.setSalario(10000.0);
		prof1.setDisciplina("Geografia");
		
		System.out.println(prof1.getNome());
		System.out.println(prof1.getIdade());
		System.out.println(prof1.getEndereço());
		System.out.println(prof1.getSalario());
		System.out.println(prof1.getDisciplina());
		
		
		FuncAdm func1 = new FuncAdm();
		
		func1.setNome("Luisinho");
		func1.setIdade(40);
		func1.setEndereço("Avenida João Pinheiro, 1000");
		
		func1.setSalario(3000.0);
		
		func1.setFuncao("Analista");
		func1.setSetor("Geral");
		
		System.out.println("\n\n");
		System.out.println(func1.getNome());
		System.out.println(func1.getIdade());
		System.out.println(func1.getEndereço());
		System.out.println(func1.getSalario());
		System.out.println(func1.getFuncao());
		System.out.println(func1.getSetor());
	}

}
