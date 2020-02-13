package loopexample;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberDifference {
	public static void main(String[] args) {
		Random rand = new Random();
		
		//Get Integer Input From the User
		Scanner input = new Scanner(System.in);

		String[] message = new String[2];
		String[] unexpected = new String[1];
		
		message[0] = "Incredible, you enter expected number";
		message[1]="Good catch, You were so good, difference is less then 5";
		
		unexpected[0]="More lucky next time";

		while(true) {
			
			for(String current : message) {
				System.out.println("Do you want to continue y or n: ");
				String c = input.nextLine();

				if(c.equalsIgnoreCase("n")){ 
				    return;
				}else {
					
					System.out.print("Enter an integer: ");
					int number = input.nextInt();
					System.out.println("You entered " + number);
					
					//Generate random integer in range 0 to 50
					int rand_int1 = rand.nextInt(50);
					
					//Print random integer
					System.out.println("Random Integer: "+rand_int1);
					
					//Incredible, you enter expected number
					if(number == rand_int1) {
						message[0] = "Incredible, you enter expected number";
					}
					int c1= (Math.abs(number-rand_int1));
					if(c1>0 || c1 <=5) {
						message[1]="Good catch, You were so good, difference is less then 5";
					}
					else{
						unexpected[0]="More lucky next time";
					}
			     }
			}
			for(String current1 : unexpected) {
				System.out.println(current1);
			}
		}
	}
}
