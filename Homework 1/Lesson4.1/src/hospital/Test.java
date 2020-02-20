package hospital;

import java.time.LocalDateTime;

public class Test {

	public static void main(String[] args) {
		PrivateHospital h1 = new PrivateHospital();
		Doctor d1 = new Doctor();
		Employ e1 = new Employ();
		Nurse n1 = new Nurse();
		
		//hospital's information
		System.out.println("There are: " + h1.numberHospital + " hospitals");
		System.out.println("Hospital name is: " + h1.hospitalName);
		System.out.println("Hospital's director name is: " + h1.directorName);
		System.out.println("There are " + h1.numberEmploy + " employers");
		//doctor's informations:
		System.out.println("Doctor's name is: " + d1.name);
		System.out.println("Doctor's surname is: " + d1.surname);
		System.out.println("Doctor's address is: " + d1.address);
		System.out.println("Doctor's phone is: " + d1.phone);
		System.out.println("Date is: " + d1.date);
		System.out.println("School is: " + d1.school);
        //employ's informations
		System.out.println("Employ's name is: " + e1.name);
		System.out.println("Employ's surname is: " + e1.surname);
		System.out.println("Employ's address is: " + e1.address);
		System.out.println("Employ's phone is: " + e1.phone);
		System.out.println("date: " + e1.date);
		//nurse's information
		System.out.println("Nurse's name is: " + n1.name);
		System.out.println("Nurse's surname is: " + n1.surname);
		System.out.println("Nurse's address is: " + n1.address);
		System.out.println("Nurse's phone is: " + n1.phone);
		System.out.println("Nurse's date is: " + n1.date);


	}
		
		
}
