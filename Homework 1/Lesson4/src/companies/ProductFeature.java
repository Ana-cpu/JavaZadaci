package companies;

import java.time.LocalDateTime;

public abstract class ProductFeature {

	private String name;
	private double price;
	private String date;

	public ProductFeature(String name, double price, String string) {
		this.name = name;
		this.price = price;
		this.date = string;
	}
	
	/////set appropriate values
	public void setName(String name) {
		this.name=name;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public void setDate(String date) {
		this.date=date;
	}
	
	//////get appropriate values
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getDate() {
		return date;
	}
}
