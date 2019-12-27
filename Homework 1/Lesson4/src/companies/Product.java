package companies;

public abstract class Product {

	private String productMC;
	private String productMJ;

	private double pdvMC;
	private double pdvMJ;

	public Product(String productMC, String productMJ, double pdvMC, double pdvMJ) {
		this.productMC = productMC;
		this.productMJ = productMJ;

		this.pdvMC = pdvMC;
		this.pdvMJ = pdvMJ;

	} 
	
	public void setProductMC(String productMC) {
		this.productMC = productMC;
	}
	
	public String getProductMC() {
		return productMC;
	} 
	
	public void setProductMJ(String productMJ) {
		this.productMJ = productMJ;
	}
	
	public String getProductMJ() {
		return productMJ;
	}
	
	public void setPdvMC(double pdvMC) {
		this.pdvMC = pdvMC;
	}
	
	public double getPdvMC() {
		return pdvMC;
	}
	
	public void setPdvMJ(double pdvMJ) {
		this.pdvMJ = pdvMJ;
	}
	
	public double getPdvMJ() {
		return pdvMJ;
	}
}
