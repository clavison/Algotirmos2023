package exercicios_repeticao;

import javax.swing.JOptionPane;

public class Questao25 {
	
	public static void main(String[] args) {
		String resultado = "";
		int n = Integer.parseInt(JOptionPane
				.showInputDialog("QTD ALUNOS:"));
		for(int i=0; i<n; i++) {
			double soma = 0;
			String nome = JOptionPane.showInputDialog("Nome do "+(i+1)+"º aluno(a)");
			int x = Integer.parseInt(JOptionPane
					.showInputDialog("QTD de provas de "+nome));
			for(int j=0; j<x; j++) {
				double nota = Double.parseDouble(JOptionPane
						.showInputDialog("Nota"));
				soma += nota;
			}
			resultado += nome+" média: "+(soma/x)+"\n";
		}
		JOptionPane.showMessageDialog(null, resultado);
	}

}
