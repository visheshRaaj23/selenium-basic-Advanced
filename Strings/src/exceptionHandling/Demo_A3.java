package exceptionHandling;

import java.util.Scanner;

public class Demo_A3 {

	public static void main(String[] args) {
	
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the value of numberator a");
			int a=scan.nextInt();
			System.out.println("Enter the value of denominator b");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
			System.out.println("Enter the size of the array");
			int size=scan.nextInt();
			int[] arr=new int[size];
			System.out.println("Enter the element");
			int element=scan.nextInt();
			System.out.println("Enter the position at which element to be inserted");
			int pos=scan.nextInt();
			arr[pos]=element;
			System.out.println(arr[pos]);
			
			
		}
		
		
		catch(ArithmeticException ex) {
			System.out.println("Enter non-zero denominator");
		}
		
		catch(NegativeArraySizeException ex) {
			System.out.println("Please enter the positive array values ");
			
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Please provide index with in the range");
		}
		catch(Exception e) {
			System.out.println("Some problem occured");
		}
		
		System.out.println("Connection terminated");

	}

}
