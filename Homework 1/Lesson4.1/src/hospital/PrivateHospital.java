package hospital;

public class PrivateHospital {

	int numberHospital;
	String hospitalName;
	String directorName;
	int numberEmploy;
	
	public PrivateHospital() {
		numberHospital =3;
		hospitalName = "Endava";
		directorName = "Genije";
		numberEmploy = 1023456789;
	}

	public void PrivateHospital(int numberHospital, String hospitalName, String directorName, int numberEmploy){
		this.numberHospital = numberHospital;
		this.hospitalName = hospitalName;
		this.directorName = directorName;
		this.numberEmploy = numberEmploy;
		}
	
	public void setHospitalName (String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public void setDirectorName (String directorName) {
		this.directorName = directorName;
	}
	public void setNumberEmploy (int numberEmploy) {
		this.numberEmploy = numberEmploy;
	}
	
	public String getHospitalName () {
		return hospitalName;
	}
	public String getDirectorName () {
		return directorName;
	}
	public int getNumberEmploy () {
		return numberEmploy;
	}
	 /// work with toString method example
	public String toString() {
		return numberHospital + "" + hospitalName + "" + directorName + "" + numberEmploy;
	}
}
