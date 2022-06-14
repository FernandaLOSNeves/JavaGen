package br.com.generation.polimorfismoeheranca;

//import java.util.Scanner;

public class TestaAnimais {
	public static void main(String[] args) {

	Cachorro cachorro1 = new Cachorro();
	
	//Scanner entrada = new Scanner(System.in);
	
	cachorro1.nome = "Fofinho";
	cachorro1.idade = 15;
	cachorro1.som = "Auuuuuu late coração cachorro late coração";
	cachorro1.DeveCorrer = true;
	
	System.out.println("Nome: " + cachorro1.nome);
	System.out.println("Idade: " + cachorro1.idade);
	System.out.println("Som: " + cachorro1.som);
	System.out.println("Corre? " + cachorro1.DeveCorrer);
	System.out.println();
	
	//prof1.setNome(entrada.next());
	Cavalo cavalo1= new Cavalo();
	
	//Scanner entrada = new Scanner(System.in);
	
	cavalo1.nome = "Trovão";
	cavalo1.idade = 7;
	cavalo1.som = "irrririririr";
	cavalo1.DeveCorrer = true;
	
	System.out.println("Nome: " + cavalo1.nome);
	System.out.println("Idade: " + cavalo1.idade);
	System.out.println("Som: " + cavalo1.som);
	System.out.println("Corre? " + cavalo1.DeveCorrer);
	System.out.println();
	
	Preguica preguica1= new Preguica();
	
	//Scanner entrada = new Scanner(System.in);
	
	preguica1.nome = "Segunda-feira";
	preguica1.idade = 99;
	preguica1.som = ".......";
	preguica1.subirEmArvore = true;
	
	System.out.println("Nome: " + preguica1.nome);
	System.out.println("Idade: " + preguica1.idade);
	System.out.println("Som: " + preguica1.som);
	System.out.println("Sobe em arvre? " + preguica1.subirEmArvore);
	
	}
}