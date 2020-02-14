package nekretnina;


public class Kuca extends Nekretnina{

	Nekretnina Nekretnina;
	double okucnica;

	public Kuca() {
		super();
		okucnica = 250;
	}


	
	public void Kuca(String address, int zone, int kvadratura, Vlasnik Vlasnik, double okucnica) {
		this.address = address;
		this.zone = zone;
		this.kvadratura = kvadratura;
		this.Vlasnik = Vlasnik;
		this.okucnica = okucnica;
		
	}
	
	public double izracunajCenu(double kvadratura, int zone, double okucnica) {
		double cena = 0.0;
		if (zone == 1) {
			cena = (kvadratura + okucnica) * 3000 * 0.15;
		} else if (zone == 2) {
			cena = (kvadratura + okucnica) * 2000 * 0.15;
		} else if (zone == 3) {
			cena = (kvadratura + okucnica) * 1000 * 0.15;
		} else {
			cena = (kvadratura + okucnica) * 500 * 0.15;
		}
		return cena;

	}
	
	public String toString() {
		return "Adresa je: " + address + ", u zoni: " + zone + ", kvadrature: " + kvadratura + ", povrsina okucnice je: " + okucnica + ", cena je: " + izracunajCenu(kvadratura, zone, okucnica) + ", " + " Ime: " + ime + "\n Prezime: " + prezime + "\n Maticni broj: " + jmbg + "\n Broj licne karte: " + licnaKarta + "\nAddress: " + address + "\nZone: " + zone  + "\nkvadratura: " + kvadratura;

	}
}
