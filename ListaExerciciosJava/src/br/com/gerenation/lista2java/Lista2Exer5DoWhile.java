package br.com.gerenation.lista2java;

import java.util.Scanner;

public class Lista2Exer5DoWhile {
	public static void main(String[] args) {
/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, 
 * mostre a soma dos n�meros digitados.(DO...WHILE) */
		
		double numero, soma=0;
		Scanner leia = new Scanner (System.in);
		do {
			System.out.println("Digite um n�mero (quando voc� quiser sair, digite 0): ");
		numero = leia.nextDouble();
		soma = soma + numero;
		} while (numero != 0);
		System.out.println("A soma dos n�meros que voc� escreveu � igual a: "+ soma+".");
	}

}
