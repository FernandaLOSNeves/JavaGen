package br.com.generation.lista3;

import java.util.Scanner;

public class Lista3Exer1 {
	public static void main(String[] args) {
/*
 * 1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
 */
		double maiorValor =0;
		double [] vetor = new double[5];
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe o " +(i+1)+"� valor: ");
			vetor[i] = leia.nextDouble();
		}
		System.out.println("Os elementos do vetor s�o:");
		for(int i = 0; i<vetor.length; i++) {
			System.out.print(vetor[i] + "  |  ");
			if (maiorValor < vetor[i]) {
				maiorValor = vetor[i];
			}
		}
		System.out.println("\nO maior valor �: " + maiorValor + ".");
	}
}
