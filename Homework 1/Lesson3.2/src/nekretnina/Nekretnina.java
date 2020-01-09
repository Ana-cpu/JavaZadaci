package nekretnina;

public abstract class Nekretnina {
	public String adress;
	public String zone;
	public int kvadratura;
	public Vlasnik Vlasnik;
	public class Vlasnik{
		public String ime;
		public String prezime;
		public int JMBG;
		public int brlk;
		
	}


    public String getAdress() {
        return adress;
    }
    
    public String getZone() {
    	return zone;
    }
    
    public int getKvadratura() {
    	return kvadratura;
    }
    
    public Vlasnik getVlasnik(){
		return Vlasnik;
    	
    }

	public String getStan(String adress, String zone, int kvadratura, nekretnina.Nekretnina.Vlasnik Vlasnik) {
		return null;
	}

	public String getAdress(String adress, String zone, int kvadratura, nekretnina.Nekretnina.Vlasnik Vlasnik) {
		return getAdress();
	}

	public String getKvadratura(String adress, String zone, int kvadratura, nekretnina.Nekretnina.Vlasnik Vlasnik) {
		return getZone();
	}

	public nekretnina.Nekretnina.Vlasnik getVlasnik(String adress, String zone, int kvadratura,
			nekretnina.Nekretnina.Vlasnik Vlasnik) {
		return getVlasnik();
	}

	public nekretnina.Nekretnina.Vlasnik getVlasnik(String adress, String zone, String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
}
