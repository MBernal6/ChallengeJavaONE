package Principal;

import javax.swing.*;
import ConversorMonedas.Monedas;


public class MenúPrincipal {


	public static void main(String[] args) {
		
		Monedas conversion = new Monedas();
		
		while(true) {
			String opciones = JOptionPane.showInputDialog(null,"Seleccione una opción de conversor","Menú",JOptionPane.PLAIN_MESSAGE, null, 
							new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
		
			switch(opciones) {
			case "Conversor de Monedas":
				String input = JOptionPane.showInputDialog(null, "Ingrese valor a convertir");
				double valor = Double.parseDouble(input);
				conversion.TipoCambio(valor);
				
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if(JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Entra");
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
			}
		break;	
		}
	}
}
