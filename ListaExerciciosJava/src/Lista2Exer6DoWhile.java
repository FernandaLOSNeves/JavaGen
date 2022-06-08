import java.util.Scanner;

public class Lista2Exer6DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Escrever um programa que receba vários números inteiros no teclado. E no final 
 * imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE) */
	
		int soma=0, i=0, numero;
		Scanner leia = new Scanner (System.in);
		do {
			System.out.println("Escreva um número: ");
			numero = leia.nextInt();
			if (numero % 3 == 0 && numero!=0) {
				soma = soma + numero;
				i++;
			}
		} while (numero !=0);
		System.out.println(i);
		System.out.println("A média dos múltiplos de 3 é: " + (soma/i) + ".");
	
	}

}
