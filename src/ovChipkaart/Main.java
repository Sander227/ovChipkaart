package ovChipkaart;


public class Main {

	public static void main(String[] args) {
		
		OVkaart OVpas = new OVkaart(50.00);
		OVpoort poortje = new OVpoort(5.00);

		poortje.Inchecken(OVpas);
		
		poortje.Inchecken(OVpas);
	}

}
