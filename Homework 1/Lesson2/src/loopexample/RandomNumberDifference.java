package loopexample;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberDifference {
	public static void test() {

        Random rand = new Random();
		Scanner input = new Scanner(System.in);
		String[] message = new String[2];
		String[] unexpected = new String[1];
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		if(number>50) {
			System.out.println("Out of the rang, try again");
			System.out.print("Enter an integer: ");
			number = input.nextInt();
		}
		System.out.println("You entered " + number);
		
		//Generate random integer in range 0 to 50
		int rand_int1 = rand.nextInt(50);
		System.out.println("Random Integer: "+rand_int1);
		
		if(number == rand_int1) {
			message[0] = "Incredible, you enter expected number";
			System.out.println(message[0]);
		}
		else{

			int c1= (Math.abs(number-rand_int1));
			if(c1 <=5) {
				message[1]="Good catch, You were so good, difference is less then 5";
				System.out.println(message[1]);
			}
			else {
			unexpected[0]="More lucky next time";
			System.out.println(unexpected[0]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] message = new String[2];
		String[] unexpected = new String[1];
		System.out.println("Hello, this is a bingo program:) Press Enter and continue game:) ");
		test();
		String c = input.nextLine();
		do{
			for(String current : message) {
				//System.out.println(current);
				c = input.nextLine();
				System.out.println("Do you want to continue y or n: ");
			}
			test();
			}while(c.equalsIgnoreCase("Y"));
		System.out.println("You finished your game. If you want to continue, please run application again.");
		
	}
}
		
			
	
