package br.com.generation.aulas;

import javax.swing.JOptionPane;

public class CondicionalMediadeNotas {
	public static void main (String[] args) {
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
		if (numero % 4 == 0 && numero % 5 == 0) {
			JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 4 e 5.");
		} else {
			JOptionPane.showMessageDialog(null, "O número " + numero + " NÃO é divisível por 4 e 5.");
		}
	}
}
