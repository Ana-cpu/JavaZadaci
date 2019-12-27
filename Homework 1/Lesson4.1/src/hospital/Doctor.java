package hospital;

import java.time.LocalDateTime;

public class Doctor extends Employ {
	private String school;

	public void doctorInformation(String name, String surname, String address, String phone, LocalDateTime date, String school){
		super(pubicInformation);
		this.school = school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	public String getSchool() {
		return school;
	}
	
}
