package nekretnina;

public abstract class Nekretnina {
	public String adress;
	public String zone;
	public int kvadratura;
	public double okucnica;
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

	public nekretnina.Nekretnina.Vlasnik getVlasnik(String adress, String zone, int kvadratura,nekretnina.Nekretnina.Vlasnik Vlasnik) {
		return getVlasnik();
	}

	public String getKuca(String adress, String zone, int kvadratura, nekretnina.Nekretnina.Vlasnik Vlasnik) {
		return null;
	}

	public double getOkucnica(String adress, String zone, int kvadratura, nekretnina.Nekretnina.Vlasnik Vlasnik, double okucnica) {
		return 0;
	}

	public String getKuca(String adress, String zone, int kvadratura, nekretnina.Nekretnina.Vlasnik Vlasnik, double okucnica) {
		// TODO Auto-generated method stub
		return null;
	}
}
