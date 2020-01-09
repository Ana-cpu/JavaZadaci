package geoimage;

public class JednakokrakiTrougao extends Trougao {
	int b;
	
	public JednakokrakiTrougao() {
		super();
		b=2;
	}
	
	public JednakokrakiTrougao(int a, int b) {
		super(a);
		this.b = b;
	}
	
	public double obim() {
		return a + 2*b;
	}
	
	public double povrsina() {
		double ha = Math.sqrt(b*b - ((a/2)*(a/2)));
		return a*ha/2;
	}





}
