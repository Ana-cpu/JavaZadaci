package geoimage;

public class ElipsaExample extends Circle {
	double a;
	double r;

	
	public void Circle() {
		r=1;
		a=2;
	}
	
	public void Circle(double r, double a) {
		this.r = r;
		this.a = a;
	}
	
	@Override
	public double obim() {
		return r*Math.PI*(9-Math.sqrt(35))/2;
	}

	@Override
	public double povrsina() {
		return r*Math.PI*a;
	}

}
