package br.com.generation.lista4;

import java.util.Scanner;

public class metodos {
	
	static void metodo01(double ValorCompra, int quantidade) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o valor do produto R$:");
		ValorCompra = leia.nextDouble();
		System.out.print("Digite a quantidade de itens: ");
		quantidade = leia.nextInt();
		System.out.println();
		
		System.out.println("O Cliente comprou " + quantidade + " intens de R$" + ValorCompra + " reais,");
		System.out.println("Totalizando R$" + quantidade*ValorCompra + " reais em compra.");
		System.out.println();
	}
	
	public static void main (String[] args) {
		
	metodo01(0,0);
	}
	
}
