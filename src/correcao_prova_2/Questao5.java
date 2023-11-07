package correcao_prova_2;

import javax.swing.JOptionPane;

public class Questao5 {
	
	public static void main(String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário bruto"));
		int dep = Integer.parseInt(JOptionPane.showInputDialog("Dependentes"));
		System.out.println("Salário final:"+(salario + dep * 100));
	}

}
