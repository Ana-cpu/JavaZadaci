package geoimage;

public class NejednakostranicniTrougao extends Trougao{
	int b;
	int c;
	int s;
	
	public NejednakostranicniTrougao() {
		super();
		b= 3;
		c= 4;
	
	}
	
	public NejednakostranicniTrougao(int a, int b, int c) {
		super(a);
		this.b = b;
		this.c = c;
	}
	
	public double poluobim() {
		int s = (a+b+c)/2;
		return s;
	}
	
	public double obim() {
		return a + b + c;
	}
	
	public double povrsina() {
		double P = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		return P;
	}

}
