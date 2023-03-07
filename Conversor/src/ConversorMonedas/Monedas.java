package ConversorMonedas;

import javax.swing.*;

public class Monedas {

	TipoCambio monedas = new TipoCambio();
	
	public void TipoCambio(double valor) {
		
		String opciones = (JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas convertir", 
				"Monedas", JOptionPane.PLAIN_MESSAGE,null, new Object[] 
						{"De Soles a Dolares", "De Soles a Euros", "De Soles a Libras", "De Soles a Yen Japones", "De soles a Won SurCoreano",
						"De Dolares a Soles", "De Euros a Soles", "De Libras a Soles", "De Yen Japones a Soles", "De Won SurCoreano a Soles"},
						"Selección")).toString();

	switch(opciones) {
	// De soles a la divisa
	case "De Soles a Dolares":
		monedas.SolesDolares(valor);
		break;
		
	case "De Soles a Euros":
		monedas.SolesEuro(valor);
		break;
		
	case "De Soles a Libras":
		monedas.SolesLibra(valor);
		break;
	
	case "De Soles a Yen Japones":
		monedas.SolesYen(valor);
		break;
		
	case "De soles a Won SurCoreano":
		monedas.SolesWon(valor);
		break;
	
	
	// De la divisa a soles	
	case "De Dolares a Soles":
		monedas.DolaresSoles(valor);
		break;
		
	case "De Euros a Soles":
		monedas.EurosSoles(valor);
		break;
		
	case "De Libras a Soles":
		monedas.LibrasSoles(valor);
		break;
		
	case "De Yen Japones a Soles":
		monedas.YenSoles(valor);
		break;
		
	case "De Won SurCoreano a Soles":
		monedas.WonSoles(valor);
		break;
	}
	
	}
}
