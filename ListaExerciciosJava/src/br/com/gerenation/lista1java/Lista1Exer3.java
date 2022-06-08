package br.com.gerenation.lista1java;

import javax.swing.JOptionPane;

public class Lista1Exer3 {

	public static void main(String[] args) {
		/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se 
		 * encontra:
		 10-14 infantil, 15-17 juvenil, 18-25 adulto. */
		// TODO Auto-generated method stub
		int idade;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa a qual deseja categorizar: "));
		if (idade < 10) {
			JOptionPane.showMessageDialog(null, "A criança ainda é muito nova para as categorias disponíveis.");
		}
		else if (idade >=10 && idade<=14) {
			JOptionPane.showMessageDialog(null, "Para a idade de " + idade + " anos, a categoria é INFANTIL.");
		}
		else if (idade >=15 && idade <=17) {
			JOptionPane.showMessageDialog(null, "Para a idade de " + idade + " anos, a categoria é JUVENIL.");
		}
		else if (idade >=18 && idade<=25) {
			JOptionPane.showMessageDialog(null, "Para a idade de " + idade + " anos, a categoria é ADULTO.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Para idades acima de 25, não há categoria disponível.");
		}
		

	}

}
