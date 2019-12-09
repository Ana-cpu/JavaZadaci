package endava;

import java.util.Scanner;

public class Homework2_1 {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int a = input.nextInt();
		System.out.println("You entered " + a);
		
		System.out.println("Enter number: ");
		int b = input.nextInt();
		System.out.println("You entered " + b);
		int i = b;
		
		
		while(i<a-1 && (i%2==0)) {
			i++;
			System.out.println(i + ",");
			i++;
		}
		if(i%2!=0) {
		System.out.println(i + ",");
		}
		
		
		/*if ((a-b)>0) {
			int i=b;
			while(i<a) {
				if(i%2!=0) {
					System.out.print(i + ", ");
				}
				i++;
			}*/

			/*if((b-a)>0) {
				int i1= a;
				while(i1<b) {
					
					if(a%b!=0) {
						System.out.print(i1 + ", ");
					}
					i1++;
				}
			}*/

			/*if(a == b) {
				if(i%2!=0) {
					System.out.print("There is no expected results");	
				}else {
					System.out.print(i);
					
				}
			}*/

		}
		}

//}
