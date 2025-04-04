package ovChipkaart;

public class OVpoort {

	private double standaardTarief;
	OVstation station;
	
	public OVpoort (OVstation tempstation, double standaardTarief){
		this.standaardTarief = standaardTarief;
		this.station = tempstation;
	}
	
	public void Inchecken(OVkaart kaart) {
		if (kaart.getingecheckt()) {
			System.out.println("Je kan niet nog een keer inchecken");
		}
		else if (kaart.getsaldo() >= standaardTarief) {
			kaart.setsaldo(kaart.getsaldo() - standaardTarief);
			kaart.setingecheckt(true);
			kaart.setinchecklocatie(station);
			System.out.println("Je bent ingecheckt.");
		}
		else {
			System.out.println("Je hebt niet genoeg saldo. Je bent niet ingecheckt");
		}
	}
	
	public void Uitchecken (OVkaart kaart) {
		double afstand = station.afstandBerekenen(kaart.getyinchecklocatie());
		if (!kaart.getingecheckt()) {
			System.out.println("Je kan niet uitchecken. Je bent nog niet ingecheckt");
		}
		else {
			kaart.setsaldo(kaart.getsaldo() + standaardTarief);
			kaart.setsaldo(kaart.getsaldo() - afstand/100);
			System.out.println("Je bent uitgecheckt. Je saldo is nu: " + kaart.getsaldo());
		}
	}
}

