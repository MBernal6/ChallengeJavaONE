package ConversorMonedas;
import javax.swing.*;

public class TipoCambio {
	
	//Tipos de cambio de soles a la divisa correspondiente

	public void SolesDolares(double valor) {
		double valorDolar = valor/3.79;
		valorDolar = (double)Math.round(valorDolar*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ valorDolar + "Dolares");
	}
	public void SolesEuro(double valor) {
		double valorEuro = valor/4.05;
		valorEuro = (double)Math.round(valorEuro*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ valorEuro + "Euros");
	}
	public void SolesLibra(double valor) {
		double valorLibra = valor/4.56;
		valorLibra = (double)Math.round(valorLibra*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ valorLibra + "Libras");
	}
	public void SolesYen(double valor) {
		double valorYen = valor/35.87;
		valorYen = (double)Math.round(valorYen*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ valorYen + "Yenes");
	}
	public void SolesWon(double valor) {
		double valorWon = valor/342;
		valorWon = (double)Math.round(valorWon*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ valorWon + "Won");
	}
	
	// Tipos de cambio de la divisa a soles 
	
	public void DolaresSoles(double valor) {
		double valorSolesD = valor*3.79;
		valorSolesD = (double)Math.round(valorSolesD*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ valorSolesD + "Soles");
	}
	public void EurosSoles(double valor) {
		double valorSolesE = valor*4.05;
		valorSolesE = (double)Math.round(valorSolesE*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ valorSolesE + "Soles");
	}
	public void LibrasSoles(double valor) {
		double valorSolesL = valor*4.56;
		valorSolesL = (double)Math.round(valorSolesL*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ valorSolesL + "Soles");
	}
	public void YenSoles(double valor) {
		double valorSolesY = valor*35.87;
		valorSolesY = (double)Math.round(valorSolesY*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ valorSolesY + "Soles");
	}
	public void WonSoles(double valor) {
		double valorSolesW = valor*342;
		valorSolesW = (double)Math.round(valorSolesW*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ valorSolesW + "Soles");
	}
}
