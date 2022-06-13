package br.com.generation.projetoconstrutor;

public class Pessoa {

	String nome;
	int idade;
	
	Pessoa(String n, int i){
		System.out.println("Inicializando o contrutor da classe pessoa!!!");
		nome = n;
		idade = i;
	}
}
