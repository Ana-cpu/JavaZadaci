package nekretnina;


public class Stan extends Nekretnina{
	
	Nekretnina Nekretnina;

	public Stan() {
		super();
	}
	
	public Stan(Vlasnik Vlasnik, String address, int zone, int kvadratura) {
		this.Nekretnina = Nekretnina;
	}
	
	public double izracunajCenu(double kvadratura, int zone) {
		double cena = 0.0;
		if (zone == 1) {
			cena = kvadratura * 3000 * 0.15;
		} else if (zone == 2) {
			cena = kvadratura * 2000 * 0.15;
		} else if (zone == 3) {
			cena = kvadratura * 1000 * 0.15;
		} else {
			cena = kvadratura * 500 * 0.15;
		}
		return cena;

	}
	
	public String toString() {
		return "Adresa je: " + address + ", u zoni: " + zone + ", kvadrature: " + kvadratura + ", cena je: " + izracunajCenu(kvadratura, zone) + ", " + Vlasnik.toString();

	}
}
