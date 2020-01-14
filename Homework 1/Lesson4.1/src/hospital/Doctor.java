package hospital;

import java.time.LocalDateTime;

public class Doctor extends Employ {
	public String school;

	public void doctorInformation(String name, String surname, String address, String phone, LocalDateTime date, String school){
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.phone = phone;
		this.date = date;
		this.school = school;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSurname() {
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
	public LocalDateTime getDate() {
		return date;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	public String getSchool() {
		return school;
	}
	
}
