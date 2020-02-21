package student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class OceneStudent {

	private static String firstName;
	private String lastname;
	private static  int Mark;
	private double pointsNumber;
   
    //enterStudents
	public static void enterStudents() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number of Students:\t");
		int numStudents = Integer.parseInt(scanner.nextLine());
		
		Student[] s = new Student[numStudents];
		
		for(int i =0; i<numStudents; i++) {
			
			s[i] = new Student(firstName, i);
			s[i].getdata();
			s[i].finalmark();
			s[i].finalgrade();
			
		}
	       System.out.printf("Name\tPoints\tFinal\tLetter\tTest 1\tTest 2\tAssignments \n");
	    for(int j = 0; j < numStudents; j++ ){
	        s[j].print();
	    }    
	       
	}
	
	//getMark based on numberPoints
	
    public int getMark() {
	    if (pointsNumber <= 100 && pointsNumber > 90) Mark= 10;
	    else if (pointsNumber <= 91 && pointsNumber > 80) Mark= 9;
	    else if (pointsNumber <= 81 && pointsNumber > 70) Mark= 8;
	    else if (pointsNumber <= 71 && pointsNumber > 60) Mark= 7;
	    else if (pointsNumber <= 61 && pointsNumber > 50) Mark= 6;
	    
	    else {
	    	Mark= 5;
	    }
	    return Mark;
    }
	
	//construct a new student
	public OceneStudent(String firstName, String lastname, double pointsNumber, int Mark) {
		this.firstName = firstName;
		this.lastname = lastname;
		this.pointsNumber = pointsNumber;
		this.Mark = Mark; 
	}

	public boolean less(OceneStudent b) {
		OceneStudent a = this;
		return a.pointsNumber < b.pointsNumber;
	}
	
	public String toString() {
		return pointsNumber + " " + firstName + "" + lastname + "" + Mark + "";
	}
	

	
	public void printStudentDetails() {
		System.out.print("First name: " + firstName);
		System.out.print("Last name" + lastname);
		System.out.println(", Points: " + pointsNumber);
		System.out.println(", Mark: " + Mark);

	}
	
	public static void marks() throws FileNotFoundException{
  
		//this will be modified later
		int n = 0;
		// initialize an array
		OceneStudent[] oceneStudents = new OceneStudent[n];

		n++;
		
		for (int i=0; i<n; i++) {
			String firstName = StdIn.readString();
			String lastname = StdIn.readString();
			Double pointsNumber = StdIn.readDouble();
			oceneStudents[i] = new OceneStudent(firstName, lastname, pointsNumber, Mark);
		};
		
		//insertion sort students
		// this part will be modified later and number of points will be added
		for (int i = 0; i < n; i ++) {
			for (int j = i; j > 0; j --) {
				if (oceneStudents[j].less(oceneStudents[j-1])){
					OceneStudent swap = oceneStudents[j];
					oceneStudents[j] = oceneStudents[j-1];
					oceneStudents[j-1] = swap;
				}
			oceneStudents[i].printStudentDetails();
			}
		}
		
		//print results
		for(int i = 0; i < n; i++) {
	        StdOut.println(oceneStudents[i]);
		}
		
	}
	
	public static void main(String arr[]) throws FileNotFoundException{
		enterStudents();
		marks();
	}
}
