package loopexample;

import java.util.Scanner;

public class CalculatorInLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int number1 = input.nextInt();
		System.out.println("You entered " + number1);
		
		System.out.println("Enter number: ");
		int number2 = input.nextInt();
		System.out.println("You entered " + number2);
		
		System.out.println("Enter number operation(+,-,*,/): 1 Sum, 2 Sub, 3 Mul, 4 Div");
		int operation = input.nextInt();
		
		switch(operation) {
		case 1:
			System.out.println("Sum of entered numbers is:" + (number1+number2));
			break;
		case 2 :
			System.out.println("Sub betwen entered numbers is:" + (number1-number2));
			break;
		case 3:
			System.out.println("Mul for entered entered numbers is:" + (number1*number2));
		    break;
			case 4:
				System.out.println("Div for entered numbers is:" + (number1/number2));
				break;
				default:
					System.out.println("Illegal operation");
		}
	

	}
	//for loop will be added

}
