import java.util.Scanner;

public class Lista2Exer6DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final 
 * imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE) */
	
		int soma=0, i=0, numero;
		Scanner leia = new Scanner (System.in);
		do {
			System.out.println("Escreva um n�mero: ");
			numero = leia.nextInt();
			if (numero % 3 == 0 && numero!=0) {
				soma = soma + numero;
				i++;
			}
		} while (numero !=0);
		System.out.println(i);
		System.out.println("A m�dia dos m�ltiplos de 3 �: " + (soma/i) + ".");
	
	}

}
