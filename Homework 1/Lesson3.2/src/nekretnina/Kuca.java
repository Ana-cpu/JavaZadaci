package nekretnina;

import nekretnina.Nekretnina.Vlasnik;

public class Kuca extends Nekretnina{

	
	public void Kuca() {
		adress = "Milutina Milankovica 9dj";
		zone = "zone 1";
		kvadratura = 1234567890;
		okucnica = 25;
	}
	
	public void Kuca(String adress, String zone, int kvadratura, Vlasnik Vlasnik, double okucnica) {
		this.adress = adress;
		this.zone = zone;
		this.kvadratura = kvadratura;
		this.Vlasnik = Vlasnik;
		this.okucnica = okucnica;
		
	}

	
	@Override
	public String getKuca(String adress, String zone, int kvadratura, Vlasnik Vlasnik, double okucnica) {
		return zone;
	}

	@Override
	public String getAdress(String adress, String zone, int kvadratura, Vlasnik Vlasnik) {
		return adress;
	}

	@Override
	public String getKvadratura(String adress, String zone, int kvadratura, Vlasnik Vlasnik) {
		return getKvadratura(null, null, 0, null);
	}

	@Override
	public Vlasnik getVlasnik(String adress, String zone, int kvadratura, Vlasnik Vlasnik) {
		return Vlasnik;
	}

	@Override
	public double getOkucnica(String adress, String zone, int kvadratura, Vlasnik Vlasnik, double okucnica) {
		return okucnica;
	}
}
