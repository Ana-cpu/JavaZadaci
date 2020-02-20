package hospital;
import java.time.LocalDateTime;

public class Employ {

	public String name;
	public String surname;
	public String address;
	public String phone;
	public LocalDateTime date;
	
	public Employ() {
		name = "Ana";
		surname = "Acanski";
		address = "Bulevar Patrijarha Pavla 8";
		phone = "545546465000";
		date = LocalDateTime.of(2017, 2, 13, 15, 56);	
	}

	public void pubicInformation(String name, String surname, String address, String phone, LocalDateTime date) {
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.phone = phone;
		this.date = date;
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
		this.surname = surname;
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
	
}
