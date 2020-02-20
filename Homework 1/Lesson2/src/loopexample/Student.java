package loopexample;

import java.util.Scanner;


public class Student {

	public static void main(String[] args) {
		int length;

		
		System.out.println("Enter a number of students: ");
		Scanner input = new Scanner(System.in);
		length = input.nextInt();

		String[] student = new String[length];
		String temp_student = student[0];
		int points[] = new int[length];
		int i=0;
		int temp = points[0];
		
		for(i=0; i<length; i++) {
			System.out.println("Enter student: " + (i+1) + ":");
			student[i] = input.next();
			System.out.println("Enter points of student " + (i+1) + ":" );
			points[i] = input.nextInt();
			//student[i] = new Student();
		}
		

		for(i=0; i<length-1; i++) {
			//Calculate max points
			if(points[i]<points[i+1]) {
				temp = points[i+1];
				temp_student = student[i+1];
			}else
				temp = points[i];
			    temp_student = student[i+1];
		}

		System.out.println("Student with max points:  " + temp_student + " " + temp );
		
		input.close();
	}
}
