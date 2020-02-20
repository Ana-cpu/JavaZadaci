package loopexample;

import java.util.Scanner;
//This program performs basic math operations such as :- +,-,*,/
public class CalculatorInLoop {

  static double a;
  static double b;
  private static double x;

  public static double saberi() {
	  return a+b;
  }

  public static double oduzmi() {
	  return a-b;
  }
  
  public static double pomnozi() {
	  return a*b;
  }
  
  public static double podeli() {
	if(b!=0) 
	  x=a/(double)b;
	  return x;
  }
  
  String Mathoperation;

  CalculatorInLoop()

  {
      //you need to remove input and calculation logic from constructor,
      //to avoid running it when constructing this object for testing.
  }

  public void run() {

      getInput();
      double result = doMath(Mathoperation, a, b );

      System.out.println("Your answer is " + result );
  }

  private void getInput() {

      Scanner scannerObject = new Scanner(System.in);

      System.out.println("Enter first number: ");
      a = scannerObject. nextDouble();

      System.out.println("Enter second number: ");
      b = scannerObject. nextDouble();

      Scanner UserInput = new Scanner(System.in);
      System.out.println("\nHere are your options:");
      System.out.println("\n1. Addition, 2. Subtraction, 3. Divison, 4. Multiplication");
      Mathoperation = UserInput.next();
  }
 

  /**
   *@param mathoperation
   */
  public double  doMath(String mathoperation, double a, double b) {

      switch (mathoperation)
      {
      case "1":
          return saberi();

      case "2":
          return oduzmi();

      case "3":
          return pomnozi();

      case "4":
          return podeli();

      default:
          throw new IllegalStateException("mathoperation is not valid");
      }
  }


public static void main(String[] args)

  {
	  String arr[]= {"1", "2", "3", "4"};
	  for(String str : arr) {
		  try {
	      CalculatorInLoop calc = new  CalculatorInLoop();
	      calc.run();
	      }
	  catch (Exception ex) {
		  System.out.println("mathoperation is not valid");
		  break;
	  }
      }
  }
}