package student;

import java.util.Scanner;

public class Student {
	String name, finalgrade;
    private Double finalmark;
    int marks, marks1, assignments1, finalexam;
     
    public Student(String name, int marks) 
    {
        this.name = name;
         
        this.marks = marks;
    }

	public void getdata() {
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

}
