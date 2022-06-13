package br.com.generation.projetoconstrutor;

public class testaconstrutor {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Felipe", 28);
		
		System.out.println(p1.nome);
		System.out.println(p1.idade);
		System.out.println();
		
		Pessoa p2 = new Pessoa("Fernanda", 31);
		
		System.out.println(p2.nome);
		System.out.println(p2.idade);
		System.out.println();
	}

}
