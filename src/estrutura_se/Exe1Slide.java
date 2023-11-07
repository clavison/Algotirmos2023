package estrutura_se;

import javax.swing.JOptionPane;

public class Exe1Slide {
	
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("A"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("B"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("C"));
		
		if(a>b && a>c) {
			JOptionPane.showMessageDialog(null, "O valor é:" +a);
		}else {
			if(b>a && b>c) {
				JOptionPane.showMessageDialog(null, "O valor é:" +b);
			}else {
				JOptionPane.showMessageDialog(null, "O valor é:" +c);
			}
		}
	}

}
