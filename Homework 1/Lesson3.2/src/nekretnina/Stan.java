package nekretnina;

import nekretnina.Vlasnik;

public class Stan extends Nekretnina{
	String address;
	String zone;
	int kvadratura;
	nekretnina.Vlasnik Vlasnik;


	public Stan(String string, String string2, int i, nekretnina.Vlasnik Vlasnik) {
		this.address = address;
		this.zone = zone;
		this.kvadratura = kvadratura;
		this.Vlasnik = Vlasnik;
	}
	
	public String toString() {
		return " Adresa: " + address + "\n Zona: " + zone + "\n Kvadratura: " + kvadratura + "\n Vlasnik: " + Vlasnik;
	}

}
