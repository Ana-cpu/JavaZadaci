package nekretnina;

import nekretnina.Vlasnik;

public class Kuca extends Nekretnina{
	String address;
	String zone;
	int kvadratura;
	nekretnina.Vlasnik Vlasnik;
	double okucnica;

	
	public void Kuca(String address, String zone, int kvadratura, nekretnina.Vlasnik Vlasnik, double okucnica) {
		this.address = address;
		this.zone = zone;
		this.kvadratura = kvadratura;
		this.Vlasnik = Vlasnik;
		this.okucnica = okucnica;
		
	}
	
	public String toString() {
		return " Adresa: " + address + "\n Zona: " + zone + "\n Kvadratura: " + kvadratura + "\n Vlasnik: " + Vlasnik + "\n okucnica: " + okucnica;
	}
}
