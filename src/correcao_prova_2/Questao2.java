package correcao_prova_2;

import javax.swing.JOptionPane;

public class Questao2 {
	
	public static void main(String[] args) {
		
		int nr = Integer.parseInt(JOptionPane.showInputDialog("Nr de 1 a 7"));
		
		switch (nr) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;

		default:
			System.out.println("Valor inválido");
			break;
		}
	}

}
