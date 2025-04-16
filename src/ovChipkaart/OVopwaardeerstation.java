package ovChipkaart;

public class OVopwaardeerstation {

	private OVkaart kaartInMachine;

	public void kaartGeven(OVkaart kaart) {
		this.kaartInMachine = kaart;
	}

	public void kaartOpwaarderenTot(double bedrag) {
		if (this.kaartInMachine != null) {
			if (bedrag > this.kaartInMachine.getsaldo()) {
				this.kaartInMachine.setsaldo(bedrag);
				System.out.println("Succesvol opgewaardeerd. U heeft nu nog: " + this.kaartInMachine.getsaldo() + " op uw kaart staan");
			} else {
				System.out.println("Je kan niet opwaarderen naar een lager bedrag dan de saldo");
			}
		} else {System.out.println("Je kan niet opwaarderen omdat er geen kaart in zit");}

	}

	public void kaartOpwaarderenMet(double bedrag) {
		if (this.kaartInMachine != null) {
			if (bedrag > 0) {
				this.kaartInMachine.setsaldo(this.kaartInMachine.getsaldo() + bedrag);
				System.out.println("Succesvol opgewaardeerd. U heeft nu nog: " + this.kaartInMachine.getsaldo() + " op uw kaart staan");
			} else {
				System.out.println("Je kan niet met een negatief getal opwaarderen");
			}
		} else {System.out.println("Je kan niet opwaarderen omdat er geen kaart in zit");}
	}
	
	public void kaartUitNemen() {
		if (this.kaartInMachine == null) {
			System.out.println("Je kan geen kaart eruit halen die er niet is");
		} else {
			this.kaartInMachine = null;
			System.out.println("Succesvol de pas uitgenomen");
		}
	}

}
