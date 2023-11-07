package estrutura_se;

import javax.swing.JOptionPane;

public class ExemploTime {
	
	public static void main(String[] args) {
		String time1 = JOptionPane.showInputDialog("Nome do time 1");
		String time2 = JOptionPane.showInputDialog("Nome do time 2");
		int gol1 = Integer.parseInt(JOptionPane
				.showInputDialog("Qtde de gols de "+time1));
		int gol2 = Integer.parseInt(JOptionPane
				.showInputDialog("Qtde de gols de "+time2));
		if(gol1 == gol2) {
			JOptionPane.showMessageDialog(null, "O jogo empatou");
		}else {
			if( gol1 > gol2) {
				JOptionPane.showMessageDialog(null, "Vencedor: "+ time1);
			}else {
				JOptionPane.showMessageDialog(null, "Vencedor: "+ time2);
			}
		}
		
	}

}
