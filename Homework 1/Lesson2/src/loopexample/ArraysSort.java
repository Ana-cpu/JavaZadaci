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
			}
		
		//sort and print only first 5 elements
		Arrays.sort(arr, 0, 4);
		System.out.printf("First 5 sorted elements: %s ", Arrays.toString(arr));
	   //number x existing will be added and this class will be modified
		
	}

}
