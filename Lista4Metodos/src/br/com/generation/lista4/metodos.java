package br.com.generation.lista4;

import java.util.Scanner;

public class metodos {
	
	public static void metodo01() {
		
		double ValorCompra= 40;
		int quantidade= 3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Qual a quantidades de ítens que o cliente comprou? ");
		ValorCompra = ler.nextDouble();
		System.out.print("Quanto custa cada ítem?  R$");
		quantidade = ler.nextInt();
		System.out.println();
		
		System.out.println("O Cliente comprou" + quantidade + " intens de R$" + ValorCompra + "reais.");
		System.out.println("Totalizando R$" + quantidade*ValorCompra + " reais em compra.");
		System.out.println();
	}
	
	public static void metodo02() {
		
		metodo01();
		
		int resposta;
		Scanner leia = new Scanner(System.in);
		System.out.println("A venda foi maior que R$200,00 reais? 1 - Sim  2 - Não");
		resposta = leia.nextInt();
		
		if (resposta == 1) {
			System.out.println("Cliente nível 2");
		}else {
				System.out.println("Cliente nível 1");
			}
		}
	
	public static void metodo03() {
		System.out.println("oi.");
	}
}
