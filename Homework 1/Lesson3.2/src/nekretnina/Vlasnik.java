package nekretnina;

public abstract class Vlasnik {
	
	String ime;
	String prezime;
	String jmbg;
	String licnaKarta;
	
	public Vlasnik() {
		ime = "Ana";
		prezime = "Acanski";
		jmbg = "1234567891012";
		licnaKarta = "123456789";
	}
	
	public Vlasnik(String ime, String prezime, String jmbg, String licnaKarta) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.licnaKarta = licnaKarta;
	}

	public String toString() {
		return " Ime: " + ime + "\n Prezime: " + prezime + "\n Maticni broj: " + jmbg + "\n Broj licne karte: " + licnaKarta;
	}

}
