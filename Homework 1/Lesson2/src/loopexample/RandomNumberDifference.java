package loopexample;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberDifference {
	RandomNumberDifference(){
	      //you need to remove input and calculation logic from constructor,
	      //to avoid running it when constructing this object for testing.
	}

	 public int[] run() {
      return getInput();
  }
	 
	
	
	public static int[] getInput() {
        Random rand = new Random();
		
		//Get Integer Input From the User
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer between 1 and 50: ");
		int number = input.nextInt();
		System.out.println("You entered " + number);
		
		//Generate random integer in range 0 to 50
		int rand_int1 = rand.nextInt(50)+1;
		
		//Print random integer
		System.out.println("Random Integer: "+rand_int1);
		while( Math.abs(number-rand_int1)<=5) {
			RandomNumberDifference random = new  RandomNumberDifference();
			
			//Incredible, you enter expected number
			if(number == rand_int1) {
				System.out.println("Incredible, you enter expected number");
				random.run();
			}else{
				System.out.println("Good catch, You were so good:" + Math.abs(number-rand_int1));
				random.run();
			}
		}
		System.out.println("More lucky next time");
		return null;
	}

	public static void main(String[] args) {
		RandomNumberDifference random = new  RandomNumberDifference();
	    random.run();
	}
}
