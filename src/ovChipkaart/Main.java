package ovChipkaart;


public class Main {

	public static void main(String[] args) {
		
		OVstation nijmegen = new OVstation(700, 800, "nijmegen");
		OVstation venray = new OVstation(200, 600, "venray");
		OVkaart OVpas = new OVkaart(50.00);
		OVpoort poortje = new OVpoort(nijmegen, 5.00);
		OVpoort poortje2 = new OVpoort(venray, 5.00);

		poortje.Inchecken(OVpas);
		
		poortje2.Uitchecken(OVpas);
		
	}

}
