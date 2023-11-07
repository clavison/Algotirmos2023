package exemplos_repeticao;

import javax.swing.JOptionPane;

public class ExemploRepita {

//	public static void main(String[] args) {
//		int somaIdades = 0;
//		int idade = 0;
//		int cont = 0;
//		
//		do {
//			idade = Integer.parseInt(JOptionPane
//					.showInputDialog("Digite uma idade"));
//			somaIdades += idade;
//			cont ++;
//		}while(idade > 0);
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
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
		}while(op!=3);
		System.out.println("Adeus");
	}

}
