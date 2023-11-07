package exercicios_repeticao;

import javax.swing.JOptionPane;

public class Questao30 {
	
	public static void main(String[] args) {
		
		double valorTotal = 0;
		
		int qtFunc = Integer.parseInt(JOptionPane
				.showInputDialog("QTD FUNCIONÁRIOS:"));
		
		for(int f=0; f<qtFunc; f++) {
			int qtServ = Integer.parseInt(JOptionPane
					.showInputDialog("QTD serviços do funcionário "+(f+1)));
			for(int s=0; s< qtServ; s++) {
				double mo = Double.parseDouble(JOptionPane
						.showInputDialog("Valor da mão de obra"));
				valorTotal += mo;
				JOptionPane.showMessageDialog(null, "SERVIÇO "+(s+1)+" do funcionário "+(f+1));
				int qtPecas = Integer.parseInt(JOptionPane
						.showInputDialog("QTD de peças "));
				for(int p=0; p< qtPecas; p++) {
					int qtPc = Integer.parseInt(JOptionPane
							.showInputDialog("QTD desta peça "));
					double vl = Double.parseDouble(JOptionPane
							.showInputDialog("Valor da peça"));
					valorTotal += qtPc * vl;
				}
				
			}
		}
		
	}

}
