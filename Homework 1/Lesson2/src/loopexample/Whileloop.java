package loopexample;

import java.util.Scanner;

public class Whileloop {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int a = input.nextInt();
		System.out.println("You entered " + a);
		
		System.out.println("Enter number: ");
		int b = input.nextInt();
		System.out.println("You entered " + b);
		int i = b;
		
		
		while(i<=b) {
			if (i%2==0) {
			    System.out.println(i + ",");
			    i++;
		    }
		    System.out.println(i + ",");
		}
		

	}
}
