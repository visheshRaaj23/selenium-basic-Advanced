package exceptionHandling;

import java.util.Scanner;

public class Demo_A4 {

	public void alpha() {
		System.out.println("Connection 4 is terminated");
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the value of numberator a");
			int a=scan.nextInt();
			System.out.println("Enter the value of denominator b");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Error in execution"+e);
			throw e;
		}
	}

}
