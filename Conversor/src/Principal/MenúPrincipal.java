package Principal;

import javax.swing.*;

public class MenúPrincipal {

	public static void main(String[] args) {
		
		JOptionPane.showInputDialog(null,"Seleccione una opción de conversor","Menú",JOptionPane.PLAIN_MESSAGE, null, 
				new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
	}
	
}
