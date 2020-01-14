package companies;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import companies.ProductFeature;

public class Company {

	private double capital;
	public Company(double capital, double pdv) {
		this.capital = capital;
	} 
	
	public void setProduct(double capital) {
		this.capital = capital;
	}
	
	public double getCapital() {
		return capital;
	}
	
	List<String> productsMJ = Arrays.asList("MilkProducts", "Juice");
	{
		/*Same results will get if use
        for(String item: products) {
    	System.out.println(item);
        }*/
		Collections.sort(productsMJ);
		if ((ProductFeature.class.getName() == "MilkProducts")||(ProductFeature.class.getName() == "Juice")) {
			double ValidPrice = 0;
			//next line will be modified later
			//ValidPrice = ProductFeature.this.getPrice()/100 * Product.this.getPdvMJ() + ProductFeature.this.getPrice();
			ValidPrice += ValidPrice;
			if ((this.getCapital()>ValidPrice)) {
				System.out.println("God job, please continue");
			}else {
				System.out.println("You have enough money");
			}
		}
		productsMJ.forEach(System.out::println);
	}
	
	List<String> productsMC = Arrays.asList("Meat", "Coffe");
	{
	    /*Same results will get if use
	        for(String item: products) {
	    	System.out.println(item);
	    }*/
		Collections.sort(productsMC);
		if ((ProductFeature.class.getName() == "Meat")||(ProductFeature.class.getName() == "Coffe")) {
			double ValidPrice = 0;
			//next line will be modified later
			//ValidPrice = ProductFeature.this.getPrice()/100 * Product.this.getPdvMC() + ProductFeature.this.getPrice();
			ValidPrice += ValidPrice;
			if ((this.getCapital()<ValidPrice)) {
				System.out.println("It is not good solution, please think about this");
			}else {
				System.out.println("You have no enough money");
			}
		}
		
		productsMC.forEach(System.out::println);
	}
	
	
}

///add list of products; add method order(); is there enough capital based on product's list'  I will made a modification in this class