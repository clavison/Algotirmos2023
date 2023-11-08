package exercicios_repeticao;

import javax.swing.JOptionPane;

public class Questao16While {
	public static void main(String[] args) {
		String sexo = "";
		int qtM = 0;
		int qtF = 0;
		do {
			//String nome = JOptionPane.showInputDialog("Nome");
			sexo = JOptionPane.showInputDialog("Sexo");
			if(sexo.equalsIgnoreCase("M")) {
				qtM ++;
			}
			if(sexo.equalsIgnoreCase("F")) {
				qtF ++;
			}
		}while(sexo.equalsIgnoreCase("M")||sexo.equalsIgnoreCase("F"));
		JOptionPane.showMessageDialog(null, "M:"+qtM+"\nF:"+qtF);
	}

}
