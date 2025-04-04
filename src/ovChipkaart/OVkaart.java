package ovChipkaart;

public class OVkaart {

	private double saldo = 0;
	private boolean ingecheckt = false;
	private OVstation incheckStation;
	
	public OVkaart(double saldo) {
		this.saldo = saldo;
	}
	
	public double getsaldo() {
		return saldo;
	}
	
	public void setsaldo(double saldo) {
		this.saldo= saldo;
	}
	
	public boolean getingecheckt() {
		return ingecheckt;
	}
	
	public void setingecheckt(boolean ingecheckt) {
		this.ingecheckt= ingecheckt;
	}
	
	public OVstation getyinchecklocatie() {
		return this.incheckStation;
	}
	
	public void setinchecklocatie(OVstation station) {
		this.incheckStation = station;
	}
	
	
	
	
	
}
