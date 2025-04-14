package ovChipkaart;


public class OVstation {

	private double coordinaatX;
	private double coordinaatY;
	
	
	public OVstation (double coordinaatX, double coordinaatY) {
		this.coordinaatX = coordinaatX;
		this.coordinaatY = coordinaatY;
	}
	
	public double afstandBerekenen(OVstation anderStation) {
		double somX = anderStation.coordinaatX - this.coordinaatX;
		double somY = anderStation.coordinaatY - this.coordinaatY;
		return Math.sqrt(somX * somX + somY * somY);
	}
}

