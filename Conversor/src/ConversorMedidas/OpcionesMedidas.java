package ConversorMedidas;
import javax.swing.*;

public class OpcionesMedidas {
 
	//De metros a :
	public void MetrosMilimetros(double valor ) {
		double valorMilimetro = valor*1000;
		valorMilimetro = (double)Math.round(valorMilimetro*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " metros" + " son " + valorMilimetro + " milimetros");
	}
	public void MetrosCentimetros(double valor ) {
		double valorCentimetro = valor*100;
		valorCentimetro = (double)Math.round(valorCentimetro*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " metros" + " son " + valorCentimetro + " centimetros");
	}	
	public void MetrosKilometros(double valor ) {
		double valorKilometro = valor/1000;
		valorKilometro = (double)Math.round(valorKilometro*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " metros" + " son " + valorKilometro + " kilometros");
	}	
	
	// De centimetros a: 
	public void CentimetrosMilimetros(double valor ) {
		double valorMilimetro = valor*10;
		valorMilimetro = (double)Math.round(valorMilimetro*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " centimetros" + " son " + valorMilimetro + " milimetros ");
	}	
	public void CentimetrosMetros(double valor ) {
		double valorMetro = valor/100;
		valorMetro = (double)Math.round(valorMetro*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " centimetros" + " son " + valorMetro + " metros");
	}	
	public void CentimetrosKilometros(double valor ) {
		double valorKilometro = valor/100000;
		valorKilometro = (double)Math.round(valorKilometro*10000d)/10000;
		JOptionPane.showMessageDialog(null, valor + " centimetros" + " son " + valorKilometro + " kilometros");
	}	
	
	//De kilometros a: 
	public void KilometrosMetros(double valor ) {
		double valorMetro = valor*1000;
		valorMetro = (double)Math.round(valorMetro*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " kilometros" + " son " + valorMetro + " metros");
	}	
	public void KilometrosCentimetros(double valor ) {
		double valorCentimetro = valor*100000;
		valorCentimetro = (double)Math.round(valorCentimetro*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " kilometros" + " son " + valorCentimetro + " centimetros");
	}	
}
