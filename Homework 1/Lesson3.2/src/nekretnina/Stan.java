package nekretnina;

import nekretnina.Nekretnina.Vlasnik;

public class Stan extends Nekretnina{

	
	public void Stan() {
		adress = "Milutina Milankovica 9dj";
		zone = "zone 1";
		kvadratura = 1234567890;
	}
	
	public void Stan(String adress, String zone, int kvadratura, Vlasnik Vlasnik) {
		this.adress = adress;
		this.zone = zone;
		this.kvadratura = kvadratura;
		this.Vlasnik = Vlasnik;
		
	}

	
	@Override
	public String getStan(String adress, String zone, int kvadratura, Vlasnik Vlasnik) {
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

}
