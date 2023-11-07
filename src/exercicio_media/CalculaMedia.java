package exercicio_media;

import javax.swing.JOptionPane;

public class CalculaMedia {

	public static void main(String[] args) {
		// PROGRAMA QUE CALCULA A MÉDIA
		// DECLARAÇÃO DE VARIÁVEIS
		String nome = JOptionPane.showInputDialog("Qual seu nome?");
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 1?"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 2?"));

		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 3?"));
		double media = (n1 + n2 + n3) / 3;

		JOptionPane.showMessageDialog(null, "O nome digitado foi: " + nome + " Média: " + media);

	}

}
