package br.com.gerenation.lista1java;

import java.util.Scanner;

public class Lista1Exer2 {
	public static void main (String [] args) {
		//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		double numero1, numero2, numero3, troca;
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite um n�mero: ");
		numero1 = leia.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		numero2 = leia.nextDouble();
		System.out.println("Digite o terceiro n�mero: ");
		numero3 = leia.nextDouble();
		if (numero1 > numero2) {
			troca = numero1;
			numero1 = numero2;
			numero2=troca;
		}
		if (numero1 > numero3) {
			troca = numero1;
			numero1 = numero3;
			numero3 =troca;
		}
		if (numero2 > numero3) {
			troca = numero2;
			numero2 = numero3;
			numero3=troca;
		}
		System.out.println("A ordem crescente dos n�meros que voc� digitou �: " +numero1 + ", " + numero2 + ", " + numero3 + ".");
	}
		
}
