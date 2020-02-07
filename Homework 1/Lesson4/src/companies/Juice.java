package companies;

import java.time.LocalDateTime;

public class Juice extends ProductFeature {

	private String fruit;
	
	public Juice(){
		fruit = "apple";
	}
    
	public Juice(String name, double price, String date) {
		super(name, price, date);
		this.fruit=fruit;
	}

	public void setFruit(String fruit) {
		this.fruit=fruit;
	}
	
	public String getFruit(){
		return fruit;
	}	
	
}
