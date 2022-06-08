package br.com.gerenation.lista2java;

import java.util.Scanner;

public class Lista2Exer3While {
	public static void main(String[] args) {
		/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. */ 
		
		int idade=0, i = 0, menos21=-1, mais50=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Para sair escreva '-99' para o valor da idade.");
		while (idade != -99) {
			System.out.print("Escreva o " + (i+1) + "º valor de idade: ");
			idade = leia.nextInt();
			i++;
			
			if (idade< 21) {
				menos21++;
			} 
			if(idade>50) {
				mais50++;
			}
		}
		System.out.println("Você digitou " +menos21 +" idades menores que 21 anos e " +mais50+ " maiores que 50 anos.");
		
	}

}
