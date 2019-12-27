package hospital;

public abstract class PrivateHospital {

	int numberHospital;
	String hospitalName;
	String directorName;
	int numberEmploy;

	public void PrivateHospital(int numberhospital, String hospitalName, String directorName, int numberEmploy){
		this.numberHospital = numberHospital;
		this.hospitalName = hospitalName;
		this.directorName = directorName;
		this.numberEmploy = numberEmploy;
		}
	
	/*public void setHospitalName (String hospitalName) {
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
	}*/
	 /// work with toString method example
	public String toString() {
		return numberHospital + "" + hospitalName + "" + directorName + "" + numberEmploy;
	}
	
	public static void main(String args[]) {
		PrivateHospital h1 = new PrivateHospital("4", MedLab","Mika", 15);
		PrivateHospital h2 = new PrivateHospital("5", Vizim","Zika", 15);
	}
	
	System.out.println(h1);
	System.out.println(h2);

	}
