package geoimage;

public class Trougao extends GeometricImage{

	int a;
	public Trougao() {
		a=1;
	}

	public Trougao (int a) {
		this.a =a;
	}

	@Override
	public double obim() {
		return a*3;
	}
	


	@Override
	public double povrsina() {
		return a*a*Math.sqrt(3)/4;
	}
	
}
