package exercicios;

import javax.swing.JOptionPane;

public class RendimentoPoupanca {
	
	public static void main(String[] args) {
		double vl = Double.parseDouble(JOptionPane
				.showInputDialog("Valor:"));
		double pc = Double.parseDouble(JOptionPane
				.showInputDialog("% rendimento:"));
		
		double rendimento = vl * pc / 100;
		double saldo = vl + rendimento;
		
		String res = "Valor depositado: R$" + vl + "\n"
				+ "Rendimento: R$" + rendimento + "\n"
				+ "Saldo: R$" + saldo + "\n";
		JOptionPane.showMessageDialog(null, res);
		
	}

}
