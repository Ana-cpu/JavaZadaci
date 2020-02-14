package nekretnina;

public class Nekretnina extends Vlasnik{

	String address;
	int zone;
	int kvadratura;
	Vlasnik Vlasnik;
	
	public Nekretnina() {
		super();
		address = "Bulevar Patrijarha Pavla";
		zone = 2;
		kvadratura = 63;
	}
	
	public Nekretnina(Vlasnik Vlasnik, String address, int zone, int kvadratura) {
		this.Vlasnik = Vlasnik;
		address = "Bulevar Patrijarha Pavla";
		zone = 2;
		kvadratura = 63;
	}

	public String toString() {
		return " Ime: " + ime + "\n Prezime: " + prezime + "\n Maticni broj: " + jmbg + "\n Broj licne karte: " + licnaKarta + "\nAddress: " + address + "\nZone: " + zone  + "\nkvadratura: " + kvadratura ;
	}

	
}
