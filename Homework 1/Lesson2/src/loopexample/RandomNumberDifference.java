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
        int number0 = 0;
        int number1 = 1;
        int number2 = 2;
		
		//Get Integer Input From the User
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer between 1 and 50: ");
		int number = input.nextInt();
		System.out.println("You entered " + number);
		
		//Generate random integer in range 0 to 50
		int rand_int1 = rand.nextInt(50)+1;
		
		//Print random integer
		System.out.println("Random Integer: "+rand_int1);
		
		//Incredible, you enter expected number
		if(number == rand_int1) {
			System.out.println("Incredible, you enter expected number");
			return new int[] {number0};
		}
		int c= (Math.abs(number-rand_int1));
		if(c <=5) {
			System.out.println("Good catch, You were so good:" + Math.abs(number-rand_int1));
			return new int[] {number1};
		}
		else{
			System.out.println("More lucky next time");
			return new int[] {number2};
		}
	}

	public static void main(String[] args) {
		  {
			  int[] returnValue= getInput();
			  for(int currentString : returnValue) {
				  RandomNumberDifference random = new  RandomNumberDifference();
			      random.run();

		    	 if((random.run()!=returnValue)||(returnValue == null)) {
		    		  throw new IllegalArgumentException("You must enter number from the range");
		    	  }
		      }
		  }	
	}
}
