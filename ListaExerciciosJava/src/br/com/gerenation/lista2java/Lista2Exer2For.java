package br.com.gerenation.lista2java;

import java.util.Scanner;

public class Lista2Exer2For {
	public static void main(String[] args) {
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		double numero;
		int par =0, impar=0;
		
		Scanner leia =new Scanner(System.in);
		
		for(int i=1; i<=10 ;i++) {
			System.out.println(" Escreva o " + i +"� n�mero:");
			numero = leia.nextDouble();
			
			if (numero % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("Voc� digitou " + par + " n�meros pares e " + impar + " n�meros �mpares.");
	}

}
