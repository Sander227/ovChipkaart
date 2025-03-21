package ovChipkaart;

public class OVpaal {

	private double standaardTarief;
	
	public OVpaal (double standaardTarief){
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
	
	
}

