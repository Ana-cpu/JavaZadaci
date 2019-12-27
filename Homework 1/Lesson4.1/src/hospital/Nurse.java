package hospital;

import java.time.LocalDateTime;

public class Nurse extends Employ{

	private String shift;

	public void nurseinformation(String name, String surname, String address, String phone, LocalDateTime date, String shift) {
		super(name, surname, address, phone, shift);
		this.shift = shift;
	}
	
	public void setShift(String shift) {
		this.shift = shift;
	}
	public String getShift() {
		return shift;
	}

}
