package companies;

import java.time.LocalDateTime;

public class MilkProducts extends ProductFeature{

	private String origin;
	
	public MilkProducts() {
		origin = "cow";
	}

	public MilkProducts(String name, double price, String date, String origin) {
		super(name, price, date);
		this.origin = origin;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getOrigin() {
		return origin;
	}

}
