package Principal;

import javax.swing.*;

import ConversorMedidas.Medidas;
import ConversorMonedas.Monedas;


public class MenúPrincipal {


	public static void main(String[] args) {
		
		Monedas conversion = new Monedas();
		Medidas conversionMed = new Medidas();
		
		while(true) {
			String opciones = JOptionPane.showInputDialog(null,"Seleccione una opción de conversor","Menú",JOptionPane.PLAIN_MESSAGE, null, 
							new Object[] {"Conversor de Monedas", "Conversor de Medidas"}, "Elegir").toString();
		
			switch(opciones) {
			case "Conversor de Monedas":
				try {
					String input = JOptionPane.showInputDialog(null, "Ingrese el monto de dinero a convertir");
					double valor = Double.parseDouble(input);
					conversion.TipoCambio(valor);
					}catch (Exception e) {
						System.out.println("valor no valido");
						JOptionPane.showMessageDialog(null, "Valor no valido");
					}
			case "Conversor de Medidas":
				try {
					String input = JOptionPane.showInputDialog(null, "Ingrese medida a convertir");
					double valor = Double.parseDouble(input);
					conversionMed.OpcionesMedidas(valor);
				}catch (Exception e) {
					System.out.println("valor no valido");
					JOptionPane.showMessageDialog(null, "Valor no valido");
				}

				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if(JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Entra");
					continue;
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					System.out.println("Programa finalizado");
				}
			}
		break;	
		}
	}
}
