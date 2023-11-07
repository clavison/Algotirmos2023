package exercicios;

import javax.swing.JOptionPane;

public class ExercicioConversaoMedidas {
	
	public static void main(String[] args) {
		double pes = Double.parseDouble(JOptionPane
				.showInputDialog("Digite a medida em pés"));
		double polegadas = pes * 12;
		double jardas = pes / 3;
		double milhas = jardas / 1760;
		
		String resultado = "Conversão de medidas\n\n"
				+ "Pés: " + pes + "\n"
				+ "Polegadas: " + polegadas + "\n"
				+ "Jardas: " + jardas + "\n"
				+ "Milhas: " + milhas + "\n";
		JOptionPane.showMessageDialog(null, resultado);
	}

}
