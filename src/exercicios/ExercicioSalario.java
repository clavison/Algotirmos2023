package exercicios;

import javax.swing.JOptionPane;

public class ExercicioSalario {
	
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome:");
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Qtas horas?"));
		double vlHora = Double.parseDouble(JOptionPane.showInputDialog("Vl por hora:"));
		JOptionPane.showMessageDialog(null, "O salário de "+nome +" será de R$"+(horas * vlHora) );
	}

}
