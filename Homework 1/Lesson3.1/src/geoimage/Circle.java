package geoimage;

public class Circle extends GeometricImage{
	int r;
	
	public Circle() {
		r=1;
	}
	
	public Circle(int r) {
		this.r = r;
	}

	@Override
	public double obim() {
		return 2*r*Math.PI;
	}

	@Override
	public double povrsina() {
		return r*r*Math.PI;
	}

}
