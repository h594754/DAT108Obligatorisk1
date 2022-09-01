package oppgave2;

import javax.swing.JOptionPane;

public class Main {
	
	
	public static void main(String[] args) {
		final String[] kokker = {"Anne", "Erik", "Knut"};
		final String[] servitorer = {"Mia", "Per"};
		final int KAPASITET = 4;
		
		skrivUtHeader(kokker, servitorer, KAPASITET);
		HamburgerBrett brett = new HamburgerBrett(KAPASITET);
		
		for(String navn : kokker) {
			new Kokk(brett, navn).start();
		}
		
		for(String navn : servitorer) {
			new Servitor(brett, navn).start();
		}
	}

	private static void skrivUtHeader(String[] kokker, String[] servitorer, int kAPASITET) {
		// TODO Auto-generated method stub
		
	}
}
