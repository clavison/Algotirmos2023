package exercicios;

import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {
		int alt = Integer.parseInt(JOptionPane.showInputDialog("Altura:"));
		int larg = Integer.parseInt(JOptionPane.showInputDialog("Largura:"));
		int comp = Integer.parseInt(JOptionPane.showInputDialog("Comprimento:"));
		int fita = 4 * alt + 2 * larg + 2 * comp;
		JOptionPane.showMessageDialog(null, "Total de fita:\n"+fita +" cm");
	}

}
