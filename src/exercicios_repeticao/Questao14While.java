package exercicios_repeticao;

import javax.swing.JOptionPane;

public class Questao14While {
	public static void main(String[] args) {
		double saldo = Double.parseDouble(JOptionPane
				.showInputDialog("Saldo inicial:"));
		String tp = "";
		do {
			tp = JOptionPane
					.showInputDialog("D - Depósito\nR - Retirada")
					.toUpperCase();
			
			if(tp.equals("D")) {
				double vl = Double.parseDouble(JOptionPane
						.showInputDialog("Valor da operação:"));
				saldo += vl;
			}
			if(tp.equals("R")) {
				double vl = Double.parseDouble(JOptionPane
						.showInputDialog("Valor da operação:"));
				saldo -= vl;
			}
		}while(tp.equals("D") || tp.equals("R"));
		
		JOptionPane.showMessageDialog(null, "Ficou: "+saldo);
	}

}
