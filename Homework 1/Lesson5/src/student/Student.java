package student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Student {
	static String name;
	String finalgrade;
    private Double finalmark;
    static int marks;
	static int marks1;
	static int assignments1;
	static int finalexam;
     
    public Student(String name, int marks) 
    {
        this.name = name;
         
        this.marks = marks;
    }

	public static void getdata() {
		//print message to enter numbers
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name of student:");
		name = input.next();
		
		while(!name.matches("[a-zA-Z]+")) {
			System.out.println("Please re-enter your name, use alphabets only");
			name = input.nextLine();
		}
		
		System.out.println("Enter points for student:");
		marks =input.nextInt();
		
		while (marks > 100 || marks<0) {
			System.out.println("Please enter a vallue between 0 and 100");
			while(!input.hasNextInt()) {
				input.hasNext();
			}
			marks = input.nextInt();
		}
		
		System.out.println("Enter points for student:");
		marks1 =input.nextInt();
		
		while (marks1 > 100 || marks1<0) {
			System.out.println("Please enter a vallue between 0 and 100");
			while(!input.hasNextInt()) {
				input.hasNext();
			}
			marks1 = input.nextInt();
		}
		
		System.out.println("Enter points for student:");
		assignments1 =input.nextInt();
		
		while (assignments1 > 100 || assignments1<0) {
			System.out.println("Please enter a vallue between 0 and 100");
			while(!input.hasNextInt()) {
				input.hasNext();
			}
			assignments1 = input.nextInt();
		}
		
		System.out.println("Enter points for student:");
		finalexam =input.nextInt();
		
		while (finalexam > 100 || finalexam<0) {
			System.out.println("Please enter a vallue between 0 and 100");
			while(!input.hasNextInt()) {
				input.hasNext();
			}
			finalexam = input.nextInt();
		}
	}
	

	public void finalmark(){
        finalmark = (marks * 0.15) + (marks1 * 0.25) + (assignments1 * 0.25) + (finalexam * 
    0.35);
	}
	 public void finalgrade()
     {
         if(finalmark >= 100)
           finalgrade="10+";
         else if(finalmark >= 90)
        	 finalgrade="10";
         else if(finalmark >= 80)
        	 finalgrade="9";
         else if(finalmark >= 70)
        	 finalgrade="8";
         else if(finalmark >= 60)
        	 finalgrade="7";
         else if(finalmark >= 50)
        	 finalgrade="6";
         else 
        	 finalgrade="5";
     }
	 
	 public void print(){

         System.out.printf("%s\t%.2f\t%s\t%d\t%d\t%d\t\t%d\n", name, finalmark,              
         finalgrade, marks, marks, assignments1, finalexam);
	 }
	 
	 public static void main(String arr[]) throws FileNotFoundException 
	    { 
		    OceneStudent.enterStudents();
	        // Creating a File object that represents the disk file. 
	        PrintStream o = new PrintStream(new File("ocene.txt")); 
	  
	        // Store current System.out before assigning a new value 
	        PrintStream console = System.out; 
	  
	        // Assign o to output stream 
	         
	        System.setOut(o);
	        getdata();
	  
	        // Use stored value for output stream 
	        System.setOut(console); 
	        System.out.println("This will be written on the console!"); 
	    } 

}
