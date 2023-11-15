package vetores;

import javax.swing.JOptionPane;

public class Contatos {
	
	public static void main(String[] args) {
		String[] nomes = new String[5];
		String[] fones = new String[5];
		for(int i=0; i<5; i++) {
			nomes[i] = JOptionPane
					.showInputDialog("Nome "+(i+1));
			fones[i] = JOptionPane
					.showInputDialog("Telefone de "+nomes[i]);
		}
		int op = 0;
		String menu = "1 - Buscar nome\n"
				+ "2 - Sair";
		do {
			op = Integer.parseInt(JOptionPane
					.showInputDialog(menu));
			if(op == 1) {
				String busca = JOptionPane
						.showInputDialog("Qual nome?");
				String r = "Nome não encontrado";
				for(int i=0; i<5; i++) {
					if(nomes[i].equalsIgnoreCase(busca)) {
						r = "Encontrei "+fones[i];
					}
				}
				JOptionPane.showMessageDialog(null, r);
			}
			
		}while(op !=2);
		
		
	}

}
