package br.com.gerenation.lista1java;

import java.util.Scanner;

public class Lista1Exer4 {
	public static void main (String[] args) {
		/* Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for 
		�mpar exiba o n�mero elevado ao quadrado. */
		double numero;
		System.out.println("Digite um n�mero qualque: ");
		Scanner leia = new Scanner(System.in);
		numero = leia.nextDouble();
		if (numero % 2 == 0) {
			System.out.println("Este n�mero � par e a sua raiz quadrada vale: " + Math.sqrt(numero));
			
		}
		else {
			System.out.println("Este n�mero � impar e seu quadrado � igual a " + Math.pow(numero, 2));
			
		}
		
		
	}

}
