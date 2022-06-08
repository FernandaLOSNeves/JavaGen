package br.com.gerenation.lista2java;

import java.util.Scanner;

public class Lista2Exer2For {
	public static void main(String[] args) {
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		double numero;
		int par =0, impar=0;
		
		Scanner leia =new Scanner(System.in);
		
		for(int i=1; i<=10 ;i++) {
			System.out.println(" Escreva o " + i +"º número:");
			numero = leia.nextDouble();
			
			if (numero % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("Você digitou " + par + " números pares e " + impar + " números ímpares.");
	}

}
