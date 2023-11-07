package exemplos_repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {
	
	public static void main(String[] args) {
//		for(int i=10; i>=0; i--) {
//			System.out.println(i);
//		}
		
		int qt = Integer.parseInt(JOptionPane.showInputDialog("Qt alunos"));
		int somaIdades = 0;
		for(int i=1; i<=qt; i++) {
			int idade = Integer.parseInt(JOptionPane
					.showInputDialog("Idade do "+i+"º aluno"));
			somaIdades += idade;
		}
		System.out.println("Média de idade:" + (somaIdades/qt));
	}

}
