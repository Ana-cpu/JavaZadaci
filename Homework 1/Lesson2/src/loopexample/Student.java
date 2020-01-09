package loopexample;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		int length = 0;
		String[] student = new String[length];
		int points[] = new int[length];
		int i;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number of students: ");
		length = input.nextInt();
		
		for(i=0; i<length; i++) {
			System.out.println("Enter student: " + (i+1) + ":");
			student[i] = input.next();
			System.out.println("Enter points of student " + (i+1) + ":" );
			points[i] = input.nextInt();
		}
		input.close();
		
		//Calculate max points

		int temp = points[0];
		points[i] = points[0];
		if(points[i]<points[i+1]) {
			temp = points[i+1];
			System.out.println("Student with max points:  " + temp);
		}
		

	}

}
