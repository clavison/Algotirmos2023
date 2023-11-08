package exercicios_repeticao;

import javax.swing.JOptionPane;

public class Questao17While {
	
	public static void main(String[] args) {
		String nr = "";
		double menor = 999999999;
		do {
			nr = JOptionPane.showInputDialog("NR");
			if(!nr.equals("")) {
				double num = Double.parseDouble(nr);
				if(num < menor) {
					menor = num;
				}
			}
		}while(!nr.equals(""));
		JOptionPane.showMessageDialog(null, "Menor: "+menor);
	}

}
