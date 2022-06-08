package br.com.gerenation.lista2java;

import java.util.Scanner;

public class Lista2Exer5DoWhile {
	public static void main(String[] args) {
/*
 * Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, 
 * mostre a soma dos números digitados.(DO...WHILE) */
		
		double numero, soma=0;
		Scanner leia = new Scanner (System.in);
		do {
			System.out.println("Digite um número (quando você quiser sair, digite 0): ");
		numero = leia.nextDouble();
		soma = soma + numero;
		} while (numero != 0);
		System.out.println("A soma dos números que você escreveu é igual a: "+ soma+".");
	}

}
