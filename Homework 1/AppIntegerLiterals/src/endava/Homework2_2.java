package endava;
import java.util.Scanner;

public class Homework2_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number of students: " );
		int n = input.nextInt();
		System.out.println("You entered " + n + "\n");

		//Enter student
		int i;
		
		for(i=0; i<n; i++) {
			
			System.out.println("Enter a name: ");
			String name = input.next();
			System.out.println("You entered " + name + "\n");

		    
			
			
			System.out.println("Enter a points: ");
			int points = input.nextInt();
			System.out.println("You entered points " + points + "for student " + name);
			int temp = points;
			i++;
			int max = points;
			if(max>temp) {
				temp = max;
				System.out.println (temp);
			}
			
		}
	}

}


