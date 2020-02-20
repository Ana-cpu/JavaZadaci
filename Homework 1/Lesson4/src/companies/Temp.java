package companies;

import java.time.LocalDateTime;

public class Temp {

	public static void main(String[] args) {
		Coffe company = new Coffe("test", 23, "23.12.2019", "test");
		Company testCompany =  new Company(20, 20);
		
		Coffe c1 = new Coffe();
		Company co1= new Company();
		Juice j1 = new Juice();
		Meat m1 = new Meat();
		MilkProducts mp1 = new MilkProducts();
		Product p1 = new Product();
		ProductFeature pf1 = new ProductFeature();
		
		//coffe's information
	    System.out.println("Price is: " + c1.getPrice());
	    System.out.println("Date is: " + c1.getDate());
	    System.out.println("Name is: " + c1.getName());
	    System.out.println("Family is: " + c1.getFamily());
	    
	    //company information
	    System.out.println("Capital is: " + co1.getCapital());
	    
	    //juice's information
	    System.out.println("Date is " +j1.getDate());
	    System.out.println("Fruit is " +j1.getFruit());
	    System.out.println("Name is " +j1.getName());
	    System.out.println("Price is " +j1.getPrice());
	    
	    //meat's information
	    System.out.println("Meat date is " +m1.getDate());
	    System.out.println("Meal is " +m1.getMeal());
	    System.out.println("Name is " +m1.getName());
	    
	    //milkProduct's information
	    System.out.println("MilkProducts date is " +mp1.getDate());
	    System.out.println("MilkProducts name is " +mp1.getName());
	    System.out.println("MilkProducts origin is " +mp1.getOrigin());
	    System.out.println("MilkProducts price is " +mp1.getPrice());
	    
	    //Product's information
	    System.out.println("Product PdvMC is " +p1.getPdvMC());
	    System.out.println("Product PdvMJ is " +p1.getPdvMJ());
	    System.out.println("Product ProductMC is " +p1.getProductMC());
	    System.out.println("Product ProductMJ is " +p1.getProductMJ());
	    
	    //ProductFeature's information
	    System.out.println("ProductFeature date is " +pf1.getDate());
	    System.out.println("ProductFeature name is " +pf1.getName());
	    System.out.println("ProductFeature price is " +pf1.getPrice());
		
		//Coffe
		System.out.println(company);
		//Company
		System.out.println(testCompany);
		
		
	}
}