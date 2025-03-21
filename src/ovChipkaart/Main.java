package ovChipkaart;


public class Main {

	public static void main(String[] args) {
		
		OVkaart OVpas = new OVkaart(50.00);
		OVpaal paaltje = new OVpaal(5.00);

		paaltje.Inchecken(OVpas);
		
		paaltje.Inchecken(OVpas);
	}

}
