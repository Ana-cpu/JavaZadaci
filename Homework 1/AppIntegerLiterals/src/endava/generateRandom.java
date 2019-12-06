package endava;

import java.util.Random;
import java.util.Scanner;

public class generateRandom {

	public static void main(String[] args) {
	
		Random rand = new Random();
		
		//Get Integer Input From the User
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		System.out.println("You entered " + number);
		
		//Generate random integer in range 0 to 50
		int rand_int1 = rand.nextInt(50);
		
		//Print random integer
		System.out.println("Random Integer: "+rand_int1);
		
		//Incredible, you enter expected number
		if(number == rand_int1) {
			System.out.println("Incredible, you enter expected number");
		}
		int c= (Math.abs(number-rand_int1));
		if(c <=5) {
			System.out.print("Good catch, You were so good:" + Math.abs(number-rand_int1));
		}
		else{
			System.out.print("More lucky next time");
		}
	}

}
