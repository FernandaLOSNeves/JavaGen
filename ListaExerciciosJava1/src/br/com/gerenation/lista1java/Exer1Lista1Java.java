package br.com.gerenation.lista1java;

import javax.swing.JOptionPane;

public class Exer1Lista1Java {

	public static void main(String[] args) {
		// Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		// TODO Auto-generated method stub
		int numero1, numero2, numero3;
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor inteiro: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor inteiro (n�o pode ser igual ao 1�): "));
		numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor inteiro (diferente dos anteriores tamb�m): "));
		if (numero1 > numero2 && numero1>numero3) {
			JOptionPane.showMessageDialog(null, "O PRIMEIRO n�mero que voc� digitou � o maior e � igual a " + numero1 + ".");
		}
		else if (numero2 > numero1 && numero2 > numero3) {
			JOptionPane.showMessageDialog(null, "O SEGUNDO n�mero que voc� digitou � o maior e � igual a " + numero2 + ".");
		}
		else if (numero3 > numero1 && numero3 > numero2) {
			JOptionPane.showMessageDialog(null, "O TERCEIRO n�mero que voc� digitou � o maior e � igual a" + numero3 + ".");
		}
		else {
				JOptionPane.showMessageDialog(null, "Talvez voc� tenha digitado n�meros iguais ou n�o inteiros.");
		}
	}
}


