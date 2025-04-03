package ovChipkaart;

public class OVpaal extends OVpoort {

	public OVpaal(double standaardTarief) {
		super(standaardTarief);
	}
	
	public void pasScannen(OVkaart ov) {
		if (ov.getingecheckt()) {
			this.Inchecken(ov);
		}
	}
}
