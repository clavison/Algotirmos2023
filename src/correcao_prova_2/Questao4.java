package correcao_prova_2;

import javax.swing.JOptionPane;

public class Questao4 {
	
	public static void main(String[] args) {
		//int nr = Integer.parseInt(JOptionPane.showInputDialog("Nr da conta"));
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo atual"));
		char oper = JOptionPane
				.showInputDialog("D - depósito\nR-Retirada")
				.toUpperCase()
				.charAt(0);
		double vl = Double.parseDouble(JOptionPane.showInputDialog("Valor da operação"));
		if(oper == 'D') {
			saldo += vl;
		}else {
			if( oper == 'R') {
				saldo -= vl;
			}else {
				JOptionPane.showMessageDialog(null, "Oper inválida");
			}
		}
		
		if( saldo < 0) {
			JOptionPane.showMessageDialog(null, "CONTA BLOQUEADA");
		}
	}

}
