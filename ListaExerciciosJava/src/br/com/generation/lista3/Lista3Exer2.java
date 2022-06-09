package br.com.generation.lista3;

import java.util.Scanner;

public class Lista3Exer2 {
	public static void main(String[] args) {
/*
 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
 */
		byte[] vetor = new byte[10];
		double soma = 0;
		int contador=0, i, maiorValor=0;
		Scanner leia =  new Scanner (System.in);
		for (i=0;i < vetor.length; i++) {
			System.out.print("Valor do " +(i+1)+ "º lançamento: ");
			vetor [i] = leia.nextByte();
			while (vetor[i]<1 || vetor[i]>6) {
				System.out.print("Valor do " +(i+1)+ "º lançamento: ");
				vetor [i] = leia.nextByte();
			}
			soma = soma + vetor[i];	
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
				contador= 0;
			}
			if (vetor[i] == maiorValor){
				contador = contador + 1;
			}
		}
		System.out.println("A média das pontuações foi igual a: " + soma/vetor.length);
		System.out.println("O maior valor foi de " + maiorValor + " e ocorreu " + contador + " vezes.");
	}
}
