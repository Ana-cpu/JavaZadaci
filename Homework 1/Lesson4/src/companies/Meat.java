package companies;

import java.time.LocalDateTime;

public class Meat extends ProductFeature{

	private String animal;

	public Meat(String name, double price, String date, String animal) {
		super(name, price, date);
		this.animal = animal;
	}
	
	public void setMeat (String animal) {
		this.animal = animal;
	}
	
	public String getMeal() {
		return animal;
	}

}
