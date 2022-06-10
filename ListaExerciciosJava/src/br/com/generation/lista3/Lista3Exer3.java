package br.com.generation.lista3;

import java.util.Scanner;

public class Lista3Exer3 {
	public static void main(String[] args) {
/*
 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.\		
 */
		double [][]N1 = new double [2][2];
		double [][]N2 = new double[2][2];
		double [][]M1 = new double [2][2];
		double [][]M2 = new double[2][2];
		int l, c;
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreva os elementos da matriz N1:\n");
		for (l = 0; l < N1.length ; l++) {
				for(c = 0; c < N1[l].length ; c++) {
				System.out.printf("O elemento de índices %d %d é : ", l, c);
				N1[l][c]= leia.nextDouble();		
			}
		}
		System.out.println();
		System.out.println("Escreva os elementos da matriz N2:\n");
		for (l = 0; l < N2.length ; l++) {
				for(c = 0; c < N2[l].length ; c++) {
					System.out.printf("O elemento de índices %d %d é : ", l, c);
					N2[l][c]= leia.nextDouble();
				}
		}
		System.out.println();
		System.out.println("A Matriz N1:\n");
		for (l = 0; l < N1.length ; l++) {
			for (c = 0; c < N1[l].length ; c++) {
				System.out.print(N1[l][c] + " | ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("A Matriz N2:\n");
		for (l = 0; l < N2.length ; l++) {
			for (c = 0; c < N2[l].length ; c++) {
				System.out.print(N2[l][c] + " | ");
			}
			System.out.println();
		}
		for ( l = 0 ; l < M1.length ; l++) {
			for (c = 0; c < M1[l].length ; c++) {
				M1[l][c] = N1[l][c] + N2[l][c];
				M2[l][c] = N1[l][c] - N2[l][c];
			}
		}
		System.out.println();
		System.out.println("A Matriz M1:\n");
		for (l = 0; l < M1.length ; l++) {
			for (c = 0; c < M1[l].length ; c++) {
				System.out.print(M1[l][c] + " | ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("A Matriz M2:\n");
		for (l = 0; l < M2.length ; l++) {
			for (c = 0; c < M2[l].length ; c++) {
				System.out.print(M2[l][c] + " | ");
			}
			System.out.println();
		}
	}
}
	
	
