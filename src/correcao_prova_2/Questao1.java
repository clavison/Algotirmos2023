package correcao_prova_2;

import javax.swing.JOptionPane;

public class Questao1 {
	
	public static void main(String[] args) {
		int dia1 = Integer.parseInt(JOptionPane.showInputDialog("Dia 1"));
		int mes1 = Integer.parseInt(JOptionPane.showInputDialog("Mês 1"));
		int ano1 = Integer.parseInt(JOptionPane.showInputDialog("Ano 1"));
		int dia2 = Integer.parseInt(JOptionPane.showInputDialog("Dia 2"));
		int mes2 = Integer.parseInt(JOptionPane.showInputDialog("Mês 2"));
		int ano2 = Integer.parseInt(JOptionPane.showInputDialog("Ano 2"));

		String msg = "";
		
		if(ano1 > ano2) {
			msg = "A data 2 ocorreu primeiro";
		}else {
			if(ano2 > ano1) {
				msg = "A data 1 ocorreu primeiro";
			}else {
				if(mes1 > mes2) {
					msg = "A data 2 ocorreu primeiro";
				}else {
					if(mes2 > mes1) {
						msg = "A data 1 ocorreu primeiro";
					}else {
						if(dia1 > dia2) {
							msg = "A data 2 ocorreu primeiro";
						}else {
							if(dia2 > dia1) {
								msg = "A data 1 ocorreu primeiro";
							}else {
								msg = "As datas são iguais";
							}
						}
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null, msg);
	}
}
