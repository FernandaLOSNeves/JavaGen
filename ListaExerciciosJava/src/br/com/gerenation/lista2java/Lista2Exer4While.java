package br.com.gerenation.lista2java;

import javax.swing.JOptionPane;

public class Lista2Exer4While {
	public static void main(String[] args) {
/*
 * Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE) - o número de pessoas calmas; -o número de mulheres nervosas;
- o número de homens agressivos; - o número de outros calmos; -o número de pessoas nervosas com mais de 40 anos;
- o número de pessoas calmas com menos de 18 anos. */
	
		int i=0, n =5, idade, sexo=0, temperamento=0, calmx=0, calmxoutro=0, calmxmenos18=0, mulhernervosa=0, nervosxmais40=0, homemagressivo=0;
		while(i<n) {
			idade = Integer.parseInt(JOptionPane.showInputDialog((i+1) + "ª pessoa. IDADE:"));
			do {
				sexo= Integer.parseInt(JOptionPane.showInputDialog("SEXO: 1- Feminino  2- Masculino  3-Outro"));
			} while (sexo < 1 || sexo >3);
			do {
				temperamento = Integer.parseInt(JOptionPane.showInputDialog("TEMPERAMENTO: 1- Calmx  2- Nervosx  3-Agressivx"));
				} while (temperamento < 1 || temperamento >3);
			i++;
			if (temperamento == 1){
				calmx++;
				if (sexo == 3) {
					calmxoutro++;
					}
				if (idade < 18){
				calmxmenos18++;
				}
			}
			if (temperamento == 2) {
				if (sexo ==1) {
					mulhernervosa++;
				}
				if (idade > 40) {
					nervosxmais40++;
				}
			}if( sexo == 2 && temperamento ==3) {
				homemagressivo++;
			}
		}
		JOptionPane.showMessageDialog(null, "Pessoas Calmas:  " + calmx +"\nMulheres Nervosas:  "+ mulhernervosa+ "\nHomem agressivo: "+ homemagressivo + "\nOutros Calmos:  " + calmxoutro + "\nNervosos com +40 anos:  " + nervosxmais40 + "\nCalmxs com -18 anos:  " + calmxmenos18);
	}
	
}
