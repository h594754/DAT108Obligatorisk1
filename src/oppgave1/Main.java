package oppgave1;

import javax.swing.JOptionPane;

public class Main {
	public static String melding = "";

	public static void main(String[] args) throws InterruptedException {
		melding = JOptionPane.showInputDialog("Hvilke startmelding ønsker du?");	
		
		Thread t1 = new Thread() {
			@Override
			public void run() {

				while (!melding.equals("quit")) {
					System.out.println("Hallo verden");
					System.out.println(melding);
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
					}
				}
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				while(!melding.equals("quit")) {
				melding = JOptionPane.showInputDialog("Hva vil du at meldingen skal være?");
				}
				}
		};

		t1.start();
		t2.start();

	}

}
