package exercicios_repeticao;

import javax.swing.JOptionPane;

public class Questao16For {
	public static void main(String[] args) {
		int qtAlunos = Integer.parseInt(JOptionPane
				.showInputDialog("Qtd Alunos:"));
		int qtM = 0;
		int qtF = 0;
		for(int i=0; i<qtAlunos; i++) {
			//String nome = JOptionPane.showInputDialog("Nome");
			String sexo = JOptionPane.showInputDialog("Sexo");
			if(sexo.equalsIgnoreCase("M")) {
				qtM ++;
			}
			if(sexo.equalsIgnoreCase("F")) {
				qtF ++;
			}
		}
		JOptionPane.showMessageDialog(null, "M:"+qtM+"\nF:"+qtF);
	}

}
