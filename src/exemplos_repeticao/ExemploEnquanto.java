package exemplos_repeticao;

import javax.swing.JOptionPane;

public class ExemploEnquanto {
	
//	public static void main(String[] args) {
//		int somaIdades = 0;
//		int idade = 0;
//		int cont = 0;
//		
//		while(idade > 0) {
//			idade = Integer.parseInt(JOptionPane
//					.showInputDialog("Digite uma idade"));
//			somaIdades += idade;
//			cont ++;
//		}
//	
//		if(cont > 0) {
//			System.out.println("Média de idade:" + (somaIdades/cont));
//		}else {
//			System.out.println("Nada cadastrado");
//		}
//	}
	
	public static void main(String[] args) {
		String menu = "1 - Faz tal coisa\n"
				+ "2 - Faz outra coisa\n"
				+ "3 - Finalizar";
		int op = 3;
		while(op!=3) {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
		}
		System.out.println("Adeus");
	}

}
