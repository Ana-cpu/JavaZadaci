package geoimage;

public class Kvadrat extends GeometricImage{

	int a;
	public Kvadrat() {
		a=1;
	}

	public Kvadrat (int a) {
		this.a =a;
	}

	@Override
	public double obim() {
		return a*4;
	}

	@Override
	public double povrsina() {
		return a*a;
	}
	
}
