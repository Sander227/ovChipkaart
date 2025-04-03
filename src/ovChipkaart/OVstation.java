package ovChipkaart;


public class OVstation {

	private double coordinaatX;
	private double coordinaatY;
	private String stationNaam;
	
	
	public OVstation (double coordinaatX, double coordinaatY, String stationNaam) {
		this.coordinaatX = coordinaatX;
		this.coordinaatY = coordinaatY;
		this.stationNaam = stationNaam;
	}
	
	public double afstandBerekenen(OVstation anderStation) {
		double somX = anderStation.coordinaatX - this.coordinaatX;
		double somY = anderStation.coordinaatY - this.coordinaatY;
		return Math.sqrt(somX * somX + somY * somY);
	}
}

