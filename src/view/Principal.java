package view;
/*
 * 	Fatorial de um n�mero de 1 a 10 usando pilhas din�micas
 */
import javax.swing.JOptionPane;

import controller.FatController;

public class Principal {

	public static void main(String[] args) {
		FatController fat = new FatController();
		int num;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero de 1 a 10 para calcular seu fatorial: "));
			if (num < 1 || num > 10) {
				JOptionPane.showMessageDialog(null, "Numero inv�lido!");
			}
			
		} while (num < 1 || num > 10);
		long fatorial = fat.fatorial(num); 
		
		JOptionPane.showMessageDialog(null, "Fatorial de "+num+" � "+fatorial);
	}

}
