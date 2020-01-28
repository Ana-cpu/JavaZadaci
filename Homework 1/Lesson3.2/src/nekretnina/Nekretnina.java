package nekretnina;
import nekretnina.Vlasnik;

public abstract class Nekretnina {
	String adress;
	String zone;
	int kvadratura;
	double okucnica;
	nekretnina.Vlasnik Vlasnik;

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
}
