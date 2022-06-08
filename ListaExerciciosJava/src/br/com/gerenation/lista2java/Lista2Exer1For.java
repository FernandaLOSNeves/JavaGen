package br.com.gerenation.lista2java;

public class Lista2Exer1For {
	public static void main(String[] args) {
		//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		int contador = 0;
		for (int i = 1; i < 2000 ; i++) {
			if (i % 11 == 5) {
				System.out.print(i + "   ");
				contador++;
			}
			if (contador == 20){
				System.out.println();
				contador =0;
			}
		}
	}

}
