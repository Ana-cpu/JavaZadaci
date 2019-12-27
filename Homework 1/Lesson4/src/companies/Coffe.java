package companies;

import java.time.LocalDateTime;

public class Coffe extends ProductFeature {

	private String family;

	public Coffe(String name, double price, String string, String family) {
		super(name, price, string);
		this.family = family;
	}
	
	public void setFamily(String family) {
		this.family = family;
	}
	
	public String getFamily() {
		return family;
	}
}
