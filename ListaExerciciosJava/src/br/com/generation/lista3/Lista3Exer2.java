package br.com.generation.lista3;

import java.util.Scanner;

public class Lista3Exer2 {
	public static void main(String[] args) {
/*
 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.
 */
		byte[] vetor = new byte[10];
		double soma = 0;
		int contador=0, i, maiorValor=0;
		Scanner leia =  new Scanner (System.in);
		for (i=0;i < vetor.length; i++) {
			System.out.print("Valor do " +(i+1)+ "� lan�amento: ");
			vetor [i] = leia.nextByte();
			while (vetor[i]<1 || vetor[i]>6) {
				System.out.print("Valor do " +(i+1)+ "� lan�amento: ");
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
		System.out.println("A m�dia das pontua��es foi igual a: " + soma/vetor.length);
		System.out.println("O maior valor foi de " + maiorValor + " e ocorreu " + contador + " vezes.");
	}
}
