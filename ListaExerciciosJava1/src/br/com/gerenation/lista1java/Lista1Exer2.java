package br.com.gerenation.lista1java;

import java.util.Scanner;

public class Lista1Exer2 {
	public static void main (String [] args) {
		//Faça um programa que entre com três números e coloque em ordem crescente.
		double numero1, numero2, numero3, troca;
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite um número: ");
		numero1 = leia.nextDouble();
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextDouble();
		System.out.println("Digite o terceiro número: ");
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
		System.out.println("A ordem crescente dos números que você digitou é: " +numero1 + ", " + numero2 + ", " + numero3 + ".");
	}
		
}
