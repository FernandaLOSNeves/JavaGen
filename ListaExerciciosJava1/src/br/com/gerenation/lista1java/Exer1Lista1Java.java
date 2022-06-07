package br.com.gerenation.lista1java;

import javax.swing.JOptionPane;

public class Exer1Lista1Java {

	public static void main(String[] args) {
		// Faça um programa que receba três inteiros e diga qual deles é o maior.
		// TODO Auto-generated method stub
		int numero1, numero2, numero3;
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor inteiro: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor inteiro (não pode ser igual ao 1º): "));
		numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor inteiro (diferente dos anteriores também): "));
		if (numero1 > numero2 && numero1>numero3) {
			JOptionPane.showMessageDialog(null, "O PRIMEIRO número que você digitou é o maior e é igual a " + numero1 + ".");
		}
		else if (numero2 > numero1 && numero2 > numero3) {
			JOptionPane.showMessageDialog(null, "O SEGUNDO número que você digitou é o maior e é igual a " + numero2 + ".");
		}
		else if (numero3 > numero1 && numero3 > numero2) {
			JOptionPane.showMessageDialog(null, "O TERCEIRO número que você digitou é o maior e é igual a" + numero3 + ".");
		}
		else {
				JOptionPane.showMessageDialog(null, "Talvez você tenha digitado números iguais ou não inteiros.");
		}
	}
}


