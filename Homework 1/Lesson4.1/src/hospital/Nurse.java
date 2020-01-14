package hospital;

import java.time.LocalDateTime;

public class Nurse extends Employ{

	private String shift;

	public void nurseinformation(String name, String surname, String address, String phone, LocalDateTime date, String shift) {
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.phone = phone;
		this.date = date;
		this.shift = shift;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setSurnameame(String surname) {
		this.surname = surname;
	}
	public String getSurame() {
		return surname;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	
	public LocalDateTime setDate(LocalDateTime date) {
		return this.date = date;
	}
	
	public void setShift(String shift) {
		this.shift = shift;
	}
	public String getShift() {
		return shift;
	}

}
