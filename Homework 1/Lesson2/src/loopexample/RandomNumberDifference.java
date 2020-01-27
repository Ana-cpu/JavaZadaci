package loopexample;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberDifference {
	RandomNumberDifference(){
	      //you need to remove input and calculation logic from constructor,
	      //to avoid running it when constructing this object for testing.
	}

	 public void run() {
      getInput();
  }
	 
	
	
	public void getInput() {
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

	public static void main(String[] args) {

		  {
			  String [] returnValue= {
					  "Good catch, You were so good:",
					  "Incredible, you enter expected number"
			  };
			  for(String currentString : returnValue) {
				  try {
				 RandomNumberDifference random = new  RandomNumberDifference();
				 random.run();
			      }
			  catch (Exception ex) {
				  System.out.println("More lucky next time");
				  break;
			  }
		      }
		  }
	
	}

}
