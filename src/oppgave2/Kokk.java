package oppgave2;

public class Kokk extends Thread {

	private HamburgerBrett brett;
	private String navn;
	
	public Kokk(HamburgerBrett brett, String navn) {
		this.brett = brett;
		this.navn = navn;
	}

	@Override
	public void run() {
		System.out.println("Halla");
	}
}
