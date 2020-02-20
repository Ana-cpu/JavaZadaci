package geoimage;

public class Pravougaonik extends Kvadrat{

	int b;
	
	public Pravougaonik() {
		super();
		b=2;
	}
	
	public Pravougaonik(int a, int b) {
		super(a);
		this.b = b;
	}
	
	public double obim() {
		return 2*a + 2*b;
	}
	
	public double povrsina() {
		double P = a*b;
		return P;
	}




}
