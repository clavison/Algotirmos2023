package exercicios_repeticao;

import javax.swing.JOptionPane;

public class Questao22 {
	
	public static void main(String[] args) {
		int andar = Integer.parseInt(JOptionPane
				.showInputDialog("Andar inicial"));
		while(andar > 0) {
			int prox = Integer.parseInt(JOptionPane
					.showInputDialog("Próx andar"));
			if(prox > andar) {
				System.out.println("Sobe");
			}else {
				System.out.println("Desce");
			}
			andar = prox;
		}
		
	}

}
