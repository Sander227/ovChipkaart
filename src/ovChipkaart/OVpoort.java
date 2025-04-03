package ovChipkaart;

public class OVpoort {

	private double standaardTarief;
	
	public OVpoort (double standaardTarief){
		this.standaardTarief = standaardTarief;
	}
	
	public void Inchecken(OVkaart kaart) {
		if (kaart.getingecheckt()) {
			System.out.println("Je kan niet nog een keer inchecken");
		}
		else if (kaart.getsaldo() >= standaardTarief) {
			kaart.setsaldo(kaart.getsaldo() - standaardTarief);
			kaart.setingecheckt(true);
			System.out.println("Je bent ingecheckt. Je saldo is nu: "+kaart.getsaldo());
		}
		else {
			System.out.println("Je hebt niet genoeg saldo. Je bent niet ingecheckt");
		}
	}
	
	public void Uitchecken (OVkaart kaart) {
//		double afstand = afstandBerekenen
		if (!kaart.getingecheckt()) {
			System.out.println("Je kan niet uitchecken. Je bent nog niet ingecheckt");
		}
		else {
			kaart.setsaldo(kaart.getsaldo() + standaardTarief);
			
		}
	}
}

