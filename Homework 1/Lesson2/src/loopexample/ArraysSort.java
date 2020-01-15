// Exception in thread "main" is analyzed:    Array index out of range is caused by : Incompatible Oracle JDBC driver in use by system.
//This is not part of task, but can be reproduced on some environment. Solution is described:
// https://www.ibm.com/support/pages/error-javalangarrayindexoutofboundsexception-array-index-out-range-using-database-conversion-utility

package loopexample;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSort {
	

	public static void main(String[] args) {
        Scanner length = new Scanner(System.in);
		
		System.out.println("Enter length of array: ");
		int lengthA = length.nextInt(); 
		//declares an Array
		int [] arr;
		//allocating memory for length
		arr = new int[lengthA];
		
		
		for (int i=0;i<lengthA;i++) {

			System.out.print("Enter an integer: ");
			int number = length.nextInt();
			//initialize the first element
			arr[i] = number;
			i++;
			}
        //sort array
		Arrays.sort(arr);
		System.out.printf("Modified arr[] : %s", Arrays.toString(arr));
		
		//sort and print only first 5 elements
		Arrays.sort(arr, 0, lengthA);
		System.out.printf("First5 sorted elements: ", Arrays.toString(arr));
	   //number x existing will be added and this class will be modified
	}

}
