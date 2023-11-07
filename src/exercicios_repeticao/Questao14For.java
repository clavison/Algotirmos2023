package exercicios_repeticao;

import javax.swing.JOptionPane;

public class Questao14For {
	
	public static void main(String[] args) {
		double saldo = Double.parseDouble(JOptionPane
				.showInputDialog("Saldo inicial:"));
		int qtOper = Integer.parseInt(JOptionPane
				.showInputDialog("Qt operações:"));
		for(int i=0; i< qtOper; i++) {
			String tp = JOptionPane
					.showInputDialog("D - Depósito\nR - Retirada")
					.toUpperCase();
			double vl = Double.parseDouble(JOptionPane
					.showInputDialog("Valor da operação:"));
			if(tp.equals("D")) {
				saldo += vl;
			}
			if(tp.equals("R")) {
				saldo -= vl;
			}
		}
		JOptionPane.showMessageDialog(null, "Ficou: "+saldo);
	}

}
