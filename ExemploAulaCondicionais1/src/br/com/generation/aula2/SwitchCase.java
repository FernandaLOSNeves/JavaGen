package br.com.generation.aula2;

import java.util.Scanner;

public class SwitchCase {
	// Testando Switch case
	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva uma letra: ");
		char letra = entrada.next().charAt(0);
		switch (letra) {
		case 'a':
			System.out.println("Annie.");
		break;
		case 'f':
			System.out.println("Fernanda. ");
		break;
		default:
			System.out.println("Opção inválida. ");
		break;
		}
		
	}

}
