package correcao_prova_2;

import javax.swing.JOptionPane;

public class Questao3 {
	
	public static void main(String[] args) {
		double vendas = Double.parseDouble(JOptionPane.showInputDialog("Vendas"));
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário fixo"));
		double salFinal = salario + vendas * 10/100;
		if(vendas > 20000) {
			salFinal = salario + vendas * 20/100;
		}
		JOptionPane.showMessageDialog(null, salFinal+"");
		
	}

}
