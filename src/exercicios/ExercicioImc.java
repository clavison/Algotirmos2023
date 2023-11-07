package exercicios;

import javax.swing.JOptionPane;

public class ExercicioImc {
	
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome:");
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
		double imc = peso / (altura * altura);
		JOptionPane.showMessageDialog(null, "Imc de \n"+nome +" \né:"+imc );
	}

}
