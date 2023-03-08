package ConversorMedidas;

import javax.swing.JOptionPane;

public class Medidas {

	OpcionesMedidas medidas = new OpcionesMedidas();
	public void OpcionesMedidas(double valor) {
		
		String opciones = (JOptionPane.showInputDialog(null, "Ingresa la medida que deseas convertir", 
				"Medidas", JOptionPane.PLAIN_MESSAGE,null, new Object[] 
						{"De Metros a Milimetros", "De Metros a Centimetros", "De Metros a Kilometros",
						"De Centimetros a Milimetros", "De Centimetros a Metros", "De Centimetros a Kilometros",
						"De Kilometros a Centimetros", "De Kilometros a Metros"},
						"Selección")).toString();
		switch(opciones) {
		case "De Metros a Milimetros":
			medidas.MetrosMilimetros(valor);
			break;
		case "De Metros a Centimetros":
			medidas.MetrosCentimetros(valor);
			break;
		case "De Metros a Kilometros":
			medidas.MetrosKilometros(valor);
			break;
			
		case "De Centimetros a Milimetros":
			medidas.CentimetrosMilimetros(valor);
			break;
		case "De Centimetros a Metros":
			medidas.CentimetrosMetros(valor);
			break;
		case "De Centimetros a Kilometros":
			medidas.CentimetrosKilometros(valor);
			break;
			
		case "De Kilometros a Centimetros":
			medidas.KilometrosCentimetros(valor);
			break;
		case "De Kilometros a Metros":
			medidas.KilometrosMetros(valor);
			break;
		}
	}
}
