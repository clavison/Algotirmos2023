package vetores;

import javax.swing.JOptionPane;

public class Exercicio1 {
	
	public static void main(String[] args) {
		int[] numeros = new int[6];
		
		for(int i=0; i<numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane
					.showInputDialog((i+1)+"º Nr: "));
		}
		
		int maior = numeros[0];
		int menor = numeros[0];
		
		for(int i=0; i<numeros.length; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
			if(numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		JOptionPane.showMessageDialog(null, maior);
		JOptionPane.showMessageDialog(null, menor);
		
	}

}
