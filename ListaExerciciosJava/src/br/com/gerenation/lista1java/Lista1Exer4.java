package br.com.gerenation.lista1java;

import java.util.Scanner;

public class Lista1Exer4 {
	public static void main (String[] args) {
		/* Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for 
		ímpar exiba o número elevado ao quadrado. */
		double numero;
		System.out.println("Digite um número qualque: ");
		Scanner leia = new Scanner(System.in);
		numero = leia.nextDouble();
		if (numero % 2 == 0) {
			System.out.println("Este número é par e a sua raiz quadrada vale: " + Math.sqrt(numero));
			
		}
		else {
			System.out.println("Este número é impar e seu quadrado é igual a " + Math.pow(numero, 2));
			
		}
		
		
	}

}
